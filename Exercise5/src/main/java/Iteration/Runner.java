package Iteration;

public class Runner {

	public static String[] tensArray = { "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
	public static String[] onesArray = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
	public static String[] hundredArray = {"One Hundred","Two Hundred","Three Hundred","Four Hundred","Five Hundred","Six Hundred","Seven Hundred","Eight Hundred","Nine Hundred","One Thousand"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		print1To10();
		System.out.println(convertToString(601));
	}

	public static void print1To10() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void print100To999() {
		for (int i = 100; i <= 999; i++) {
			System.out.println(i);
		}
	}

//	public static void printOneToTen() {
//		for(int i = 1; i <= 10; i++) {
//		i=i.parseString);
//		}
//	}

	public static String convertToString(int input) {
		int hundredCount = -1;
		int tensCount = 0;
		while (input >= 100) {
			if ((input - 100) >= 0) {
				hundredCount++;
				input = input - 100;
			}
		}
		while (input >= 10) {
			if ((input - 10) >= 0) {
				tensCount++;
				input = input - 10;
			}
		}
		return hundredArray[hundredCount] + " " + tensArray[tensCount] + " " + onesArray[input];
	}
//	public String convertToString(int input) {
//	    String result;
//	    int hundredCount;
//	    int tensCount;
//	    while(input >= 100) {
//	        if ((input-100) >= 0) {
//	            hundredCount++;
//	            input=input-100;
//	        }
//	    }
//	    if(hundredCount>1) {
//	        result += hundredArray[hundredCount];
//	    }
//	    while(input >= 10) {
//	        if ((input-10) >= 0) {
//	            tensCount++;
//	            input=input-10;
//	        }
//	    }
//	    if(tensCount>2) {
//	        result += tensArray[tensCount];
//	        result += onesArray[input];
//	    } else if(tensCount==1) {
//	        result += teensArray[input+10];
//	    } else {
//	        result += onesArray[input];
//	    }
//	    return result;
//	}

}