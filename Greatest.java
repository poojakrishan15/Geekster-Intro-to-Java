import java.util.*;
public class Greatest 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number numbers");
        int n1, n2, n3;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        if(n1>n2 && n1>n3)
        {
            System.out.println("The greatest number is " + n1);
        }
        else if(n2>n3)
        {
            System.out.println("The greatest number is " + n2);
        }
        else
        {
            System.out.println("The greates number is " + n3);
        }
    }
}