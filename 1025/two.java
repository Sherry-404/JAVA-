/*6.17（显示0和1构成的矩阵*/
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        int n =0;
        System.out.println("Enter n please");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("给您生成了n*n的随机01矩阵");
        printMatrix(n);
    }
    public static void printMatrix(int n){
        for(int row = 0;row <= n;row++){
            for(int col = 0;col <= n;col++){
                System.out.printf("%d ",(int)(Math.random()*2));
            }
            System.out.print("\n");
        }
    }
}