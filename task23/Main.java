import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void printTable(List<Student> students, List<StudentPoint> points) {

        Map<Integer, List<Integer>> results = new HashMap<Integer, List<Integer>>();
        for (StudentPoint point : points) {
            if (!results.containsKey(point.getStudentId())) {
                results.put(point.getStudentId(), new ArrayList<Integer>());
            }
            results.get(point.getStudentId()).add(point.getStudentPoint());
        }
        for (Student student : students) {
            List<Integer> studentPoints = results.get(student.getId());
            int s = 0;
            String sum = "(";
            if(studentPoints != null) {
                for (Integer studentpoint : studentPoints) {
                    if(s!=0) {
                        sum = sum + " + " + studentpoint;
                    }
                    else {
                        sum = sum + studentpoint;
                    }
                    s = s + studentpoint;
                }
                sum = sum + ")";
                    System.out.println(student.getName() + " = " + s + " " + sum);


            }
            else {
                System.out.println(student.getName() + " = " + "0");
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Махач"));
        students.add(new Student(2, "Иван"));
        students.add(new Student(3, "Андрей"));
        students.add(new Student(4, "Мария"));


        List<StudentPoint> list = new ArrayList<StudentPoint>();
        list.add(new StudentPoint(2, 1));
        list.add(new StudentPoint(1, 1));
        list.add(new StudentPoint(3, 1));
        list.add(new StudentPoint(1, 2));

        printTable(students, list);
    }
}

