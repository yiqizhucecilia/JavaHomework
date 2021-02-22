package week3;

public class TestBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMIcaculator person1=new BMIcaculator();
		String name=person1.getname();
		
		System.out.println(name+"is"+person1.getBMI()+" The status of BMI is " +person1.BMIstatus() );
	}

}
