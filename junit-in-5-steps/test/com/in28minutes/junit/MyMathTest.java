package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	private MyMath math = new MyMath();

	//İlk yazdığımız 'test()' methodunun basitleştirilmiş hali;
	@Test
	void calculateSum_ThreeMemberArray() {      //methodumuzun ismini değiştirerek daha anlaşılır yaptık.
		//"Refactor" ardından "Inline" ile kodumuzu sadeleştirdik.
		assertEquals(6, math.calculateSum(new int[] {1,2,3}));
	}
	
	
	/*
	@Test
	void test1() {
		
		// {} => 0 
	
		int[] numbers = {};
		int result = math.calculateSum(numbers);
		int expectedResult = 0;   //Beklenen değer '0'dır.
		assertEquals(expectedResult, result);
	}
	*/
	
	
	//test1()'in basitleştirilmiş hali;
	// {} => 0
	@Test
	void calculateSum_ZeroLengthArray() {      //methodumuzun ismini değiştirerek daha anlaşılır yaptık.
		//"Refactor" ardından "Inline" ile kodumuzu sadeleştirdik.
		assertEquals(0, math.calculateSum(new int[] {}));
	}
	


}


