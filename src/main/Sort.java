package main;

import java.util.ArrayList;

public class Sort {

	/**
	 * ASC
	 * 
	 * @param vec
	 * @return
	 */
	public void selection(ArrayList<Integer> vec) {
		int n = vec.size();
		int posMin;
		for (int i = 0; i < n - 1; i++) {
			posMin = i;
			for (int j = i + 1; j < n; j++)
				if (vec.get(j) < vec.get(posMin))
					posMin = j;

			permute(vec, i, posMin);
		}
	}

	/**
	 * ASC
	 * 
	 * @param vec
	 * @return
	 */
	public void bubble(ArrayList<Integer> vec) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < vec.size() - 1; i++) {
				if (vec.get(i) > vec.get(i + 1)) {
					permute(vec, i, i + 1);
					swapped = true;
				}
			}
		} while (swapped);
	}

	/**
	 * ASC
	 * 
	 * @param vec
	 * @return
	 */
	public void insertion(ArrayList<Integer> vec) {
		int n = vec.size();
		for (int i = 1; i < n; i++) {
			int x = vec.get(i);
			int j = i - 1;
			while (j >= 0 && x < vec.get(j)) {
				vec.set(j + 1, vec.get(j));
				j--;
			}
			vec.set(j + 1, x);
		}
	}

	private void permute(ArrayList<Integer> vec, int i, int j) {
		int aux = vec.get(i);
		vec.set(i, vec.get(j));
		vec.set(j, aux);
	}
};
