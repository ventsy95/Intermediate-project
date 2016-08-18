import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public abstract class User implements IUser {
	private static final int MAX_PASSWORD_ATTEMPTS = 3;
	private static final int MIN_PASSWORD_LENGTH = 6;
	private String name;
	private String userName;
	private String password;
	private String phoneNumber;
	private String address;
	private String email;	
	private Map<String, Message> messages;	
	private static Scanner sc = new Scanner(System.in);
	List<Ad> myAds;
	
	public User(String name, String phoneNumber, String address, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}
	
	public User(String name, String userName, String password, String phoneNumber, String address, String email) {
		this(name, phoneNumber, address, email);
		this.userName = userName;
		this.password = password;
		this.messages = new HashMap<String, Message>();
		this.myAds = new ArrayList<Ad>();
	}


	private boolean isValid(String str) {
		boolean isValid = false;
		if( str!= null && !str.equals("")) {
			isValid = true;
		}
		return isValid;
	}
	
	private boolean isValidNumber(String telephone) {
		boolean isValidNum = false;
		if(isValid(telephone)) {
			if((telephone.substring(0, 2).equals("08") && telephone.length() == 10)	|| 
					(telephone.substring(0, 6).equals("+359 8") && telephone.length() == 15)) {
				isValidNum = true;
			}
		}
		return isValidNum;
	}
	
	/*void askForPassword() {
		String userPassword = "";
		int countOfPasswordAttempts = 0;
		System.out.println("Enter password:");
		userPassword = sc.nextLine();
		while (!userPassword.equals(this.password)) {
			countOfPasswordAttempts++;
			if (countOfPasswordAttempts < MAX_PASSWORD_ATTEMPTS) {			
				System.out.println("Invalid password! Left attempts: " + 
									(MAX_PASSWORD_ATTEMPTS - countOfPasswordAttempts));
				userPassword = sc.nextLine();
			}
			else {
				//System.out.println("No more password attempts! Aborting method!");
				throw new SecurityException("No more password attempts! Aborting method!");
			}
		}
	}*/
	// v tozi metod karame user-a mnogokratno da vuvede silna parola
	// dokato ne postigne uspeh
	void setPassword(String password) {
		System.out.println("Create password for user: " +  this.getName());
		password = sc.nextLine();

		while (password.isEmpty()) {
			System.out.println("Password can not be empty! Try again:");
			password = sc.nextLine();
		}

		boolean isLongEnough = password.length() < MIN_PASSWORD_LENGTH;
		boolean hasUppercase = !password.equals(password.toLowerCase());
		boolean hasLowercase = !password.equals(password.toUpperCase());
		boolean hasDigit = password.matches(".*\\d+.*");

		while (isLongEnough || !hasUppercase || !hasLowercase || !hasDigit) {
			if (isLongEnough) {
				System.out.println("Password must be at least " + MIN_PASSWORD_LENGTH + " characters long!");
			}
			if (!hasUppercase || !hasLowercase || !hasDigit) {
				System.out.println(
						"Password must have at least 1 digit, 1 uppercase and 1 " + "lowercase character!");
			}
			password = sc.nextLine();
			// set the boolean values again for every new attempt
			isLongEnough = password.length() < MIN_PASSWORD_LENGTH;
			hasUppercase = !password.equals(password.toLowerCase());
			hasLowercase = !password.equals(password.toUpperCase());
			hasDigit = password.matches(".*\\d+.*");
		}
		this.password = password;
		
	}

	
	@Override
	public void uploadAd(Ad ad) {
		// TODO Auto-generated method stub

	}

	@Override
	public void makeVipUser() {	

	}

	@Override
	public void upgrade(Ad ad) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changePassword() {
		System.out.println("The user: " + this.getUserName() + " wants to change his password!");
		System.out.println(this.name + " please enter current password : ");
		String oldPsss = sc.nextLine();
		if (oldPsss.equals(this.password)) {
			System.out.println(this.name + " please enter new password: ");
			String newPass = sc.nextLine();
				 this.password = newPass;
				 System.out.println(this.name + " changed his password successfully!");
			 
		
		} else { 
			System.out.println("Wrong password!");
		}
      
		
	}

	@Override
	public void getMessage() {
		System.out.println(this.userName + " lets check my message box!");
		if (messages.isEmpty()) {
			System.out.println("I don't have any messages");
		}
		for (Entry<String, Message> mesg : this.messages.entrySet()) {
			System.out.println("Message from: " +  mesg.getKey()) ; // tova tuka ne raboti 
			System.out.println("TITLE: " + mesg.getValue().getTitle());
			System.out.println("CONTENT: " + mesg.getValue().getContent());
		}

	}

	@Override
	public void deleteMessage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendMessage(User user, Message message) {
	 System.out.println(this.getUserName() + " send message to user: " + user.getName());
	  user.getMessages().put(user.getName(),message); 
	  
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getUserName() {
		return userName;
	}

	void setUserName(String userName) {
		this.userName = userName;
	}

	String getPassword() {
		return password;
	}

	String getPhoneNumber() {
		return phoneNumber;
	}

	void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	String getAddress() {
		return address;
	}

	void setAddress(String address) {
		this.address = address;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}

	Map<String, Message> getMessages() {
		return messages;
	}

	void setMessages(Map<String, Message> messages) {
		this.messages = messages;
	}

	List<Ad> getMyAds() {
		return myAds;
	}

	void setMyAds(List<Ad> myAds) {
		this.myAds = myAds;
	}
}
	
	