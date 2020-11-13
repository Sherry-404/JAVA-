/*9.3 (使用曰期类 Date) 编写程序创建一个 Date 对象，设置它的流逝时间分别为 10000、100000、
1000000、10000000、100000000、1000000000、10000000000、100000000000, 然后使用
toStringO 方法分别显示上述日期。*/
import java.util.Date;

public class getnewDate {
    //用于显示日期
    public static void printDate(long l, Date date) {
        System.out.println("流逝时间为"+l + ": " +","+"，"+"则日期为");
        System.out.println(date.toString());
    }
    public static void main(String[] args) {
        long l = 10000;//用于记录最新的流逝时间

        Date date = new Date(l);//新建一个data
        printDate(l, date);//调用printData函数输出时间流流逝的日期
        l *= 10;//流逝时间变为10000

        //通过for循环让l不断增加，循环输出新的时间
        for(int i = 0; i < 7; i++) {
            date.setTime(l);//setTime重新设定流失时间
            printDate(l, date);
            l *= 10;
        }
    }

}

