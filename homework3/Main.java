package homework3;

public class Main {
    public static void main(String[] args) {
        Instructor engin = new Instructor(2, "Engin", "Demirog", "engin@email.com", "123456", true, new String[]{"Java Programlama"}, new String[]{"Bayram Akan"});
        Student bayram = new Student(1,"Bayram", "Akan", "bayram@email.com", "123456", false, new String[]{"Java Programlama"}, new String[]{"Engin Demiroğ"});


        // Managers

        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();


        // System.out.println(engin.getCourses()[0]);
        instructorManager.createCourse("Java Programlama");
        instructorManager.listCourses(engin);


    }
}
