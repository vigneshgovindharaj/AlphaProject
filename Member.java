package vignesh;

public class Member {
       private String id, fname, birthday, gender, pname, father, mother, address, email, college, qulification, lag;

	public Member() {
		super();
	}

	public Member(String id,String fname, String birthday, String gender, String pname, String father, String mother,
			String address, String email, String college, String qulification, String lag) {
		super();
		this.id = id;
		this.fname = fname;
		this.birthday = birthday;
		this.gender = gender;
		this.pname = pname;
		this.father = father;
		this.mother = mother;
		this.address = address;
		this.email = email;
		this.college = college;
		this.qulification = qulification;
		this.lag = lag;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getQulification() {
		return qulification;
	}

	public void setQulification(String qulification) {
		this.qulification = qulification;
	}

	public String getLag() {
		return lag;
	}

	public void setLag(String lag) {
		this.lag = lag;
	}
}
