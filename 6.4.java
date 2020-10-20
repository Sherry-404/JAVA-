import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(number + "反向数为" + reverse(number));

    }

    public static int reverse(int number) {
        int temp = 0;
        int a = 0;
        while (number != 0) {
            a = number % 10;
            number = number / 10;
            temp = temp * 10 + a;

        }
        return temp;
    }
}