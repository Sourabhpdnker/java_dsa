import java.util.*;

public class Arraysinputoutput {
    public static void main(String[] args) {
        int marks[] = new int[100];
        System.out.println("length of array is : "+marks.length);

        System.out.println("Enter your 3 subject marks : ");
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy marks : "+marks[0]);
        System.out.println("Phy marks : "+marks[1]);
        System.out.println("Phy marks : "+marks[2]);

        //persentage

        float persentage = (marks[0]+marks[1]+marks[3])/3;
        System.out.println("persntage of this 3 subjects is "+persentage+"%");
    }
}
