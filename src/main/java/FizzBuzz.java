import com.google.common.base.Preconditions;

/**
 * Created by nbenattia on 15/03/2017.
 */
public class FizzBuzz {

    public String process(int input) {
        Preconditions.checkArgument(input >= 1);
        Preconditions.checkArgument(input <= 100);

        if (isMultipleOf3(input) && isMultipleOf5(input)) {
            return "FizzBuzz";
        }
        if (isMultipleOf3(input)) {
            return "Fizz";
        }
        if (isMultipleOf5(input)) {
            return "Buzz";
        }
        return Integer.toString(input);
    }

    private boolean isMultipleOf3(int input) {
        return input % 3 == 0;
    }

    private boolean isMultipleOf5(int input) {
        return input % 5 == 0;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int i=1; i<=100; i++) {
            System.out.println(fizzBuzz.process(i));
        }
    }

}
