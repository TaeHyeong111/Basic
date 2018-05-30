package step1;
import java.util.Scanner;
public class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input height [ ? cm ]");
		int height = sc.nextInt();
		double divideHeight = height / 10 ;
		System.out.println("Input Weight [ ? Kg ]");
		int weight = sc.nextInt();
		
		double bmi = weight / divideHeight * divideHeight;
		
		String checkObesity = "";
					
		
		if(bmi < 18.5){
			checkObesity = "Low Weight";
		}else if(18.5 < bmi && bmi < 23){
			checkObesity = "Good Weight";
		}else if(23 < bmi && bmi < 25){
			checkObesity = "Little high Weight";
		}else if(25 < bmi && bmi < 30){
			checkObesity = "high Weight";
		}else if(30 < bmi && bmi < 35){
			checkObesity = "very high Weight";
		}else{
			checkObesity = "Super very high Weight";
		}
		
		System.out.print("Your bmi = " + checkObesity);
	}

}
