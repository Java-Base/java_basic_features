package com.java.basic.features.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 找出两个数组中不同的元素, 并存放的新的数组中打印出来
 *
 * @author 	Lian
 * @date	2016年7月20日
 * @since 	1.0
 */
public class ArrayUtil {

	public void findDifferentElementsBetweenTwoArrays(int[] arrayA, int[] arrayB) {
		List<Integer> list = new ArrayList<Integer>();

		// 查找在数组B，而不在数组A中的元素
		for (int i = 0; i < arrayA.length; i++) {
			boolean isExistInArrayB = false;

			for(int j = 0; j < arrayB.length; j++) {
				if (arrayB[j] == arrayA[i]) {
					isExistInArrayB = true;
					break;
				}
			}

			if (!isExistInArrayB) {
				list.add(arrayA[i]);
			}
		}

		// 查找在数组A，而不在数组B中的元素
		for (int i = 0; i < arrayB.length; i++) {
			boolean isExistInArrayA = false;

			for(int j = 0; j < arrayA.length; j++) {
				if (arrayA[j] == arrayB[i]) {
					isExistInArrayA = true;
					break;
				}
			}

			if (!isExistInArrayA) {
				list.add(arrayB[i]);
			}
		}

		// 存放不同元素的数组c
		int[] arrayC = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			arrayC[i] = list.get(i).intValue();
		}

		System.out.println("Different element in array A and B are: ");
		for (int value : arrayC) {
			System.out.print(value + " ");
		}
	}
}
