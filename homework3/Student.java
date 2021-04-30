package homework3;

public class Student extends User {
    String[] registeredCourses;
    String[] instructors;

    public Student(int id, String firstName, String lastName, String email, String password, Boolean isLogin, String[] registeredCourses, String[] instructors) {
        super(id, firstName, lastName, email, password, isLogin);
        this.registeredCourses = registeredCourses;
        this.instructors = instructors;
    }

    public String[] getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(String[] registeredCourses) {
        this.registeredCourses = registeredCourses;
    }

    public String[] getInstructors() {
        return instructors;
    }

    public void setInstructors(String[] instructors) {
        this.instructors = instructors;
    }
}
