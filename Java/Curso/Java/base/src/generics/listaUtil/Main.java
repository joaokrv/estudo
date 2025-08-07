package generics.listaUtil;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C#", "Go", "Kotlin");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String ultimaLang1 = (String) UtilList.getUltimo(langs);
        System.out.println(ultimaLang1);

        String ultimaLang2 = UtilList.getUltimo2(langs);
        System.out.println(ultimaLang2);

        Integer ultimoNum = (Integer) UtilList.getUltimo(nums);
        System.out.println(ultimoNum);

        // Integer ultimoNum2 = UtilList.<Integer>getUltimo2(langs); -> NAO FUNCIONA
        // System.out.println(ultimoNum2);

        Integer ultimoNum2 = UtilList.getUltimo2(nums);
        System.out.println(ultimoNum2);
    }
}
