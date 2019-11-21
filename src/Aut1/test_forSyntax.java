import java.util.ArrayList;
import java.util.List;

public class test_forSyntax {
    public static void main(String[] args){

        List l = new ArrayList();
        l.add("one");
        l.add("two");

        System.out.println("------------------------");
        System.out.println("With for (Object e : l)");
        for (Object e : l){
            System.out.println(e);
        }

        System.out.println("------------------------");
        System.out.println("With While");
        int k = 0;
        while (k < l.size()) {
            System.out.println(l.get(k));
            k++;
        }
    }
}