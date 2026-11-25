import java.util.Scanner;

public class Ass7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array values: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        
        int a=-1,temp;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                a++;
                temp=arr[a];
                arr[a]=arr[i];
                arr[i]=temp;
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
