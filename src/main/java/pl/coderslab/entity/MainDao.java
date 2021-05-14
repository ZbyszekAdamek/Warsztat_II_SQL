package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {

        UserDao userDao1 = new UserDao();
        User read = userDao1.read(24);
        System.out.println(read);

    }
}

