import java.util.*;
public class leapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String res= (a%400==0) || (a%4==0 && a%100!=0) ? "Leap Year" : "Not a Leap Year";
		System.out.println(res);
		sc.close();
	}
}
