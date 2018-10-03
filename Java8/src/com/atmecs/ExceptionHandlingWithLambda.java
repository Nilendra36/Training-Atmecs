package com.atmecs;

import java.util.function.BiConsumer;

public class ExceptionHandlingWithLambda {

	public static void main(String[] args) {
		int [] numbers= {1,2,3,4,5};
		int key=0;
		doOperations(numbers,key,wrapperLambda((v,k)->System.out.println(v/k)));

	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v,k)->{
		try {
		consumer.accept(v, k);
		}catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
			}
		};
	}
		

	private static void doOperations(int[] numbers, int key,BiConsumer<Integer, Integer> consumer) {
		for(int i:numbers) {
			consumer.accept(i, key);;
		}
		
	}

}
