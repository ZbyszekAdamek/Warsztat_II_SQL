package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName("arek");
        user.setEmail("arkadiusz.jozwiak@coderslab.pl");
        user.setPassword("pass");
        userDao.create(user);

        User read = userDao.read(15);
        System.out.println(read);
        User secondUser = new User();
        secondUser.setUserName("marek");
        secondUser.setEmail("marek@coderslab.pl");
        secondUser.setPassword("pass");
        userDao.create(secondUser);
        User[] all = userDao.findAll();
        for (User u : all) {
            System.out.println(u);
            userDao.delete(1);
            userDao.delete(2);
        }
    }
}
