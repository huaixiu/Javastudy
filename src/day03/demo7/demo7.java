package day03.demo7;

public class demo7 {
    public static void main(String[] args) {
        int a = 40;
        int b = 50;
        int c = 30;

        if (a > b) {
            if (a > c) {
                System.out.println(a + "是最大值");
            }else {
                System.out.println(c + "是最大值");
            }

        }else {	//b >= a
            if (b > c) {
                System.out.println(b + "是最大值");
            }else {
                System.out.println(c + "是最大值");
            }
        }
    }
}
