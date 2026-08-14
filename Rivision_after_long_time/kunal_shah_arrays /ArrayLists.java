import java.util.*;

public class ArrayLists {
    public static void main(String[] args){
        //syntsx 
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(scan.nextInt());
        }
        System.out.print(list);
        for(int a : list){
            System.out.print(a);
        }
    }
}
