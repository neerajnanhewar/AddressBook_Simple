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

		public void setFirstName(String first_Name){
		this.first_Name = first_Name ;
	}

	public void setLastName(String last_Name){
		this.last_Name = last_Name ;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public void setCity(String city){
		this.city=city;
	}

	public void setState(String state){
		this.state = state;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}


	public String getFirstName(){
		 return first_Name;
	}

	public String getLastName(){
		return last_Name;
	}

	public String getAddress(){
		return address;
	}

	public String getCity(){
		return city;
	}

	public String getState(){
		return state;
	}

	public String getZip(){
		return zip;
	}

	public String setPhone(){
		return phone;
	}



}