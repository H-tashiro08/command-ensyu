import java.util.scanner;

public class Main {
 public static void main(String[] args)
     Scanner scanner = new Scanner(System.in);

double height = 158.6;
double weight = 55.1;

 System.out.println("身長: " + height + "(cm)");

 System.out.println("体重:" + weight + "(kg)");

 double bmi = weight / (height * height);

 System.out.println("あなたのBMI値は" + bmi + "です。");

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
