import java.util.Arrays;

public class changevalueexample {
    public static void main(String[] args) {
        //create and array
        int arr[]={1,2,3,45,6};
change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int nums[]){
        nums[0]=99;
        nums[3]=199;
    }
}
