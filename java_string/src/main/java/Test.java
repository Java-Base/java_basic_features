import java.util.HashMap;

/**
 * Class Test
 *
 * @auth 	Lian
 * @date 	2016/10/9
 * @since 	1.0
 * @desc	Hash Table
 */
public class Test {

	public static void main(String[] args) {
//		HashMap<String, String> map = new HashMap();
//
//		map.put("kk", "KK");

		int num = 10;
		printf(num);

		num = num << 1;
		printf(num);

		num = num >> 3;
		printf(num);
	}

	public static void printf(int num) {
		System.out.println("num is " + num + ", and the binary is :" + Integer.toBinaryString(num));
	}
}
