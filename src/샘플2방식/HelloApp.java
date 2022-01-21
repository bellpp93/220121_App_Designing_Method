package 샘플2방식;
//실행 클래스
public class HelloApp {
	public static void main(String[] args) {
		MessageBean bean;
		
		bean = new MessageBeanEn();
		bean.sayHello("Kim sun dong");
		
		bean = new MessageBeanKr();
		bean.sayHello("김선동");
	}
}
