public class Test {
    public static void main(String[] args) {

        String s= "Select * from student where where key='#studentKey=#'";
        System.out.println(s.replaceAll("#studentKey=#",null));
    }
}
