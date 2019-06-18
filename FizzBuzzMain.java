package FizzBuzzProgram;
import java.util.Scanner; 
public class FizzBuzzMain {

	public static void main(String[] args) {
		int min = 10;
		int max = 100;
		int Numbers[]  = {7, 11, 20, 50};
		String Terms[]  = {"doe ", "rey ", "mi ", "fa"};
		
		
		
		//fizzbuzz();
		fizzbuzzAdvanced(min, max, Numbers, Terms);
		
		
	}
	public static void fizzbuzz(){
		
		FizzbuzzMethods fb = new FizzbuzzMethods();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input the minimum value of a Range: ");
		while(!sc.hasNextInt()) {
			System.out.println("Invalid input try again       ");
			sc.nextInt();
		}
		fb.setminnimumValue( sc.nextInt());
		
		System.out.println(fb.getMinimumValueValue());
		
		
		System.out.print("input the maximum value:            ");
		while(!sc.hasNextInt()) {
			System.out.print("Invalid input try again");
			sc.nextInt();
		}
		fb.setMaximumValue( sc.nextInt());
		
		System.out.println(fb.getMaxmumValue());
		
		
		System.out.print("input a divisor:                    ");
		while(!sc.hasNextInt()) {
			System.out.print("Invalid input try again         ");
			sc.nextInt();
		}
		fb.setDivisorOne( sc.nextInt());
		
		System.out.println(fb.getDivisorOne());
		
		
		
		System.out.print("input a second divisor:             ");
		while(!sc.hasNextInt()) {
			System.out.print("Invalid input try again         ");
			sc.nextInt();
		}
		fb.setDivisorTwo( sc.nextInt());
		
		System.out.println(fb.getDivisorTwo());
		
		
		for(int i = fb.getMinimumValueValue(); i <= fb.getMaxmumValue(); i++) {
			if(i % fb.getDivisorOne() == 0 || i % fb.getDivisorTwo() ==0) {
				if(i % fb.getDivisorOne() == 0 && i % fb.getDivisorTwo() ==0){
				
					System.out.print("fizzbuzz, ");
				}
				else if(i % fb.getDivisorOne() == 0) {
				
					System.out.print("fizz, ");
				}
				else if(i % fb.getDivisorTwo() ==0) {
				
					System.out.print("buzz, ");
				}
		
			}
		
			else{
				System.out.print(i+", ");
			}
			if(i%20==0) {
				System.out.println();
			}
		}
		
		
	}
	
	public static void fizzbuzzAdvanced(int MinimumValue, int MaximumValue, int[]Numbers, String[]Terms){
		if(Terms.length != Numbers.length) {
			System.out.println("the number of divisors do not match the number of terms");
		}
		try {
			FizzbuzzMethods fb = new FizzbuzzMethods();
			
			fb.setminnimumValue(MinimumValue);
			
			fb.setMaximumValue(MaximumValue);
			
			for(int i=MinimumValue; i<=MaximumValue;i++) {
				int count = 0;
				for(int x=0; x<Numbers.length;x++) {
					if(i % Numbers[x] != 0 && count == 0) {
						count++;
						System.out.println(i);
					}
					else if (i % Numbers[x] == 0){
						
						
						
						System.out.println(Terms[x]);
						
						
					}
					
				}
				
			}
			
		}catch(Exception e){
			
			System.out.println("your variables did not match the required parameters, \n PLEASE BE CAREFUL NEXT TIME");
		}
		
		
	}

	
	

}
