import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        for(int i = 0; i< n; i++){
            int price = sc.nextInt();
            int num  =sc.nextInt();

            x = x -(price * num);
        }
        if(x == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}