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
		int posMin, aux;
		for (int i = 0; i < n-1; i++) {
			posMin = i;
			for (int j = i+1; j < n; j++)
				if (vec.get(j) < vec.get(posMin))
					posMin = j;
				
			aux = vec.get(i);
			vec.set(i, vec.get(posMin));
			vec.set(posMin, aux);
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
		int aux;
		do {
			swapped = false;
			for(int i = 0;i<vec.size()-1;i++) {
				if(vec.get(i) > vec.get(i+1)) {
					aux = vec.get(i);
					vec.set(i, vec.get(i+1));
					vec.set(i+1, aux);
					swapped = true;
				}
			}
		} while(swapped);
	}
};
