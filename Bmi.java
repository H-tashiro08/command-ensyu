import java.math.BigDecimal;
import java.math.RoundingMode;

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

		double aheight = scanner.nextDouble();
		double aweight = scanner.nextDouble();

 System.out.println("身長: " + aheight + "(m)");

 System.out.println("体重:" + aweight + "(kg)");

 
 double bmi = aweight / (aheight * aheight);

 System.out.println("あなたのBMI値は" + String.format("%.2f",bmi) + "です。");
		
		if(bmi >= 26.5) {
 System.out.println("肥満です");
} else if(bmi < 26.5 && bmi >= 24) {
System.out.println("太り気味です");
} else if(bmi < 24 && bmi >=20 ){
System.out.println("普通です");
} else if(bmi < 20 && bmi >= 0 ){
System.out.println("スリムです");
} else {
System.out.println("エラーです");
}
		

 double bheight = scanner.nextDouble();
 double bweight = scanner.nextDouble();

 System.out.println("身長:" + bheight + "(m)");

 System.out.println("体重:" + bweight + "(kg)");

 
 double bbmi = bweight / (bheight * bheight);
		
 System.out.println("あなたのBMI値は" + String.format("%.2f",bbmi) + "です。");


 if(bbmi >= 26.5) {
 System.out.println("肥満です");
} else if(bbmi < 26.5 && bbmi >= 24) {
System.out.println("太り気味です");
} else if(bbmi < 24 && bbmi >=20 ){
System.out.println("普通です");
} else if(bbmi < 20 && bbmi >= 0 ){
System.out.println("スリムです");
} else {
System.out.println("エラーです");
}
}
}
