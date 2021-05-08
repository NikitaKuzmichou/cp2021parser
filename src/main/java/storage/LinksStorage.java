package storage;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @Accessors(chain = true)
public class LinksStorage {

    private List<Link> links;
    public static final String BASE_URL = "http://irc.liber-mundi.org/";

    public LinksStorage() {
        this.links = new ArrayList();
        this.initLinks();
    }

    private void initLinks() {
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=2&action=show&lng=us")
                .setName("CONTEMPORARY PISTOLS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=3&action=show&lng=us")
                .setName("CONTEMPORARY REVOLVERS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=4&action=show&lng=us")
                .setName("SMALL HANDGUNS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=5&action=show&lng=us")
                .setName("MEDIUM HANDGUNS AND REVOLVERS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=6&action=show&lng=us")
                .setName("WONDERNINES"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=7&action=show&lng=us")
                .setName("HEAVY PISTOLS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=8&action=show&lng=us")
                .setName("HEAVY REVOLVERS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=9&action=show&lng=us")
                .setName("SHOT HANGUNS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=11&action=show&lng=us")
                .setName("CONTEMPORARY ASSAULT RIFLES"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=13&action=show&lng=us")
                .setName("ASSAULT RIFLES"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=14&action=show&lng=us")
                .setName("HEAVY ASSAULT RIFLES"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=16&action=show&lng=us")
                .setName("CONTEMPORARY SHOTGUNS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=17&action=show&lng=us")
                .setName("SINGLE SHOT AND SEMI-AUTOMATIC SHOTGUNS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=18&action=show&lng=us")
                .setName("AUTOMATIC SHOTGUNS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=20&action=show&lng=us")
                .setName("CONTEMPORARY RIFLES"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=21&action=show&lng=us")
                .setName("CONTEMPORARY SNIPER RIFLES"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=22&action=show&lng=us")
                .setName("SNIPER RIFLES"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=23&action=show&lng=us")
                .setName("CARBINES AND OTHER RIFLES"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=25&action=show&lng=us")
                .setName("CONTEMPORARY SUBMACHINE GUNS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=26&action=show&lng=us")
                .setName("LIGHT SUBMACHINE GUNS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=27&action=show&lng=us")
                .setName("MEDIUM SUBMACHINE GUNS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=29&action=show&lng=us")
                .setName("VERY HEAVY SUBMACHINE GUNS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=28&action=show&lng=us")
                .setName("HEAVY SUBMACHINE GUNS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=31&action=show&lng=us")
                .setName("CONTEMPORARY LIGHT MACHINEGUNS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=32&action=show&lng=us")
                .setName("CONTEMPORARY HEAVY MACHINEGUNS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=33&action=show&lng=us")
                .setName("LIGHT MACHINEGUNS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=34&action=show&lng=us")
                .setName("HEAVY MACHINEGUNS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=36&action=show&lng=us")
                .setName("LIGHT ROCKET LAUNCHERS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=37&action=show&lng=us")
                .setName("HEAVY ROCKET LAUNCHERS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=38&action=show&lng=us")
                .setName("MISSILES LAUNCHERS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=39&action=show&lng=us")
                .setName("CONTEMPORARY HEAVY SNIPER RIFLES"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=40&action=show&lng=us")
                .setName("HEAVY SNIPER RIFLES"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=41&action=show&lng=us")
                .setName("CONTEMPORARY GRENADE LAUNCHERS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=42&action=show&lng=us")
                .setName("GRENADE LAUNCHERS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=43&action=show&lng=us")
                .setName("BORG AND ACPA HANDGUNS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=44&action=show&lng=us")
                .setName("BORG AND ACPA HEAVY WEAPONS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=45&action=show&lng=us")
                .setName("FLAME THROWERS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=47&action=show&lng=us")
                .setName("CUSTOM-MADE WEAPONS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=48&action=show&lng=us")
                .setName("NON LETHAL WEAPONS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=49&action=show&lng=us")
                .setName("DART GUNS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=50&action=show&lng=us")
                .setName("BEAM WEAPONS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=51&action=show&lng=us")
                .setName("BOWS AND CROSSBOWS"));
        this.links.add(new Link()
                .setLink("http://irc.liber-mundi.org/weapons.php?cat=52&action=show&lng=us")
                .setName("OTHER WEIRD GADGETS"));
    }
}
