public class EmpWageBuilder{
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Builder");
		// contents
		int is_Full_Time = 1;
		int is_Part_Time = 2;
		int Wage_per_hour = 20;
		int no_of_hours = 8;
		int no_of_part_time_hour = 4;
		//computation
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == is_Full_Time){
			System.out.println("Employee is present ");
			int Payment = Wage_per_hour * no_of_hours;
			System.out.println("Payment is: "+ Payment);
		}
		else if (empCheck == is_Part_Time){
			System.out.println("Employee is part time");
			int Payment = Wage_per_hour * no_of_part_time_hour;
			System.out.println("Part time Payment is: "+ Payment);
		}
		else{
			System.out.println("Employee is Abscent");
			System.out.println("Payment is 0");
		}
	}
}
