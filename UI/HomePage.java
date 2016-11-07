import java.util.*;

public class HomePage {
	
	Scanner scan = new Scanner(System.in);
	Client user;
	
	public HomePage(){
	    user = new Client();
	}
	
	public void displayHomePage(){
		System.out.println("Select one option from below:");
		System.out.println("1) Display Schedule");
		System.out.println("2) Add Assignment");
		System.out.println("3) Edit Assignment");
		System.out.println("4) Add Event");
		System.out.println("5) Edit Event");
		System.out.println("6) Edit Profile");
		System.out.println("7) Refresh Schedule");
	}
	
	public void displaySchedule(){
	   Calendar[] ca = user.displaySchedule();
	   int length = ca.length();
	   for(int i = 0; i < length; i++){
	       System.out.println("Name: " + ca[i].getName() + " Time: " + ca[i].getTime() + " Location: " + ca[i].getLocation());
	   }
	}
	
	public void addAssignment(){
		System.out.println("Name of Assignment:");
		String nameAssign = scan.nextLine();
		System.out.println("Name of Class:");
		String nameClass = scan.nextLine();
		System.out.println("Days to Complete Assignment:");
		int dueDate = scan.nextInt();
		System.out.println("Estimates Time of Completion (Hours):");
		int completionTime = scan.nextInt();
		System.out.println("Priority of Assignment (1-3):");
		int priority = scan.nextInt();
		
		user.addAssignment(nameAssign, nameClass, dueDate, completionTime, priority);
		//create assignment object using values
		
	}
		
	public void editAssignment(){
		System.out.println("Enter Name of Assignment:");
		String findAssignment = scan.nextLine();
		
		//find assignment
		
		//String nameAssign = 
	}
	
	public void addEvent(){
		System.out.println("Name of Event:");
		String nameEvent = scan.nextLine();
		System.out.println("Enter Days of the Week(SuMoTuWeThFiSa):");
		String days = scan.nextLine();
		System.out.println("Estimates Time of Day:");
		int time = scan.nextInt();
		System.out.println("Location:");
		String location = scan.nextLine();
		
		user.addEvent(nameEvent, days, time, location);
		//create event object using values
	}
	
	public void editEvent(){
		System.out.println("Enter Name of Event:");
		String findEvent = scan.nextLine();
		
		//find event
		
		//String nameEvent = 
	}
	
	public void editProfile(){
		//get info for profile
	}
	
	public void refreshSchedule(){
		displaySchedule();
	}
	
	public void createAccount(){
	    System.out.println("Name: ");
	    String name = scan.nextLine();
	    System.out.println("Username: ");
	    String user = scan.nextLine();
	    System.out.println("Email: ");
	    String email = scan.nextLine();
	    System.out.println("Password: ");
	    String password = scan.nextLine();
	    System.out.println("Approximate Bedtime: ");
	    String bedtime = scan.nextLine();
	    user.createAccount(name, user, email, password, bedtime);
	}
	
}