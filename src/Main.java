
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("First");
        names.add("Second");
        names.add("Second");

        System.out.println(returnSize(names));
    }

    public static int returnSize(Set<String> names){
        return names.size();

    }
}

