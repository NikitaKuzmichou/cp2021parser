package containers;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @Accessors(chain = true)
public class ParsedLink {

    private List<ParsedElement> parsedElements;
    private String linkName;

    public ParsedLink() {
        this.parsedElements = new ArrayList();
    }

    public void addParsedObject(final ParsedElement element) {
        this.parsedElements.add(element);
    }
}
