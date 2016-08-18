import java.util.Map.Entry;

public class Demo {
	public static void main(String[] args) {
		User ivo = new RegisteredUser("Ivo", "ivo5", "089856587", "Sofia", "ivo@gmail.com");
		//System.out.println(ivo.getPassword());
		/*System.out.println("Tova e parolata sega : " + ivo.getPassword());
		ivo.changePassword();
		System.out.println(ivo.getPassword());
		*/
		
		User iva = new RegisteredUser("Iva", "iva5", "089856587", "Sofia", "ivo@gmail.com");
		
		ivo.sendMessage(iva, new Message("Imam interes", "Iskam da napravq ogled"));
		ivo.sendMessage(iva, new Message("Nqmam interes", "Basi skupotiqta"));
		
		iva.getMessage();
		
		ivo.getMessage();
		//tuka napravih promqna
		
	}

}
