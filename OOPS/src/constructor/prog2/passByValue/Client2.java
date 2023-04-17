package constructor.prog2.passByValue;

public class Client2 {
    static void doSomethng(Student student) {
        System.out.println(student.name);  // 3. Khagesh
        student= new Student();
        System.out.println(student.name);  // 4. Null
        student.name="Khagesh Sharma";
        System.out.println(student.name);  // 5. Khagesh Sharma
    }

    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.name);  // 1. null
        st.name = "Khagesh";
        System.out.println(st.name); //2.  Khagesh
        doSomethng(st);
        System.out.println(st.name);  // 6. Khagesh
    }
}
