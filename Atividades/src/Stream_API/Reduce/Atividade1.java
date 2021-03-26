package Stream_API.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Atividade1 {
    public static void main(String[] args) {
        Consumer<Object> println = System.out::println;
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        int total1 = nums.parallelStream().reduce(soma).get();
        System.out.println(total1);

        Integer total2 = nums.stream().reduce(100, soma);
        System.out.println(total2);//145

        nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(println);//30
    }
}
