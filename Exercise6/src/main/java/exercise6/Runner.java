package exercise6;

import java.util.ArrayList;
import java.util.List;

public class Runner {

//	public static int[] numbersArray;
	public static List<Integer> numbersArrayList = new ArrayList<Integer>();
	public static List<Integer> numbersArrayList2 = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addToArrayList2();
		System.out.println(numbersArrayList2);

		addToArrayList();
		System.out.println(numbersArrayList);

		multiplyByTen();
	}

	public static void addToArrayList2() {
		for (int i = 1; i <= 100; i++) {
			numbersArrayList2.add(i);
		}
	}

	public static void addToArrayList() {
		for (int i = 100; i <= 999; i++) {
			numbersArrayList.add(i);
		}
	}

	public static void multiplyByTen() {
		for (int i : numbersArrayList) {
			i = i * 10;
			System.out.println(i);
		}

	}

}
