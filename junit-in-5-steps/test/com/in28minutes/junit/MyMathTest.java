package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void test() {
		//fail("Not yet implemented");    //Bu 'fail()' methodu "assertion"dır. Bir testin başarısız olmasını istiyorsak 'fail()' methodunu kullanırız.
		//Absence of failure is success(Başarısızlığın yokluğu başarıdır)
		//Testimizde yapacağımız şey birkaç test koşulu yazmaktır. Bunlara "assert" denir. (Test Condition or Assert)
		
		//Bir adet "assert" yani test koşulu yazıp çalıştırmayı deneyelim;
		int[] numbers = {1,2,3};
		MyMath math = new MyMath();
		int result = math.calculateSum(numbers);
		System.out.println(result);  //Çıktı olarak console'da "6"yı görürüz.(1+2+3=6)
		//Şimdi yapmamız gereken şey yukarıdaki 'result' değerini(6) beklenen değerle karşılaştırmaktır.
		int expectedResult = 6;   //Beklenen değer '6'dır.
		//Bu noktada karşılaştırma işlemini 'assert method'lar ile yaparız.["assertEquals()" methodu]
		assertEquals(expectedResult, result);  //Çıktı olarak "green bar"ı görürüz. Yani testin başarılı olduğu anlamına gelir.
		
	}

}
