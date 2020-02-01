package org.swp.VO;

public class TEST_API {
	private String name;
	private String age;
	private String text;
	private String status;
	
	public TEST_API(String name, String age, String text, String status) {
		super();
		this.name = name;
		this.age = age;
		this.text = text;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "TEST_API [name=" + name + ", age=" + age + ", text=" + text + ", status=" + status + "]";
	}
}
