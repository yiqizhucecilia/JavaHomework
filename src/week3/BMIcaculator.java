package week3;

public class BMIcaculator {

	private String name;
	private int age;
	private double weight;
	private double height;
	
	public BMIcaculator() {
		this("nobody",20,120,5.1);
	}
	
	public BMIcaculator(String name,int age,double weight, double height) {
		this.name=name;
		this.age=age;
		this. weight=weight;
		this.height=height;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String  name) {
		this.name=name;
	}
	
	public int getage() {
		return age;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	
	public double getweight() {
		return weight;
	}
	public void setweight(double weight) {
		this.weight=weight;
	}
	public double getheight() {
		return height;
	}
	public void setheight(double height) {
		this.height=height;
	}
	
	public double getBMI() {
		 double BMI= (weight/(height*height))*703;
		 return BMI;
	}
	public String BMIstatus() {
		double BMI=getBMI();
		if (BMI<=16) {return "seriously  underweight";
		}else if (BMI<=18) {return "underweight";
		}else if (BMI<=24) {return "normal weight";
		}else if (BMI<=29) {return "overweight";
		}else if (BMI<=25) {return "seriously overweight";
		}else {return "gravely overweight";
		}
	}
}
