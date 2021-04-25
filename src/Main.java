public class Main {
    public static void main(String[] args){
        Course course1 = new Course("Engin Demiroğ", "Yazılım Geliştirici Yetiştirme Kampı (C# + Angular)", 100);
        Course course2 = new Course("Engin Demiroğ", "Yazılım Geliştirici Yetiştirme Kampı (Java + React)", 36);

        Course[] courses = {
                course1,
                course2
        };

        for (Course course :
                courses) {
            System.out.println(course.name);
        }

        CourseManager courseManager = new CourseManager();

        courseManager.registerCourse(course1);
        courseManager.registerCourse(course2);

        courseManager.openNotifications(course1);

    }
}
