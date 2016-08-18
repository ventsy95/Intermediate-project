
public class RegisteredUser extends User {
	private boolean isVip;

	public RegisteredUser(String name, String userName, String password, String phoneNumber, String address,
			String email) {
		super(name, userName, password, phoneNumber, address, email);
	}
	
	public void requestVipUpgrade(){
		
	}

	@Override
	public void uploadAd(Ad ad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeVipUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upgrade(Ad ad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMessage(User user, Message message) {
		// TODO Auto-generated method stub
		
	}
}
