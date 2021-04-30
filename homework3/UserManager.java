package homework3;

public class UserManager {
    public void login(User user){
        user.setLogin(true);
        System.out.println("Başarıyla giriş yaptınız.");
    }

    public void logout(User user){
        user.setLogin(false);
        System.out.println("Başarıyla çıkış yaptınız.");
    }

    public void changeMail(User user, String newMail) {
        user.setEmail(newMail);
        System.out.println("E-mail adresiniz başarıyla " + newMail + " olarak güncellendi.");
    }
}
