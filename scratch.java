class Scratch {
    public static void main(String[] args) {
        import java.util.Scanner;
/**
 * @author 冰樱梦
 * 时间：2018年12月
 * 题目：求矩阵主对角线元素的和
 *
 */
        public class Exercise08_02 {
            public static void main(String[] args){
                Scanner input=new Scanner(System.in);
                System.out.println("Enter the arrays row: ");
                int row=input.nextInt();
                System.out.println("Enter the arrays column: ");
                int col=input.nextInt();
                double[][] list=new double[row][col];
                for(int i=0;i<list.length;i++){
                    for(int j=0;j<list[i].length;j++){
                        list[i][j]=input.nextDouble();
                    }
                }
                System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(list));
            }



            /**
             * @param m
             * @return
             * 返回主对角线的和
             */
            public static double sumMajorDiagonal(double [][] m){
                double total=0;
                for(int i=0;i<m.length;i++){
                    total+=m[i][i];
                }
                return total;
            }
        }

    }
}