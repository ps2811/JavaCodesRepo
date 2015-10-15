package myJavaCodes;
//Sloshing values from one method to another - i.e call be value
class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping:" + height);
	}
	
}

public class MethodParmApp {
	 public static void main(String[] args) {
		Robot robo = new Robot();
		String text = "Hi - I am a Robot";
		robo.speak(text);
		robo.jump(10);
	}
}
