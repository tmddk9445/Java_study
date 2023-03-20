package j19_제네릭.wildcard;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class WildCarTest<T> {
	private T data;
}
