import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		
		Box1 box1 = context.getBean("box1", Box1.class);
		System.out.println(box1);
		Box2 box2 = context.getBean("box2", Box2.class);
		System.out.println(box2);
	}

}
