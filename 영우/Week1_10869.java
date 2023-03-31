import java.util.*;
public class Main {
    void cal(int A, int B) {
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.print(A%B);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main main = new Main();
        int A = scan.nextInt();
        int B = scan.nextInt();
        main.cal(A,B);
    }
}
