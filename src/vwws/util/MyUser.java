/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.util;

/**
 *
 * @author Guinness
 */
public class MyUser {

    public static String user_id;
    public static String user_screen_name;
    public static String user_name;
    public static String password;

    public MyUser(String user_id, String user_screen_name, String user_name, String password) {
        MyUser.user_id = user_id;
        MyUser.user_screen_name = user_screen_name;
        MyUser.user_name = user_name;
        MyUser.password = password;
    }

    public static String getUser_id() {
        try {
            return user_id;
        } catch (Exception e) {
            return "";
        }

    }

    public static void setUser_id(String user_id) {
        MyUser.user_id = user_id;
    }

    public static String getUser_screen_name() {
        try {
            return user_screen_name;
        } catch (Exception e) {
            return "";
        }

    }

    public static void setUser_screen_name(String user_screen_name) {
        MyUser.user_screen_name = user_screen_name;
    }

    public static String getUser_name() {
        try {
            return user_name;
        } catch (Exception e) {
            return "";
        }

    }

    public static void setUser_name(String user_name) {
        MyUser.user_name = user_name;
    }

    public static String getPassword() {
        try {
            return password;
        } catch (Exception e) {
            return "";
        }

    }

    public static void setPassword(String password) {
        MyUser.password = password;
    }

}
