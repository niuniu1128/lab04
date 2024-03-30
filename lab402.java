import java.util.Scanner;
public class lab402 {
	public static Scanner keyboard = new Scanner(System.in);

	public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
		System.out.print("請輸入學生人數：");
		int n = scn.nextInt();
		float sum = 0, average = 0;
		float[] score = new float[n];
		
		for(int i = 0;i < n;i++) {
			System.out.printf("第%d個學生的成績：", i + 1);
			score[i] = keyboard.nextFloat();
			sum += score[i];
		}
		
		average = sum / n;
		System.out.printf("人數：%d\n總分：%.2f\n平均：%f\n", n,sum,average);
	}
}
