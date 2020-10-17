
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte byteVar=10;
		short shortVar=100;
		char charVar = 'A';
		int intVar=1000;
		long longVar = 1000;
		float floatVar=100000;
		double doubleVar=10000000;
		shortVar=byteVar;
		System.out.println(shortVar);
		intVar=charVar;
		System.out.println(intVar);
		System.out.println(doubleVar);
		
		floatVar=(float) doubleVar;
		System.out.println(floatVar);
		
		
		byte newVar=100;
		short newShortVar=(short) (newVar+10);
		
		int newIntVar=100;
		long newLongVar=2147483648L;
		 float floatVar1=145.82F;

	}

}
