package homework3;

public class Instructor extends User {
    String[] courses;
    String[] students;

    public Instructor(int id, String firstName, String lastName, String email, String password, Boolean isLogin, String[] courses, String[] students) {
        super(id, firstName, lastName, email, password, isLogin);
        this.courses = courses;
        this.students = students;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }
}
