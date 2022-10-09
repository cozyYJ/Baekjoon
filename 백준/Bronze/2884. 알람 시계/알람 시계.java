import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int h, m;
        Scanner sc = new Scanner(System.in);

        h = sc.nextInt();
        m = sc.nextInt();
        sc.close();

        if(m-45 < 0) {
            if(h == 0)
                h = 23;
            else
                h--;
            m += 15;
        }
        else {
            m = m-45;
        }
        System.out.println(h+" "+m);
    }
}
