package CarAssignment;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String name, gender;
		int age, ic, downpayment;
		
		System.out.println("Details of Customer");
		
		//for loop
		for(int i = 0; i < 1; i++) {
		System.out.print("Enter Your Name: ");
		name = input.next();
		i++;
		}
		
		System.out.print("Enter Your I/C Number: ");
		ic = input.nextInt();
		System.out.println("IC Number: " + ic);
		
		//do while loop
		int k = 0;
		do {
			
			System.out.print("Enter Your Age: ");
			age = input.nextInt();
			k++;
			
		}while (k < 1);
		
		System.out.print("Enter Your Gender: ");
		gender = input.next();
		System.out.println("Gender: " + gender);
		
		System.out.print("Enter Your Package Downpayment: ");
		downpayment = input.nextInt();
		System.out.println("Downpayment: " + downpayment);
		
		//the package
		System.out.println("Type of Cars");
		
		if(downpayment < 5000) {
			System.out.println("Your Suitable Car is: " + "Axia");
			
		} else if(downpayment < 7000) {
			System.out.println("Your Suitable Car is: " + "Myvi");
			
		} else if(downpayment < 9000) {
			System.out.println("Your Suitable Car is: " + "Bezza");
			
		} else if(downpayment < 10000) {
			System.out.println("Your Suitable Car is: " + "Alza");
			
		} else
			System.out.println("Your Suitable Car is: " + "Iriz");
			
		//while loop
		
		String[] freegift = {"Keychain", "Books", "Pen", "Umbrella"};
		int a = 0;
		while(a < 1) {
			  System.out.println("Your Freegift is: " + freegift[3]);
			  a++;	   
		}
		
    }

}


