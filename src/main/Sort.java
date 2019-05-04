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
};
