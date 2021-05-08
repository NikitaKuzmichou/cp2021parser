package storage;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain = true)
public class Link {
    private String link;
    private String name;

    public String toString() {
        return String.format("Name: %s%nLink: %s%n", this.name, this.link);
    }
}
