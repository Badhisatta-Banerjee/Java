import java.util.Scanner;

public class Ass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[2];
        for(int i=0;i<2;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.print("Reverse = ");
        for(int i=1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
