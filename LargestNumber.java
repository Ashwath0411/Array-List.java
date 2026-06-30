import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size :");
        int n = sc.nextInt();

        int [] arr = new int[n];


        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element");
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
