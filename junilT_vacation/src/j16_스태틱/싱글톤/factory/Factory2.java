package j16_스태틱.싱글톤.factory;

public class Factory2 {
	private KIA kia;
	
	public Factory2() {
		kia = KIA.getInstance();
	}
	
	public void create(String model) {
		Car car = kia.createCar(model);
		kia.carInfo(car);
	}
}
