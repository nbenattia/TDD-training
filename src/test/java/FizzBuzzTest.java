import com.sun.tools.javac.comp.DeferredAttr;
import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by nbenattia on 15/03/2017.
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();


    @Test
    public void should_return_the_given_input_when_input_not_multiple_of_3_nor_5() {
        // Arrange

        // Act

        // Assert
        Assertions.assertThat(fizzBuzz.process(1)).isEqualTo("1");
        Assertions.assertThat(fizzBuzz.process(2)).isEqualTo("2");
        Assertions.assertThat(fizzBuzz.process(7)).isEqualTo("7");
    }

    @Test
    public void should_return_fizz_when_input_is_multiple_of_3() {
        // Arrange

        // Act

        // Assert
        Assertions.assertThat(fizzBuzz.process(3)).isEqualTo("Fizz");
        Assertions.assertThat(fizzBuzz.process(6)).isEqualTo("Fizz");
        Assertions.assertThat(fizzBuzz.process(9)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_buzz_when_input_is_multiple_of_5() {
        // Arrange

        // Act

        // Assert
        Assertions.assertThat(fizzBuzz.process(5)).isEqualTo("Buzz");
        Assertions.assertThat(fizzBuzz.process(10)).isEqualTo("Buzz");
        Assertions.assertThat(fizzBuzz.process(20)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_fizzbuzz_when_input_is_multiple_of_3_and_5(){
       // Arrange

       // Act

       // Assert
        Assertions.assertThat(fizzBuzz.process(15)).isEqualTo("FizzBuzz");
        Assertions.assertThat(fizzBuzz.process(30)).isEqualTo("FizzBuzz");
        Assertions.assertThat(fizzBuzz.process(45)).isEqualTo("FizzBuzz");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_if_input_is_lesser_than_1(){
       // Arrange

       // Act
        fizzBuzz.process(0);

       // Assert

    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_if_input_is_greater_than_100(){
       // Arrange

       // Act
        fizzBuzz.process(101);

       // Assert

    }


}
