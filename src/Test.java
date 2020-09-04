import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.addAll(Arrays.asList(1, 2, 3, 4));
        set2.addAll(Arrays.asList(3, 4, 5, 6));

        // union
        // set1.addAll(set2);

        // intersection - fællesmængden
        // set1.retainAll(set2);

        // difference
        // set1.removeAll(set2);

        // superset / subset
        System.out.println(set1.containsAll(set2));

        System.out.println(set1);
    }


}
