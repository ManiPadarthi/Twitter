package DTO;

public class TwitterDTO {
	
	private Long id;
	private String firstName;
	private String lastname;
	private String dateofBirth;
	private Long mobileNumber;
	private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public TwitterDTO(Long id, String firstName, String lastname, String dateofBirth, Long mobileNumber,
			String description) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.dateofBirth = dateofBirth;
		this.mobileNumber = mobileNumber;
		this.description = description;
	}
	@Override
	public String toString() {
		return "TwitterDTO [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + ", dateofBirth="
				+ dateofBirth + ", mobileNumber=" + mobileNumber + ", description=" + description + "]";
	}
	
	

}
