package containers;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain = true)
public class ParsedElement {
    private String name;
    private String imageName;
    private String type;
    private String accuracy;
    private String availability;
    private String concealability;
    private String magazine;
    private String rateOfFire;
    private String cartridge;
    private String reliability;
    private String range;
    private String cost;
    private String reference;
    private String length;
    private String country;
    private String description;
}
