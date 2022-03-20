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
        da.setUsername(username);
        System.out.println("enter the password");
        String password =sc.nextLine();
        da.Setpassword(password);
        System.out.println("enter the email");
        String emailid =sc.nextLine();
        da.setEmailid(emailid);
        //System.out.println(da.getUsername());
       // System.out.println(da.getEmailid());
       // System.out.println(da.getPassword());
        arrli.add(da);

        
    }
    public void printUsers(){
        for (Data data : arrli) {
            System.out.println(data.getUsername());
        }
    }
}
