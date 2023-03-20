package j10_클래스;


/**
 * 
 * @author ITPS
 * 
 * 변수
 * company
 * model
 * color
 * 
 * 메소드
 * showInfo()
 * 000회사의 00모델 차량
 * 색상: 000
 * 
 *
 */
public class Car {
	String company;
	String model;
	String color;
	
	void showInfo() {
		System.out.println(company + "회사의 " + model + "모델 차량");
		System.out.println("색상: " + color);
		System.out.println();
	}
}






