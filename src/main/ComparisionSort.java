package main;

import java.util.ArrayList;

public class ComparisionSort {

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

	/**
	 * ASC
	 * 
	 * @param vec
	 */
	public void merge(ArrayList<Integer> vec) {
		if (vec.size() <= 1)
			return;

		ArrayList<Integer> vecLeft = new ArrayList<Integer>(vec.subList(0, vec.size() / 2));
		ArrayList<Integer> vecRigth = new ArrayList<Integer>(vec.subList(0, vec.size() - vecLeft.size()));

		copyVec(vec, 0, vecLeft, 0, vecLeft.size());
		copyVec(vec, vecLeft.size(), vecRigth, 0, vecRigth.size());

		merge(vecLeft);
		merge(vecRigth);

		doMerge(vecLeft, vecRigth, vec);
	}

	private void doMerge(ArrayList<Integer> vecLeft, ArrayList<Integer> vecRigth, ArrayList<Integer> vec) {
		int idVecLeft = 0;
		int idVecRigth = 0;
		int idVec = 0;

		while (idVecLeft < vecLeft.size() && idVecRigth < vecRigth.size()) {
			if (vecLeft.get(idVecLeft) < vecRigth.get(idVecRigth)) {
				vec.set(idVec, vecLeft.get(idVecLeft));
				idVecLeft++;
			} else {
				vec.set(idVec, vecRigth.get(idVecRigth));
				idVecRigth++;
			}
			idVec++;
		}

		copyVec(vecLeft, idVecLeft, vec, idVec, vecLeft.size() - idVecLeft);
		copyVec(vecRigth, idVecRigth, vec, idVec, vecRigth.size() - idVecRigth);
	}

	private void copyVec(ArrayList<Integer> src, int srcPos, ArrayList<Integer> dest, int destPos, int length) {
		for (int i = 0; i < length; i++, destPos++, srcPos++) {
			dest.set(destPos, src.get(srcPos));
		}
	}

	public void quick(ArrayList<Integer> vec) {
		doQuick(vec, 0, vec.size() - 1);
	}

	private void doQuick(ArrayList<Integer> vec, int left, int rigth) {
		if (left < rigth) {
			int pI = doQuickPartition(vec, left, rigth);

			doQuick(vec, left, pI - 1);
			doQuick(vec, pI + 1, rigth);
		}
	}

	private int doQuickPartition(ArrayList<Integer> vec, int left, int rigth) {
        int pivot = vec.get(left);
		int m = left;
		for (int k = left + 1; k <= rigth; k++) {
			if (vec.get(k) < pivot) {
				m++;
				permute(vec, k, m);
			}
		}

		permute(vec, left, m);

		return m;
	}

	public void random() {

	}

	private void permute(ArrayList<Integer> vec, int i, int j) {
		int aux = vec.get(i);
		vec.set(i, vec.get(j));
		vec.set(j, aux);
	}
};
