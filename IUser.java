
public interface IUser {
	void uploadAd(Ad ad);

	void makeVipUser();

	void upgrade(Ad ad);

	void changePassword();

	void getMessage();

	void deleteMessage();

	void sendMessage(User user, Message message);
}
