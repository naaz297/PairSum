import java.util.Scanner;
public class pair {
    static int pairSum(int[]arr,int target){
        int n=arr.length;
        int ans=0;
        for(int i= 0;i<n; i++){
            for(int j=i+1; j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }

        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter"+n+"element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target value");
        int target=sc.nextInt();
        System.out.println(pairSum(arr,target));

    }


}
