import java.math.BigDecimal;
import java.math.RoundingMode;

import java.util.scanner;

public class Main {
 public static void main(String[] args)
     Scanner scanner = new Scanner(System.in);

double height = 158.6;
double weight = 55.1;

 System.out.println("身長: " + aheight + "(cm)");

 System.out.println("体重:" + aweight + "(kg)");

 double result = aweight / (aheight * aheight);

 BigDecimal bmi = new BigDecimal(result);
 bmi = bmi.setScale(2, RoundingMode.HALF_UP);
 System.out.println("あなたのBMI値は" + bmi + "です。");

 double height = 152.0;
 double weight = 45.1;

 System.out.println("身長:" + bheight + "(cm)");

 System.out.println("身長:" + bheight + "(cm)");

 double bmi = bweight / (bheight * bheight);

 BigDecimal bbmi = new BigDecimal(bresult);
 bbmi = bbmi.setScale(2.RoundingMode.HALF_UP);
 System.out.println("あなたのBMI値は" + bbmi + "です。");

 if(bmi >= 26.5) {
	 System.out.println("肥満です");
} else if(bmi < 26.55 && bmi >= 24) {
	System.out.println("太り気味です");
} else if(bmi < 24 && bmi >=20 ){
	System.out.println("普通です");
} else if(bmi < 20 && bmi >= 0 ){
	System.out.println("スリムです");
} else {
	System.out.println("エラーです");
		}
	}
}
