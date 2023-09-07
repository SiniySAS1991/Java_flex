import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class second {
    public static void main(String[] args) {
        int[] A = new int[10];
        int n1 = 0;
        int n2 = 0;
        int sum1 = 0;
        int sum2 = 0;
        System.out.print("Введитецелоечисло: ");
        for(int i=0;i<10;i++) {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            A[i] = num;
        }
        do{
            sum1 = sum1 + A[n1];
            n1 = n1 + 1;
        }while(n1!= 10);
        while(n2!= 10){
            sum2 = sum2 + A[n2];
            n2 = n2 + 1;
        }
        System.out.println("Sum doW: "+sum1);
        System.out.println("Sum W: "+sum2);
        System.out.println(Arrays.stream(A).max().getAsInt());
        System.out.println(Arrays.stream(A).min().getAsInt());
    }
}
