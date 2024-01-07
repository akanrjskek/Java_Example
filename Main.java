import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        int[] a;
        a = list.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(a));

    }
}
