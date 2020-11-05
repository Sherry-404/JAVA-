/*13.13 (使得 Course 类可复制）重写程序淸单丨0-6中的 Course 类，增加一个 clone 方法，执行
students 域上的深度复制。*/

package 第三次java作业;

//在10-6的基础上，使用Cloneable接口
public class Course implements Cloneable {//以下的数据域和方法来自10-6的要求
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    //从这门课添加一个学生
    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;//学生总数增加
    }

    //返回这门课的学生
    public String[] getStudents() {
        return students;
    }

    //返回这门课的学生人数
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    //返回课程名
    public String getCourseName() {
        return courseName;
    }

    //从这门课程中删除一个学生
    public void dropStudent(String student) {//根据名字，遍历找出要drop的学生
        if (student == null) {
            System.out.println("请输入删除的学生姓名");
        }
        ;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i] == student) {//如果找到
                for (int j = i + 1; j < numberOfStudents; i++, j++) {//将该学生后面的
                    students[i] = students[j];
                }
            }
            numberOfStudents--;//学生总数减少一个
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            Course course1 = (Course) super.clone();
            course1.students = new String[100];
            System.arraycopy(students, 0, course1.students, 0, 100);
            course1.courseName = courseName;
            course1.numberOfStudents = numberOfStudents;
            return course1;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
