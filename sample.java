import java.util.Scanner;

public class Sample {
 


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LoginSignup ls = new LoginSignup();
       
        
        int ch;
        do{
        System.out.println("main menu");
        System.out.println("\n1.Login \n2.Signin \n3.Exit");
        System.out.println("Enter your choice :");
        ch=sc.nextInt();
        switch (ch){
            case 1:
                ls.performLogin();
                break;
            case 2:
                ls.performSignup();
                break;
            case 3:
                break;

            default:
             System.out.println("enter the correct choice");
        }
       
    }while(ch!=3);
    ls.printUsers();
}
}

  


        
    
    
