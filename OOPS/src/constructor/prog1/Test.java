package constructor.prog1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    List<Student> studentList;
    int strength;

    public static void main(String[] args) {
        Test t = new Test();

        t.studentList = new ArrayList<>();
        t.studentList.add(new Student("khagesh", "Male", 29));
        t.studentList.add(new Student("Raveena", "Female", 24));

        System.out.println(t.studentList);     // Null Pointer exception if not created the list
        t.strength = t.studentList.size();
        System.out.println(t.studentList);
        System.out.println(t.studentList.get(0));
        System.out.println(t.studentList.get(0).name + " " + t.studentList.get(0).gender + " " + t.studentList.get(0).age);

    }
}
