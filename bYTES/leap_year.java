import java.util.*;
public class leap_year
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		if(a%4 == 0){
		    System.out.print("It is a leap year");
		}
        else{
            System.out.println("it is not a leap year");
        }
		s.close();
	}
}

