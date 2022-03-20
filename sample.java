import java.util.Scanner;

public class Sample {
 
public void login(){
   System.out.println();
}
public void signin(){
   System.out.println();
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       
        Sample sa = new Sample();
        System.out.println("main menu");
        System.out.println("\n1.Login \n2.Signin \n3.Exit");
        System.out.println("Enter your choice :");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                sa.login();
                break;
            case 2:
                sa.signin();
                break;
            case 3:
                break;

            default:
             System.out.println("enter the correct choice");
        }


        }
    }
    
