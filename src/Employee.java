import java.util.Random;
import java.util.Scanner;

public class Employee {
		String FirstName;
		String LastName;
		//constructor
		Employee(String Fname,String Lname){
		FirstName = Fname;
		LastName = Lname;
		}


		private static char[] generatePassword(int length) {
		      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		      String specialCharacters = "!@#$";
		      String numbers = "1234567890";
		      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		      Random random = new Random();
		      char[] password = new char[length];

		      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		      password[3] = numbers.charAt(random.nextInt(numbers.length()));
		   
		      for(int i = 4; i< length ; i++) {
		         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		      }
		      return password;
		}

		static void showCredentials(int num, String FirstName, String LastName)
		{

		    System.out.println("Dear " +FirstName+ " your generated credentials are as follows");
		    String Fname=FirstName;
		    String Lname=LastName;
		    String Fn=Fname.toLowerCase();
		    String Ln=Lname.toLowerCase();
		   
		    if(num==1)
		    {
		     System.out.println("Email --->" +Fn+Ln+  "@tech.abc.com");
		    }
		    if(num==2)
		    {
		     System.out.println("Email --->" +Fn+Ln+  "@admin.abc.com");
		    }
		     if(num==3)
		    {
		     System.out.println("Email --->" +Fn+Ln+ "@hr.abc.com");
		    }
		     if(num==4)
		    {
		     System.out.println("Email --->" +Fn+Ln+ "@legal.abc.com");
		    }
		    
		    System.out.println("Password --->"+generatePassword(8));
		      
		    
		  
		}

		public static void main(String args[])
		{
		    try (Scanner inp = new Scanner(System.in)) {
				System.out.println("Please enter the department from the following ");
   
				System.out.println("1. Technical ");
				System.out.println("2. Admin ");
				System.out.println("3. Human Resource ");
				System.out.println("4. Legal ");
				int a=inp.nextInt();

 //Employee Obj= new Employee();
 showCredentials(a,"Prav", "een");
//Employee Obj1= new Employee("Prav" , "een");
//Employee Obj1 = new Employee();
			}


		}
		}




