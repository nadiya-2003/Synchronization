
public class Demo {
	public static void main(String[] args) throws InterruptedException {
		Warrior w1=new Warrior();
		Warrior w2=new Warrior();	
		w1.setName("Student1");
		w2.setName("Student2");		
		w1.start();
		w1.join();
		w2.start();
		w2.join();
	}
}
