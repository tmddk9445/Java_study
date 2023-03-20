package j16_스태틱.싱글톤.factory;

public class FactoryMain {

	public static void main(String[] args) {
		Factory1 factory1 = new Factory1();
		Factory2 factory2 = new Factory2();
		
		factory1.create("K3");
		factory1.create("K5");
		factory1.create("K7");
		
		factory2.create("스포티지");
		factory2.create("쏘렌토");
		factory2.create("카니발");
	}

}
