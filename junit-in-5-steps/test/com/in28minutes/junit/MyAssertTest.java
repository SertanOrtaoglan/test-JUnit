package com.in28minutes.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	
	
	List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");
	

	@Test
	void test() {
		
		//boolean için test "assertEquals()" ile
		boolean test = todos.contains("AWS");   //result
		assertEquals(true, test);  //(expected result, result)
		
		//numbers(sayılar) için test
		assertEquals(3, todos.size());
		
		//boolean için kısayol test "assertTrue()" ile
		assertTrue(test);
		
		//boolean için mesaj yazdırma "assertEquals()" ile
		assertEquals(true, test, "Everthing is okay");
		
		//boolean için mesaj yazdırma "assertTrue()" ile
		assertTrue("Something went wrong", test);
		
		//numbers(sayılar) için mesaj yazdırma
		assertEquals(3, todos.size(), "Error Message");
		
		//boolean için kısayol test "assertFalse()" ile
		boolean test2 = todos.contains("GCP");
		assertFalse(test2);
		
		
		//"assertNull()" ve "assertNotNull()" ile "null" değerlerin olup olmadığını test edebiliriz.
		
		
		//array'ler için test "assertArrayEquals()" ile
		assertArrayEquals(new int[] {1,2}, new int[] {1,2});  //(expected array, array)
		
		
	}

}

