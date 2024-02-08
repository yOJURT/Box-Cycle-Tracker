import java.util.ArrayList;
import java.util.Collections;
public class Bo1BoxRegistry {
    public static final ArrayList<String> KINO_BOXES = new ArrayList<>();
    public static final ArrayList<String> FIVE_BOXES = new ArrayList<>();
    public static final ArrayList<String> ASCENSION_BOXES = new ArrayList<>();
    public static final ArrayList<String> COTD_BOXES = new ArrayList<>();
    public static final ArrayList<String> SHANG_BOXES = new ArrayList<>();
    public static final ArrayList<String> MOON_BOXES = new ArrayList<>();
    public static final ArrayList<String> VERRUCKT_BOXES = new ArrayList<>();
    public static final ArrayList<String> SNN_BOXES = new ArrayList<>();
    public static final ArrayList<String> RIESE_BOXES = new ArrayList<>();

    static {
        Collections.addAll(KINO_BOXES,"Spawn Box","Mule Kick Box","Speed Cola Box","Dressing Room Box",
                "Stage Box", "Middle Box","MPL Box","Alley Box","Hellroom Box");
        Collections.addAll(FIVE_BOXES,"");
        Collections.addAll(ASCENSION_BOXES,"Spawn Box","Lander Box","Stam Box","Stam Lander Box",
                "Power Box","Sickle Box","Pap Box","Mule Kick Box");
        Collections.addAll(COTD_BOXES,"Spawn Box","Mule Kick Box","Top Lighthouse Box","Bottom Lighthouse Box",
                "Front Lighthouse Box");
        Collections.addAll(SHANG_BOXES,"Spawn Box","AK74U Box","Waterfall Box","Power Box");
        Collections.addAll(MOON_BOXES,"Spawn Box","Bio-Dome Box","Power Box","Teleporter Box");
        Collections.addAll(VERRUCKT_BOXES,"Dt Box","Jug Box","Tommy Box","Power Box");
        Collections.addAll(SNN_BOXES,"Bottom Middle Box","Top Middle Box","Storage Box","Comm Room Box",
                "Doctors Quarters Box","Fishing Hut Box");
        Collections.addAll(RIESE_BOXES,"");
    }
}
