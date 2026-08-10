import java.util.Scanner;

public class InsertElemenet {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter arr1["+i+"]: ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter size of second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for(int i=0; i<m; i++) {
            System.out.print("Enter arr2["+i+"]: ");
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[n+m];
        System.out.println("Combining array is: ");
        for(int i=0; i<n+m; i++) {
            if(i<n) {
                arr3[i] = arr1[i];
            }
            else {
                arr3[i] = arr2[i-n];
            }
            System.out.println(arr3[i]+"\t");
        }
        System.out.println("What you want to do");
        System.out.println("Enter your choice: ");
        System.out.println("1.Insert new element\n2.Delete an element\n3.Search an element");
        int choice = sc.nextInt();
        switch(choice) {
            case 2:
                System.out.println("1.At start");
                System.out.println("2.At index");
                System.out.println("3.At end");

                int insertchoice  = sc.nextInt();
                switch(insertchoice) {
                    case 1:
                        for(int i=0; i<n+m; i++) {
                            System.out.println(arr3[i]+"\t");
                        }
                    case 2:
                        System.out.println("Enter index");
                        int element = sc.nextInt();
                        for(int i=0; i<n+m; i++) { 
                            if(i == element) {
                                continue;
                            }
                            System.out.print(arr3[i]+"\t");
                        }
                        

                }



        }
        sc.close();


    }
}
