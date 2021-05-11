package pl.coderslab.entity;

import workshop2.DbUtil;

import java.sql.*;

public class UserDao {



//    public User create(User user) {
//        try (Connection conn = DbUtil.getConnection()) {
//            PreparedStatement statement =
//                    conn.prepareStatement(CREATE_USER_QUERY, Statement.RETURN_GENERATED_KEYS);
//            statement.setString(1, user.getUserName());
//            statement.setString(2, user.getEmail());
//            statement.setString(3, hashPassword(user.getPassword()));
//            statement.executeUpdate();
//            //Pobieramy wstawiony do bazy identyfikator, a następnie ustawiamy id obiektu user.
//            ResultSet resultSet = statement.getGeneratedKeys();
//            if (resultSet.next()) {
//                user.setId(resultSet.getInt(1));
//            }
//            return user;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//    public User read(int userId){
//
//    }
    public void update(User user){

    }
//    public User[] findAll(){
//
//    }
public void delete(int userId){

}

}
