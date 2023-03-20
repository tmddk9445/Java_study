package j19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * 제네릭이란 데이터 타입(data tyep) 즉, 자료형을 일반화한다(generalize)는 의미
 *	1. T(Type) - Integer, String, Double, Boolean
 *	2. E(Elements) - 일반 자료형이 아닌 참조 자료형을 사요할 때
 *	3. K(Key), V(Value)
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericTest<T> {
	private T data1;
	private T data2;
}












