package exception;


public class MyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myClass = new MyClass();
		
		try {
			myClass.danger();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}
