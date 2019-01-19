
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!

    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 0; i < 100; i++) {
            Suitcase oneSuitcase = new Suitcase(100);
            Thing brick = new Thing("Brick", (i + 1));
           
            oneSuitcase.addThing(brick);
            
            container.addSuitcase(oneSuitcase);

        }

    }
}
    