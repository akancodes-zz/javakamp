public class CourseManager {
    public void registerCourse(Course course){
        System.out.println(course.name + " isimli kursa başarıyla kayıt oldunuz!");
    }

    public void openNotifications(Course course){
        course.notificationStatus = true;
        System.out.println(course.name + "İsimli kurs için bildirimleri aktif ettiniz.");
        System.out.println(course.notificationStatus);
    }
}
