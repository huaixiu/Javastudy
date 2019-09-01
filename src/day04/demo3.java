package day04;

public class demo3 {
    public static void main(String[] args) {
		/*for (int i = 1;i <= 3 ;i++ ) {					//外循环
			System.out.println("i = " + i);
			for (int j = 1;j <= 3 ;j++ ) {				//内循环
				System.out.println("j = " + j);
			}
		}*/

        for (int i = 1;i <= 4 ;i++ ) {					//外循环决定的是行数



            //循环体
            for (int j = 1;j <= 5 ;j++ ) {				//内循环决定的是列数
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
