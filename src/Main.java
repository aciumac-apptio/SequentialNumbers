import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //sequentialDigits(12,123);
        sequentialDigits(1000,
                13000);
    }

    public static List<Integer> sequentialDigits(int lowEnd, int highEnd) {
        List<Integer> list = new ArrayList<>();
        if (lowEnd < 10) {
            list.add(0);
            return list;
        }

        // Build intial value
        int testVal = 1;
        int modVal = 1;
        while (testVal < lowEnd) {
            testVal = testVal * 10 + (testVal % 10 + 1);
            modVal *= 10;
        }

        int initial = testVal;
        while (testVal <= highEnd) {
            while (testVal <= highEnd && testVal % 10 != 9) {
                list.add(testVal);
                testVal = testVal % modVal;
                testVal = testVal * 10 + (testVal % 10 + 1);
            }

            initial = initial * 10 + (initial % 10 + 1);
            testVal = initial;
            modVal *= 10;
        }
        return list;

    }
}
