import java.util.ArrayList;
import java.util.List;

public class Fizz_buzz {

}

class Fizz_buzzSolution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String value = null;
            if (i % 3 == 0 && i % 5 == 0) {
                value = "FizzBuzz";
            } else if (i % 3 == 0) {
                value = "Fizz";
            } else if (i % 5 == 0) {
                value = "Buzz";
            } else {
                value = "" + i;
            }
            list.add(value);
        }
        return list;
    }
}
