package com.builderDesignPattern;

/*
 To Solve problem of client 1 and client 2, we can create another class this is called the helper class.

* */

// Helper Class
public class Client3 {
    public static void main(String[] args) {
        Helper helper = new Helper();
        helper.firstName = "Krish";
        helper.lastName = "Sharma";
        helper.age = 30;
        helper.university = "RGPV";

        Student3 st = new Student3(helper);
        st.studentWithUniversity(helper);

        // to access student3 attribute, need to create getter.
        System.out.println(st.getFirstName()+" : "+st.getLastName()+" : "+st.getAge()+" : "+st.getPsp());
    }
}
