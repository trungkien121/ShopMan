/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.User358;

/**
 *
 * @author Admin
 */
public class UserDAO358 extends DBContext {

    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<User358> getAll() {
        List<User358> list = new ArrayList<>();
        String query = "SELECT * FROM user";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                User358 user = new User358(rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("fullname"),
                        rs.getString("posittion"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getString("email"));
                list.add(user);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public User358 checklogin(String username, String password) {
        String query = "SELECT * FROM user where username = ? and password = ?;";
        User358 user = new User358();
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                user = new User358(rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("fullname"),
                        rs.getString("posittion"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getString("email"));
            }
        } catch (SQLException e) {
        }
        return user;
    }
}
