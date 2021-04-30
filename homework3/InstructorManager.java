package homework3;

import java.util.ArrayList;

public class InstructorManager extends UserManager {
    public void createCourse(String courseName) {
        System.out.println("Başarıyla " + courseName +" isimli kursu eklediniz!");
    }

    public void listCourses(Instructor instructor){
        for (int i = 0; i < instructor.getCourses().length; i++) {
            System.out.println(instructor.getCourses()[i]);
        }
    }
}
