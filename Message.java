public class Message {
	
	private String title;
	private String content;
	private static final int MAX_lENGTH_OF_MESSAGE = 200;
	
	protected Message(String title, String content) {

		this.title = title;
		this.content = content;
	}
	

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	String getContent() {
		return content;
	}
}
	
	