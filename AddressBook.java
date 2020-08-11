public class AddressBook {

	private String first_Name;
	private String last_Name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	
	public AddressBook(){
		first_Name = "";
		last_Name = "";
		address = "";
		city = "";
		state = "";
		zip = "";
		phone = "";
	}

	public AddressBook(String first_Name,String last_Name,String address,String city,String state,String zip,String phone){
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.address = address; 
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
	}




}