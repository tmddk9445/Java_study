package j16_스태틱.싱글톤.factory;

public class Factory1 {
	private KIA kia;
	
	public Factory1() {
		kia = KIA.getInstance();
	}
	
	public void create(String model) {
		Car car = kia.createCar(model);
		kia.carInfo(car);
	}
}
