package Problem5;

import java.util.Arrays;

public class Sort 
{
	static <E extends Comparable<E>> void swap(E[] array, int i, int j) {
		E temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	static <E extends Comparable<E>> void qsort(E[] array, int left, int right) {
		int l = left;
        int r = right;

        if(r > l) {
            E pivot = array[(l + r) / 2];
            
            while (l <= r) {
                while(l < right && array[l].compareTo(pivot) < 0) l += 1;
                while(r > left && array[r].compareTo(pivot) > 0) r -=1;
                if(l <= r) {
                    swap(array, l, r);
                    l +=1;
                    r -=1;
                }
            }
            
            if(left < r) qsort(array, left, r);
            if(l < right) qsort(array, l, right);
        }
	}
	
	static <E extends Comparable<E>> void merge(E[] array, int left1, int left2, int right1, int right2){
        E[] tempArray = Arrays.copyOf(array,array.length);
        int index = left1;
        int saveFirst = left1;

        while((left1 <= left2) && (right1 <= right2)) {
            if(array[left1].compareTo(array[right1]) < 0) {
                tempArray[index] = array[left1];
                left1++;
            }
            else {
                tempArray[index] = array[right1];
                right1++;
            }
            index++;
        }
        while(left1 <= left2) {
            tempArray[index] = array[left1];
            left1++;
            index++;
        }
        while(right1 <= right2) {
            tempArray[index] = array[right1];
            right1++;
            index++;
        }
        
        for(index = saveFirst; index <= right2;index++) {
            array[index] = tempArray[index];
        }
    }
	static <E extends Comparable<E>> void msort(E[] array, int first, int last) {
		if(first < last) {
            int middle = (first + last) / 2;
            msort(array ,first, middle);
            msort(array, middle + 1, last);
            merge(array, first, middle, middle + 1, last);
        }
	}
}