import java.util.*;
public class FirstTask {
    public static void main(String[] args) {
        List<String> Users = Arrays.asList("User1", "User2", "User2", "User3", "User4", "User4");
        System.out.println("Входной массив: " + Users);
        System.out.println("Дубликаты: " + getDuplicates(Users));
    }
    public static <A> List<A> getDuplicates(List<A> a) {
        Set<A> duplicates = new HashSet<>();
        for (int i = 0; i < a.size(); i++) {
            A e1 = a.get(i); //
            if (e1 == null) continue;
            for (int j = 0; j < a.size(); j++) {
                if (i == j) continue;
                A e2 = a.get(j);
                if (e1.equals(e2)) {
                    duplicates.add(e2);
                }
            }
        }
        return new ArrayList<>(duplicates);
    }
}