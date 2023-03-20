package j16_스태틱.싱글톤.factory;

public class KIA {
	private static KIA instance = null;
	private int serial_autoIncrement = 20220000;
	
	private KIA() {}
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	
	public Car createCar(String model) {
		return new Car(++serial_autoIncrement, KIA.class.getSimpleName(), model);
	}
	
	public void carInfo(Car car) {
		System.out.println(car);
	}
	
	
}
