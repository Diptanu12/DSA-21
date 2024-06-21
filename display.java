import java.util.Scanner;

public class display {
    public static void main(String[] args) {
        display();
    }
    static void display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name : ");
        String name=sc.nextLine();
        System.out.println(name + " Good Moring");
    }
}
