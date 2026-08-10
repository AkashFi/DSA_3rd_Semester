import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.println("Enter arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element u wan to search: ");
        int key = sc.nextInt();

        int loc = -1;
        for(int i=0; i<n; i++) {
            if(arr[i] == key) {
                loc = i;
                System.out.println("Element Exist at index" + i);
                break;
            }
        }
        if(loc == -1) {
            System.out.println("Element not exist");
        }
        sc.close();

    }
}