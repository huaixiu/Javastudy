package day03.demo6;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//创建键盘录入对象
		System.out.println("请输入一个整数:");
		int x = sc.nextInt();							//将键盘录入的数据存储在x中
		System.out.println(x);

        //录入两个整数
        Scanner sc1 = new Scanner(System.in);			//创建键盘录入对象
        System.out.println("请输入第一个整数:");
        int x1 = sc1.nextInt();							//将键盘录入的数据存储在x中
        System.out.println(x1);

        System.out.println("请输入第二个整数:");
        int y1 = sc1.nextInt();							//将键盘录入的数据存储在y中
        System.out.println(y1);
    }
}
