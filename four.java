/*7.10 (找出最小元素的下标）编写一个方法，求出整数数组中最小元素的下标。如果这样的元素个数
大于丨，则返回最小的下标。使用下面的方法头：*/
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        System.out.println("请输入10个数字");
        Scanner in = new Scanner(System.in);
        double[] array = new double[10];
        for(int i =0;i<array.length-1;i++){
            array[i]=in.nextDouble();
        }
        System.out.println("The index of smallest element is:"+indexOfSmallestElement(array));
    }
    public static int indexOfSmallestElement(double[] array){
        double min = array[0];
        int indexOfSmallest =0;
        for(int i=0;i<array.length-1;i++){
            if(array[i]<min){
                min = array[i];
                indexOfSmallest=i;
            }
        }return  indexOfSmallest;
    }
}