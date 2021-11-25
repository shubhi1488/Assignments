/*
WAP that takes as input the size of the array and the elements int the array .
The program then ask the user to enter the particular index and prints the element at that index .
Index starts from zero. This program may generate Array out of Bounds exceptions .
Use exception handling mechanisms to handle this exceptions.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the arrays");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements in the array");
        try {
            for (int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            System.out.println("enter the index");
            int index=sc.nextInt();
            System.out.println("index is"+index+"="+arr[index]);
            System.out.println("The array element successfully accessed");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        sc.close();
    }

}
