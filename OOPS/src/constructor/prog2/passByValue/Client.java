package constructor.prog2.passByValue;

public class Client {
    static void doSomethng(Student student) {
        System.out.println(student.name);
        student.name="Khagesh Sharma";
    }

    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.name);
        st.name = "Khagesh";
        System.out.println(st.name);
        doSomethng(st);
        System.out.println(st.name);
    }
}
