package day03.demo4;

public class demo4 {
    public static void main(String[] args)
    {
        int x = 3;
        int y = 4;
        System.out.println((++x == 3) & (++y == 4));	//false & false = false
        System.out.println("x = " + x);					//x = 4
        System.out.println("y = " + y);					//y = 5
        System.out.println("---------------------------");
        System.out.println((++x == 3) && (++y == 4));	//false & false = false
        System.out.println("x = " + x);					//x = 4
        System.out.println("y = " + y);					//y = 4
    }
}
