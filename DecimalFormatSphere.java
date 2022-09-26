import java.util.Scanner;
import java.text.DecimalFormat;

public class DecimalFormatSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double radius = scan.nextDouble();
		
		double area = 4 * Math.PI * Math.pow(radius, 2);
		double volume = 4/3 * Math.PI * Math.pow(radius, 3);
		
		DecimalFormat f1 = new DecimalFormat("0.##");
		System.out.println("Formatted surface area: " + f1.format(area));
		System.out.println("Formatted volume: " + f1.format(volume));
	}

}
