package MockTest;

public class MainTester {
    public static void main(String[] args) {

        // P1 test
        String brak = "[[{}][]](({}){})";
        String brak2 = "[[[ ]])";
        String brak3 = "()[]{}-";
        String brak4 = "[][][]";
        System.out.println(Lab05P1Wrapper.balancedBrackets(brak));
        System.out.println(Lab05P1Wrapper.balancedBrackets(brak2));
        System.out.println(Lab05P1Wrapper.balancedBrackets(brak3));
        System.out.println(Lab05P1Wrapper.balancedBrackets(brak4));

        // P2 Test
        int[] test1 = {};
        int[] test2 = {};
        int[] test3 = {};
        int[] test4 = {};
        System.out.println(Lab05P2Wrapper.stackSort(test1));
    }
}
