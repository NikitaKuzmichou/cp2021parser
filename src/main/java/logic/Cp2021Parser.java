package logic;

import containers.ParsedElement;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static logic.ParsingConstants.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Cp2021Parser {

    public static List<ParsedElement> parseByUrl(final String url) {
        final Document document;
        try {
            document = Jsoup.connect(url).get();
        } catch (IOException var3) {
            throw new RuntimeException("Error on connecting by url", var3);
        }

        return document.select("table[class=e] > tbody").stream()
                .map(Cp2021Parser::collectElement)
                .collect(Collectors.toList());
    }

    private static ParsedElement collectElement(final Element row) {
        final ParsedElement parsedElement = new ParsedElement();
        parsedElement.setName(row.select("td[class=b]").first().text());
        parsedElement.setImageName(row.select("img").attr("src"));
        fillEssentialInformation(parsedElement, row);
        parsedElement.setDescription(row.select("td[class=d]").text());

        return parsedElement;
    }

    private static void fillEssentialInformation(final ParsedElement parsedElement, final Element row) {
        final Elements essentialInfo = row.select("td[class=b] > table[class=f] > tbody > tr");
        fillParsedElementFromClColumn(parsedElement, essentialInfo.select("td[class=cl]"));
        fillParsedElementFromCrColumn(parsedElement, essentialInfo.select("td[class=cr]"));
    }

    private static void fillParsedElementFromClColumn(final ParsedElement parsedElement, final Elements clColumn) {
        final String rawText = clColumn.text();
        final int typeInd = rawText.indexOf(TYPE);
        final int accuracyInd = rawText.indexOf(ACCURACY);
        final int availabilityInd = rawText.indexOf(AVAILABILITY);
        final int concealabilityInd = rawText.indexOf(CONCEALABILITY);
        final int magazineInd = rawText.indexOf(MAGAZINE);
        final int rofInd = rawText.indexOf(RATE_OF_FIRE);

        parsedElement.setType(rawText.substring(typeInd + TYPE.length(), accuracyInd))
                .setAccuracy(rawText.substring(accuracyInd + ACCURACY.length(), availabilityInd))
                .setAvailability(rawText.substring(availabilityInd + AVAILABILITY.length(), concealabilityInd))
                .setConcealability(rawText.substring(concealabilityInd + CONCEALABILITY.length(), magazineInd))
                .setMagazine(rawText.substring(magazineInd + MAGAZINE.length(), rofInd))
                .setRateOfFire(rawText.substring(rofInd + RATE_OF_FIRE.length()));
    }

    private static void fillParsedElementFromCrColumn(final ParsedElement parsedElement, final Elements crColumn) {
        final String rawText = crColumn.text();
        final int cartridgeInd = rawText.indexOf(CARTRIDGE);
        final int reliabilityInd = rawText.indexOf(RELIABILITY);
        final int rangeInd = rawText.indexOf(RANGE);
        final int costInd = rawText.indexOf(COST);
        final int referenceInd = rawText.indexOf(REFERENCE);
        final int lengthInd = rawText.indexOf(LENGTH);
        final int countryInd = rawText.indexOf(COUNTRY);

        parsedElement.setCartridge(rawText.substring(cartridgeInd + CARTRIDGE.length(), reliabilityInd))
                .setReliability(rawText.substring(reliabilityInd + RELIABILITY.length(), rangeInd))
                .setRange(rawText.substring(rangeInd + RANGE.length(), costInd))
                .setLength(rawText.substring(lengthInd + LENGTH.length(), countryInd))
                .setCountry(rawText.substring(countryInd));

        if (referenceInd == -1) {
            parsedElement.setCost(rawText.substring(costInd + COST.length(), lengthInd));
        } else {
            parsedElement.setCost(rawText.substring(costInd + COST.length(), referenceInd))
                    .setReference(rawText.substring(referenceInd + REFERENCE.length(), lengthInd));
        }

    }
}
