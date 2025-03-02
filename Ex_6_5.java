import java.util.Scanner;
import java.util.Arrays;
public class Ex_6_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        Arrays.sort(arr);
        System.out.print("Sorted array: ");
        for (int a: arr){
            System.out.print(a + " ");
            sum += a;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
        double avg = (double)sum / n;
        System.out.println("Average: " + avg);
        sc.close();
    }
}
