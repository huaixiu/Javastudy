package day04;

public class demo2 {
    public static void main(String[] args) {
        //while 和do while的区别
		int i = 11;
		do {
			System.out.println("i = " + i);
			i++;
		}
		while (i <= 10); //细节 ;
		while(i<= 10){

		}

		System.out.println("---------------------");

		int j = 11;
		while (j <= 10) {
			System.out.println("j = " + j);
			j++;
		}


		/*
		int i = 1;
		for (;i <= 10 ;i++ ) {
			System.out.println("i = " + i);
		}
		//i在这里没有作用,已经消失




		//System.out.println("i = " + i);			for语句执行后变量会被释放,不能再使用
		System.out.println("-------------------");
		int i = 1;
		while (i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("-------------------");
		System.out.println("i = " + i);				//while语句执行后,初始化变量还可以继续使用*/

        //while语句的无限循环
		/*while (true) {
			System.out.println("hello world");
		}*/

        //System.out.println("hello world");
        //for语句的无限循环
        /*for (; ; ) {
            System.out.println("hello world");
        }*/
    }
}
