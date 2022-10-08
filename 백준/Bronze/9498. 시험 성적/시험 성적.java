import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Score: ");
        int score = sc.nextInt();
        sc.close();

        System.out.print((score>=90)? "A": (score>=80)? "B": (score>=70)? "C": (score>=60)? "D": "F");
    }
}
