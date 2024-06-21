import java.util.Scanner;

public class AmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
        //boolean ans=isArmstrong(n);
       // System.out.println(ans);
        for(int i=0;i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }

    }
    static  boolean isArmstrong(int n){
        int org=n;
        int sum=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            n/=10;
            sum+=rem*rem*rem;
        }
        return sum==org;
    }
}
