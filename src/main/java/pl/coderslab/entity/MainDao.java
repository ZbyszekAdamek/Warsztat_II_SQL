package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {

        UserDao userDao1 = new UserDao();
/*        User user1 = new User();
        user1.setUserName("Zbyszek");
        user1.setEmail("zbiq.wassup@gmail.com");
        user1.setPassword("testowo");
        userDao1.create(user1);*/
        User read = userDao1.read(24);
        System.out.println(read);
        User[] all = userDao1.findAll();
        for (User u : all) {
            System.out.println(u);

        }
    }
}
