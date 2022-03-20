import java.util.ArrayList;
import java.util.Scanner;

public class LoginSignup {
    public static ArrayList<Data> arrli = new ArrayList<Data>();

    
    public void performLogin(){

    }
    public void performSignup(){
        Data da = new Data();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the username");
        String username =sc.nextLine();
        System.out.println("enter the password");
        String password =sc.nextLine();
        System.out.println("enter the email");
        String email =sc.nextLine();
        System.out.println(da.getUsername());
        System.out.println(da.getEmailid());
        System.out.println(da.getPassword());
        arrli.add(da);

        
    }
}
