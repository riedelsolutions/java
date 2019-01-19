
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String, String> namesAndNicknames = new HashMap<String, String>();
        namesAndNicknames.put("matti", "mage");
        namesAndNicknames.put("mikael", "mixu");
        namesAndNicknames.put("arto", "arppa");

        System.out.println(namesAndNicknames.get("mikael"));
    }

}
