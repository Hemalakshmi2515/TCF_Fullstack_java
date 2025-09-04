package day1;

public class demo_typeconvertors {
public static void main(String[] args) {
	//implicit
	byte num1 = 127;
	int num2 = num1;
	//above indicates type conversion (implicit ; low to high data type)
	
	//explicit
	int num4 = 500;
	byte num3 = 80; // 500 % 80
		byte num5 = (byte)num4;
	// changing the memory type is called type casting (explicit ; low to high level)
	System.out.println(num5);
	}
}
