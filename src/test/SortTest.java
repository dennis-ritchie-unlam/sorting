package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.Sort;

class SortTest {

	@Test
	void sortSelecctionAscTest() {
		ArrayList<Integer> vec = new ArrayList<Integer>();
		vec.add(55);
		vec.add(15);
		vec.add(45);
		vec.add(5);
		vec.add(35);
		
		Sort sort = new Sort();
		sort.selection(vec);
		
		ArrayList<Integer> vecExpected = new ArrayList<Integer>();
		vecExpected.add(5);
		vecExpected.add(15);
		vecExpected.add(35);
		vecExpected.add(45);
		vecExpected.add(55);
		for(Integer v:vec) {
			System.out.println(v);
		}
		
		Assert.assertArrayEquals(vecExpected.toArray(), vec.toArray());
	}
	
}
