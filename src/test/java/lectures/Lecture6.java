package lectures;


import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.function.Predicate;
import org.junit.Test;

public class Lecture6 {

  final Predicate<Integer> numbersLessThan10 = n -> n > 5 && n < 10;

  @Test
  public void findAny() throws Exception {
    //koşulu sağlayan herhangi değeri getirir. paralel çalışarak daha performanslı arama yapabilir find first en baştan başlayıp tek tek kontrol eder.
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Integer i = Arrays.stream(numbers).filter(numbersLessThan10).findAny().get();
    System.out.println(i);
  }

  @Test
  public void findFirst() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Integer i = Arrays.stream(numbers).filter(numbersLessThan10).findFirst().get();
    System.out.println(i);
  }
}

