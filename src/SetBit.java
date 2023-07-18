import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aBit = scanner.nextInt();

        int bBit = scanner.nextInt();
        int output = 0;
        output = output | 1 << aBit;
        output = output | 1 << bBit;

        System.out.println(output);
    }


}
