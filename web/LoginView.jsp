<%-- 
    Document   : login
    Created on : Sep 26, 2023, 11:29:32 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dang nhap</title>
    </head>
    <body>

        <h2> Đăng nhập </h2>
        <form name="dangnhap" action="user" method="post">
            <table border="0">
                <tr>
                    <td>Tên đăng nhập:</td>
                    <td><input type="text" name="username" id="username"
                               required /></td>
                </tr>
                <tr>
                    <td>Mật khẩu:</td>
                    <td><input type="password" name="password" id="password"
                               required /></td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="Đăng nhập" />
                        <input type="button" value="Đăng ký" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>


