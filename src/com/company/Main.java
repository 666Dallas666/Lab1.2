package com.company;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
	int[] nums = new int[10];
	int[] nums2 = new int [10];
	for (int i = 0; i < 10; i++){
	    nums[i] = (int)(Math.random()*100);
    }
        System.out.print("Массив случайных чисел через Math.random(): ");
        System.out.println(Arrays.toString(nums));
	    Random random = new Random();
        for (int i = 0; i < 10; i++){
            nums2[i] = random.nextInt(100);
        }
        System.out.print("Массив случайных чисел через Random(): ");
        System.out.println(Arrays.toString(nums2));
        Arrays.sort(nums);
        System.out.print("Отсортированный массив Math.random(): ");
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums2);
        System.out.print("Отсортированный массив Random(): ");
        System.out.println(Arrays.toString(nums2));
    }
}