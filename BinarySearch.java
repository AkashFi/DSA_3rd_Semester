import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.println("Enter arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element u want to search: ");
        int key = sc.nextInt();
        int beg=0;
        int end=n-1;
         int loc = -1;

        while(beg<=end) {
            int mid = (beg+end)/2;
            if(arr[mid] == key) {
                loc = mid;
                System.out.println("Element Exist at index" +loc);
                break;
            }
            else if(arr[mid] > key) {
                end= mid-1;
            }
            else {
                beg = mid+1;
            }
        }
        if(loc == -1) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}