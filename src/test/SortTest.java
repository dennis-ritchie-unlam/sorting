package test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.Sort;

class SortTest {

	@Test
	void selecctionSortAscTest() {
		ArrayList<Integer> vecRandom = new ArrayList<Integer>();
		ArrayList<Integer> vecSorted = new ArrayList<Integer>();
		ArrayList<Integer> vecReverse = new ArrayList<Integer>();
		ArrayList<Integer> vecExpected = new ArrayList<Integer>();
		Sort sort = new Sort();
		
		vecRandom.add(55);
		vecRandom.add(15);
		vecRandom.add(45);
		vecRandom.add(5);
		vecRandom.add(35);
		sort.selection(vecRandom);
		
		vecSorted.add(5);
		vecSorted.add(15);
		vecSorted.add(35);
		vecSorted.add(45);
		vecSorted.add(55);
		sort.selection(vecSorted);
		
		vecReverse.add(55);
		vecReverse.add(45);
		vecReverse.add(35);
		vecReverse.add(15);
		vecReverse.add(5);
		sort.selection(vecReverse);
		
		vecExpected.add(5);
		vecExpected.add(15);
		vecExpected.add(35);
		vecExpected.add(45);
		vecExpected.add(55);
		
		Assert.assertArrayEquals(vecExpected.toArray(), vecRandom.toArray());
		Assert.assertArrayEquals(vecExpected.toArray(), vecSorted.toArray());
		Assert.assertArrayEquals(vecExpected.toArray(), vecReverse.toArray());
	}
	
	@Test
	void bubbleSortAscTest() {
		ArrayList<Integer> vecRandom = new ArrayList<Integer>();
		ArrayList<Integer> vecSorted = new ArrayList<Integer>();
		ArrayList<Integer> vecReverse = new ArrayList<Integer>();
		ArrayList<Integer> vecExpected = new ArrayList<Integer>();
		Sort sort = new Sort();
		
		vecRandom.add(55);
		vecRandom.add(15);
		vecRandom.add(45);
		vecRandom.add(5);
		vecRandom.add(35);
		sort.bubble(vecRandom);
		
		vecSorted.add(5);
		vecSorted.add(15);
		vecSorted.add(35);
		vecSorted.add(45);
		vecSorted.add(55);
		sort.bubble(vecSorted);
		
		vecReverse.add(55);
		vecReverse.add(45);
		vecReverse.add(35);
		vecReverse.add(15);
		vecReverse.add(5);
		sort.bubble(vecReverse);
		
		vecExpected.add(5);
		vecExpected.add(15);
		vecExpected.add(35);
		vecExpected.add(45);
		vecExpected.add(55);
		
		Assert.assertArrayEquals(vecExpected.toArray(), vecRandom.toArray());
		Assert.assertArrayEquals(vecExpected.toArray(), vecSorted.toArray());
		Assert.assertArrayEquals(vecExpected.toArray(), vecReverse.toArray());
	}
	
	@Test
	void insertionSortAscTest() {
		ArrayList<Integer> vecRandom = new ArrayList<Integer>();
		ArrayList<Integer> vecSorted = new ArrayList<Integer>();
		ArrayList<Integer> vecReverse = new ArrayList<Integer>();
		ArrayList<Integer> vecExpected = new ArrayList<Integer>();
		Sort sort = new Sort();
		
		vecRandom.add(55);
		vecRandom.add(15);
		vecRandom.add(45);
		vecRandom.add(5);
		vecRandom.add(35);
		sort.insertion(vecRandom);
		
		vecSorted.add(5);
		vecSorted.add(15);
		vecSorted.add(35);
		vecSorted.add(45);
		vecSorted.add(55);
		sort.insertion(vecSorted);
		
		vecReverse.add(55);
		vecReverse.add(45);
		vecReverse.add(35);
		vecReverse.add(15);
		vecReverse.add(5);
		sort.insertion(vecReverse);
		
		vecExpected.add(5);
		vecExpected.add(15);
		vecExpected.add(35);
		vecExpected.add(45);
		vecExpected.add(55);
		
		Assert.assertArrayEquals(vecExpected.toArray(), vecRandom.toArray());
		Assert.assertArrayEquals(vecExpected.toArray(), vecSorted.toArray());
		Assert.assertArrayEquals(vecExpected.toArray(), vecReverse.toArray());
	}
}
