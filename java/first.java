import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        int[] A = new int[10];
        int sum = 0;
        int arf = 0;
        System.out.print("Введитецелоечисло: ");
        for(int i=0;i<10;i++) {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            A[i] = num;
        }
        for(int i=0;i<10;i++){
            sum = sum + A[i];
        }
        for(int i=0;i<10;i++) {
            System.out.println(A[i]);
        }
        System.out.println("Cумма " + sum);
        System.out.println("Сред.аримф " + sum/10);

    }
}

