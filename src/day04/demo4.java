package day04;

public class demo4 {
    public static void main(String[] args) {
        for (int i = 1;i <= 5 ; i++) {				//外循环决定行数
            for (int j = 1;j <= i ;j++ ) {			//内循环决定列数
                System.out.print("*");
            }
            System.out.println();					//将光标换到下一行的行首
        }
    }
}
