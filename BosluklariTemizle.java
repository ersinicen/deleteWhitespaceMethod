package tr.edu.medipol.yova.ornek1;

import org.apache.commons.lang3.StringUtils;

public class BosluklariTemizle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sonuc =StringUtils.deleteWhitespace(" aa bb vvvvv vvvvvvv");
		System.out.println(sonuc);
	}

}
