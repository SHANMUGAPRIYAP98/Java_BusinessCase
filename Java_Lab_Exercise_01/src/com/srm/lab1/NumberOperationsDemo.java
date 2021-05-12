package com.srm.lab1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

class NumberOper {
	Logger log=Logger.getLogger(NumberOper.class.getName());
	boolean flag = false;

	void swapWithTemp(int a, int b) {
		log.info("Before Swapping : " + a + "\t" + b);
		int temp = a;
		a = b;
		b = temp;
		log.info("After Swapping  : " + a + "\t" + b);
	}

	void swapWithoutTemp(int a, int b) {
		log.info("Before Swapping : " + a + "\t" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		log.info("After Swapping  : " + a + "\t" + b);
	}

	void findSecondArrayElem(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			log.info(arr[i] + "\t");
		}
		log.info("\n");
		log.info("Second Largest Element : " + arr[arr.length - 2]);
	}

	void findSquareRoot(double value) {

		double res = Math.pow(value, 0.5);
		log.info("Square Root of " + value + " : " + res);
	}

	void reverse(int num) {
		int digits = 0;
		int rev = 0;
		for (; num != 0; num = num / 10) {
			digits = num % 10;
			rev = rev * 10 + digits;
		}
		log.info("Reversed Number : " + rev);
	}

	void findArmstrong(int num) {
		int digits = 0;
		int sum = 0;
		int val = num;
		for (; num != 0; num = num / 10) {
			digits = num % 10;
			sum = sum + (digits * digits * digits);
		}
		if (val == sum) {
			log.info(val + " is a Armstrong Number");
		} else {
			log.info(val + " is not a Armstrong Number");
		}
	}

	void addMatrix(int[][] mat1, int[][] mat2) {
		int[][] mat3 = new int[3][3];
		log.info("Addition of Two Matrices : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mat3[i][j] = mat1[i][j] + mat2[i][j];
				log.info(mat3[i][j] + "\t");
			}
			log.info("\n");
		}
	}

	void checkPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				log.info(number + " is not a prime number");
				flag = true;
				break;
			}
		}
		if (!flag) {
			log.info(number + " is  a prime number");
		}
	}

	int factorial(int number) {
		int fact = 1;
		for (int count = 1; count <= number; count++) {
			fact = fact * count;
		}
		return fact;
	}

	int fact(int n) {
		int fval = 0;
		if (n == 0 || n == 1) {
			fval = 1;
			return fval;
		} else {
			fval = n * fact(n - 1);
			return fval;
		}

	}

	void bubbleSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		log.info("\n");
		for (int i = 0; i < arr.length; i++) {
			log.info(arr[i] + "\t");
		}
	}

	void insertSort(int[] arr) {
		int temp = 0;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			int j = i - 1;
			while (j >= 0 && temp <= arr[j]) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}
		log.info("Sorted Elements are : ");
		for (int i = 0; i < arr.length; i++) {
			log.info(arr[i] + "\t");
		}
	}

	int partition(int[] arr, int lowIndex, int highIndex) {
		int pivot = arr[highIndex];
		int i = (lowIndex - 1);
		for (int j = lowIndex; j < highIndex; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[highIndex];
		arr[highIndex] = temp;
		return i + 1;
	}

	void sort(int[] arr, int lowIndex, int highIndex) {
		if (lowIndex < highIndex) {
			int pi = partition(arr, lowIndex, highIndex);
			sort(arr, lowIndex, pi - 1);
			sort(arr, pi + 1, highIndex);
		}
	}

	int removeDuplicates(int[] arr, int len) {
		if (len == 0 || len == 1) {
			return len;
		}
		int j = 0;
		for (int i = 0; i < len - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[len - 1];
		return j;
	}
}

public class NumberOperationsDemo {
	static Logger log=Logger.getLogger(NumberOperationsDemo.class.getName());
	public static void main(String[] args) {
		NumberOper numOper = new NumberOper();
		String sort="Sorted Elements are : ";
		String val1="Enter the Number : ";
		String szdt="Enter the Size of the Array : ";
		log.info("1.Swap with Third Variable" + "\n2.Swap without Third Variable"
				+ "\n3.Second Highest Array Element" + "\n4.Square Root of a Number" + "\n5.Reversing a Number"
				+ "\n6.Armstrong Number" + "\n7.Addition of Two Matrices" + "\n8.Prime Number"
				+ "\n9.Factorial of a Given Number\n1.Iterative Way\n2.Recursive Way" + "\n10.Bubble Sort"
				+ "\n11.Insertion Sort" + "\n12.Quick Sort" + "\n13.Remove Duplicate Elements in an Array");
		log.info("Enter the Operation No to be Performed : ");
		try (Scanner sc = new Scanner(System.in)) {
			int op = sc.nextInt();
			switch (op) {
			case 1:
				log.info("Enter the Number 1 : ");
				int a = sc.nextInt();
				log.info("Enter the Number 2 : ");
				int b = sc.nextInt();
				numOper.swapWithTemp(a, b);
				break;
			case 2:
				log.info("Enter the Number 1 : ");
				int num1 = sc.nextInt();
				log.info("Enter the Number 2 : ");
				int num2 = sc.nextInt();
				numOper.swapWithoutTemp(num1, num2);
				break;
			case 3:
				log.info("Enter the No.of.Array Elements : ");
				int size = sc.nextInt();
				int[] arr = new int[size];
				for (int i = 0; i < size; i++) {
					log.info(val1 + (i + 1));
					arr[i] = sc.nextInt();
				}
				numOper.findSecondArrayElem(arr);
				break;
			case 4:
				log.info(val1);
				double val = sc.nextDouble();
				numOper.findSquareRoot(val);
				break;
			case 5:
				log.info(val1);
				int num = sc.nextInt();
				numOper.reverse(num);
				break;
			case 6:
				log.info(val1);
				int val11 = sc.nextInt();
				numOper.findArmstrong(val11);
				break;
			case 7:
				int[][] mat1 = new int[3][3];
				int[][] mat2 = new int[3][3];
				log.info("Enter the Matrix 1 : ");
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						mat1[i][j] = sc.nextInt();
					}
				}
				log.info("Enter the Matrix 2 : ");
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						mat2[i][j] = sc.nextInt();
					}
				}
				numOper.addMatrix(mat1, mat2);
				break;
			case 8:
				log.info(val1);
				int number = sc.nextInt();
				numOper.checkPrime(number);
				break;
			case 9:
				log.info(val1);
				int number1 = sc.nextInt();
				log.info("Enter the Approach Number : ");
				int app = sc.nextInt();
				if (app == 1) {
					int fact = numOper.factorial(number1);
					log.info("Factorial of " + number1 + " is : " + fact);
				} else {
					int fact = numOper.fact(number1);
					log.info("Factorial of " + number1 + " is : " + fact);
				}
				break;
			case 10:
				log.info(szdt);
				int asize = sc.nextInt();
				int[] arrays = new int[asize];
				for (int i = 0; i < asize; i++) {
					log.info( val1+ (i + 1));
					arrays[i] = sc.nextInt();
				}
				numOper.bubbleSort(arrays);
				break;
			case 11:
				log.info(szdt);
				int asizes = sc.nextInt();
				int[] arr1 = new int[asizes];
				for (int i = 0; i < asizes; i++) {
					log.info(val1 + (i + 1));
					arr1[i] = sc.nextInt();
				}
				numOper.insertSort(arr1);
				break;
			case 12:
				log.info(szdt);
				int cap = sc.nextInt();
				int[] arr2 = new int[cap];
				for (int i = 0; i < cap; i++) {
					log.info(val1 + (i + 1));
					arr2[i] = sc.nextInt();
				}
				numOper.sort(arr2, 0, cap - 1);
				log.info(sort);
				for (int i = 0; i < arr2.length; i++) {
					log.info(arr2[i] + "\t");
				}
				break;
			case 13:
				log.info(szdt);
				int cap1 = sc.nextInt();
				int[] arr3 = new int[cap1];
				for (int i = 0; i < cap1; i++) {
					log.info(val1 + (i + 1));
					arr3[i] = sc.nextInt();
				}
				int valarr = numOper.removeDuplicates(arr3, cap1);
				for (int i = 0; i < valarr; i++) {
					log.info(arr3[i] + "\t");
				}
				break;
			default:
				log.info("Operation Number doesn't Match");
			}
		}

	}

}
