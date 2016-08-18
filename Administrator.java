
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Administrator extends User implements IAdmin {
	private String adminUserName;
	private static int counterOfAdmins;
	Map<String, RegisteredUser> allUsers;
	List<Ad> allAds = new ArrayList<Ad>();
	
	public Administrator(String name,  String phoneNumber, String address,
			String email) {
		super(name, phoneNumber, address, email);
		this.adminUserName= "admin" + counterOfAdmins;
		counterOfAdmins++;
	}
	

	@Override
	public void deleteAllAds() {
		
	}

	@Override
	public void deleteAd(Ad ad) {
	
	}

	@Override
	public void banUser(RegisteredUser user) {
		for(String key: allUsers.keySet()){
			if(key.equals(user.getUserName())){
				allUsers.remove(key);
			}else{
				//NOSuchUser exception
			}
			
		}
	}

}
