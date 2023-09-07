import java.util.Scanner;

public class therd {
    public static void main(String[] args) {
        int num, result = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        num = in.nextInt();
        for(int i = 1;i< num + 1 ;i++){
            result *= i;
        }
        System.out.println(result);
    }
}
