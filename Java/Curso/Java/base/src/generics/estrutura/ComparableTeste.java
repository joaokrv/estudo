package generics.estrutura;

import java.util.TreeSet;

public class ComparableTeste {
    public static void main(String[] args) {

        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(10);
        nums.add(-1);
        nums.add(6);

        for (Integer n: nums) {
            System.out.println(n);
        }
    }
}
