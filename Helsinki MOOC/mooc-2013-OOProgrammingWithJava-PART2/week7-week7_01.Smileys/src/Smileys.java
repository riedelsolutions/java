
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
        printWithSmileys("Mikael");
        printWithSmileys("Stradivarius");
    }

  /*  private static void printWithSmileys(String characterString) {

        int amountOfSmileys;

        if (characterString.length() % 2 == 1) {
            characterString = " " + characterString + " ";

        } else {

        }
        
        amountOfSmileys = (characterString.length() / 2) + 2;

        for (int i = 1; i < amountOfSmileys + 2; i++) {
            System.out.print(":)");
        }

        System.out.println("");
        
        if (characterString.contains(" ")) {
            System.out.print(":)" + characterString + ":)" + "\n");
        }else if (!characterString.length()%2 == 0 && characterString.contains(" ")){
            System.out.print(":)  " + characterString + "  :)" + "\n");
        } 
        else {
            System.out.print(":)"+ " " + characterString + " :)" + "\n");
        }
        //System.out.println("");

        for (int i = 1; i < amountOfSmileys + 2; i++) {
            System.out.print(":)");
        }
      //  System.out.println("");

    }*/
       private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        boolean odd;

        if (length % 2 != 0) {
            odd = true;
        } else {
            odd = false;
        }

        printLine(length, odd);
        printText(length, odd, characterString);
        printLine(length, odd);
    }

    private static void printOne() {
        System.out.print(":)");
    }

    private static void printLine(int length, boolean odd) {
        int smileyLength = lengthOfTextSmileys(length, odd) + 2;

        for (int count = 0; count < smileyLength; count++) {
            printOne();
        }

        System.out.println();   // go to next line after done printing smileys
    }

    private static void printText(int length, boolean odd, String characterString) {
        printOne();   // bookend text with smileys

        System.out.print(" ");   // bookend text (and spaces) with a space before smileys

        System.out.print(characterString);

        if (odd) {
            System.out.print(" ");
        }

        System.out.print(" ");   // bookend text with a space before smileys

        printOne();   // bookend text (and spaces) with smileys

        System.out.println();
    }


    private static int lengthOfTextSmileys(int length, boolean odd) {
// if boolean odd is true, add one to length, then return length divided by 2 (because each smiley is 2 chars long)
        if (odd) {
            length += 1;
        }
        return (length / 2) + 1;  // the +1 is to account for the " " spaces bookending the text on printText(). Two spaces = 1 smiley
    }

}
