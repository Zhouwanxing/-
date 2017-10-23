package entity;
public class Student {
	private int sid;
	private String sname;
	private String sex;
	private int age;
	private String type;
	private String hobby;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public Student(int sid, String sname, String sex, int age, String type,
			String hobby) {
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
		this.age = age;
		this.type = type;
		this.hobby = hobby;
	}
	public Student(String sname, String sex, int age, String type, String hobby) {
		super();
		this.sname = sname;
		this.sex = sex;
		this.age = age;
		this.type = type;
		this.hobby = hobby;
	}
	public Student() {
	}
}
