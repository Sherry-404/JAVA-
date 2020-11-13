/*13.3 (排 序 ArrayList ) 编写以下方法，对 ArrayList 里面保存的数字进行排序。
public static void sort(ArrayList<Number> list)*/

package 第三次java作业;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
    public static void main(String[] args) {
        Integer[] number = {1, 2, 5, 9, 20, 15, 17};
        ArrayList<Number> list = new ArrayList<>(Arrays.asList(number));//创建arrayList

        System.out.println("最初的ArrayList：" + list);
        sort(list);
        System.out.println("升序排列的ArrayList：" + list);//打印原来的和排序后的动态数组

        //测试
        list.add(100);
        list.add(18);//list加入两个新的整数
        System.out.println("加入新元素的ArrayList：" + list);//打印新的list
        sort(list);
        System.out.println("升序排列的ArrayList：" + list);//对list进行排序
    }

    public static void sort(ArrayList<Number> list) {
        Number temp = list.get(0);

        if (list.isEmpty() || list.size() == 0) {//ArrayList为空，程序结束
            System.out.println("Arraylist为空");
            return;
        }

        if(list.size()==1) System.out.println(list);//Arraylist只有一个元素，不用排序


        for (int i = 0; i < list.size(); i++) {//进行冒泡排序
            for (int j = 0; j < list.size()-i-1; j++) {
                if (list.get(j).doubleValue() > list.get(j + 1).doubleValue()) {//如果下标j的值>j+1的，两者交换，否则不变
                    temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    var set = list.set(j + 1, temp);
                }
            }
        }
    }
}