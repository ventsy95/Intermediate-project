import java.io.File;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Ad {
	private String name;
	private String address;
	private String description;
	private double pricePerMonth;
	private String neighborhood;
	List<File> images = new LinkedList<File>();
	private RegisteredUser user;
	private Date uploadDate;
	private TypeOfAd type;
	private byte numberOfRooms;

	public Ad(String name, String address, String description, double pricePerMonth, String neighborhood,
			RegisteredUser user, Date uploadDate, TypeOfAd type, byte numberOfRooms) {
			setName(name);
			setAddress(address);
			setDescription(description);
			setPricePerMonth(pricePerMonth);
			setNeighborhood(neighborhood);
			setUser(user);
			setUploadDate(uploadDate);
			setType(type);
			setNumberOfRooms(numberOfRooms);
		this.images = new LinkedList<File>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name.trim().equals("")) {
			this.name = name;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address != null && address.trim().equals("")) {
			this.address = address;
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if (description != null && description.trim().equals("")) {
			this.description = description;
		}
	}

	public double getPricePerMonth() {
		return pricePerMonth;
	}

	public void setPricePerMonth(double pricePerMonth) {
		if (pricePerMonth > 0) {
			this.pricePerMonth = pricePerMonth;
		}
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		if (neighborhood != null && neighborhood.trim().equals("")) {
			this.neighborhood = neighborhood;
		}
	}

	public RegisteredUser getUser() {
		return user;
	}

	public void setUser(RegisteredUser user) {
		if (user != null) {
			this.user = user;
		}
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		if (uploadDate != null) {
			this.uploadDate = uploadDate;
		}
	}

	public TypeOfAd getType() {
		return type;
	}

	public void setType(TypeOfAd type) {
		if (type != null) {
			this.type = type;
		}
	}

	public byte getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(byte numberOfRooms) {
		if (numberOfRooms > 0) {
			this.numberOfRooms = numberOfRooms;
		}
	}
	
	

}
