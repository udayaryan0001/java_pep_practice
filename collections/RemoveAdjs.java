import java.util.Scanner;

public class RemoveAdjs{

    public static int removeDuplicates(int[] arr, int n) {

        if (n == 0 || n == 1)
            return n;

        int i = 0; 
        for (int j = 1; j < n; j++) {  
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int newLength = removeDuplicates(arr, n);
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
