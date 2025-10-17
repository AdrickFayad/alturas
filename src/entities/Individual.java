package entities;

public class Individual {

	private String name;
	private int age;
	private double hieght;
	public Individual(String name, int age, double hieght) {
		this.name = name;
		this.age = age;
		this.hieght = hieght;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHieght() {
		return hieght;
	}
	public void setHieght(double hieght) {
		this.hieght = hieght;
	}

	}
