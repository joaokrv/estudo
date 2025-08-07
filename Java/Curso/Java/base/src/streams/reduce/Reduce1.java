package streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 6, 8, 10);

        BinaryOperator<Integer> soma = (acumulador, n) -> acumulador + n;

        int total = nums.stream().reduce(soma).get(); // função terminadora assim com o forEach
        System.out.println(total);

        Integer total2 = nums.stream().reduce(0, soma);
        System.out.println(total2);

        // Resultado = Opcional<Integer>
        nums.stream()
                .filter(n -> n > 2)
                .reduce(soma)
                .ifPresent(System.out::println);

    }
}
