import java.util.*;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz = sc.nextInt();

        Vector vec = new Vector(sz);

        for (int i=0; i<size; i++){
            vec.addElement(sc.next());
        }

        sc.close();
        System.out.println("Displaying vector values");
        for (int i = 0;i < sz;i++) {
            System.out.println(vec.elementAt(i));            
        }
    }
}