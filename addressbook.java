import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class AddressBook {

	public static boolean firstName(String firstname) {

	        String pattern1="^[A-Z]{1}[A-Z a-z]{2,}$";
	        Predicate<String> predicate=p->p.matches(pattern1);
	        boolean value=predicate.test(firstname);
	        return value;
	}

        public static boolean lastName(String lastname) {

	        String pattern2="^[A-Z]{1}[A-Z a-z]{2,}$";
	        Predicate<String> predicate=p->p.matches(pattern2);
	        boolean value=predicate.test(lastname);
	        return value;
	}

        public static boolean emailId(String emailId) {

	        String pattern3="^[A-Z a-z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]{2,3}([.][a-z A-Z]{2})*$";
	        Predicate<String> predicate=p->p.matches(pattern3);
	        boolean value=predicate.test(emailId);
	        return value;
        }


        public static boolean phoneNumber(String phoneNumber) {

	        String pattern4="^[+][0-9]{1,}\\s?[1-9]{1}[0-9]{9}$";
	        Predicate<String> predicate=p->p.matches(pattern4);
	        boolean value=predicate.test(phoneNumber);
	        return value;
        }

        public static boolean Password(String password) {

	        String pattern5="^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*[A-Z]{1,})(?=.*[0-9]{1,})(?=.*[!@#$%^&*();:]{1,}).*$";
	        Predicate<String> predicate=p->p.matches(pattern5);
	        boolean value=predicate.test(password);
	        return value;
        }


        public static void main(String[] args) {

            User u=new User();
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the FirstName: ");
            String first_name=sc.nextLine();

            System.out.println("Enter the LastName: ");
            String last_name=sc.nextLine();

            System.out.println("Enter the EmailId: ");
            String email_Id=sc.nextLine();

            System.out.println("Enter the PhoneNumber: ");
            String phone_numb=sc.nextLine();

            System.out.println("Enter the Password: ");
            String password=sc.nextLine();


            u.setFirstName(first_name);
            u.setLastName(last_name);
            u.setEmailId(email_Id);
            u.setPhoneNumber(phone_numb);
            u.setPassword(password);

            System.out.println(u.getFirstName()+":"+firstName(u.getFirstName()));
            System.out.println(u.getLastName()+":"+lastName(u.getLastName()));
            System.out.println(u.getEmailId()+":"+emailId(u.getEmailId()));
            System.out.println(u.getPhoneNumber()+":"+phoneNumber(u.getPhoneNumber()));
            System.out.println(u.getPassword()+":"+Password(u.getPassword()));
       }
}
class User
{

    private String firstname;
    private String lastname;
    private String emailId;
    private String phoneNumber;
    private String password;

    public String getFirstName() {
      return firstname;
    }

    public void setFirstName(String firstname) {
      this.firstname=firstname;
    }

     public String getLastName() {
      return lastname;
    }

    public void setLastName(String lastname) {
      this.lastname=lastname;
    }

     public String getEmailId() {
      return emailId;
    }

    public void setEmailId(String emailId) {
      this.emailId=emailId;
    }

     public String getPhoneNumber() {
      return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber=phoneNumber;
    }
     public String getPassword() {
      return password;
    }

    public void setPassword(String password) {
      this.password=password;
    }
}

