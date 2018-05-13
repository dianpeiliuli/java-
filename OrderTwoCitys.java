package test_in_book;
import java.util.*;
//程序清单4.2 提示用户输入两个城市，然后以字母表顺序进行显示
public class OrderTwoCitys {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//提示用户输入城市
		System.out.print("Enter the first city:");
		String city1 = input.nextLine();
		System.out.print("Enter the second city:");
		String city2 = input.nextLine();
		
		if (city1.compareTo(city2) < 0) {
			System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
		}
		else {
			System.out.println("The cities in alphabetical order are " + city2 + " " + city1);
		}
	}
}
