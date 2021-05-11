package pl.coderslab.entity;

import workshop2.DbUtil;

import java.sql.*;

public class UserDao {

    private static final String CREATE_USER_QUERY =
            "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";

    private static final String DELETE_USER_QUERY = "DELETE FROM users where id = ?";
    private static final String UPDATE_USER_QUERY = null;



    public User create(User user) {
        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(CREATE_USER_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getEmail());
/*            statement.setString(3, hashPassword(user.getPassword()));*/
            statement.executeUpdate();
            //Pobieramy wstawiony do bazy identyfikator, a następnie ustawiamy id obiektu user.
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                user.setId(resultSet.getInt(1));
            }
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
/*    public void delete(int userId){
        try (Connection connection = DbUtil.getConnection();
            PreparedStatement statement =
                    connection.prepareStatement(DELETE_USER_QUERY.replace("tableName", tableName));) {
            statement.setInt(1, userId);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
//    public User read(int userId){
//
//    }
    public void update(User user){

    }
//    public User[] findAll(){
//
//    }



}
/*    public String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }*/



