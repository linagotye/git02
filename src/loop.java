import java.util.Scanner;

public class loop {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
        System.out.println("are u tired");
        boolean tired = scan.nextBoolean();
        while (!tired){
            System.out.println("awesome");
            System.out.println("are u tired");
            tired=scan.nextBoolean();
        }

    }
}
