/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.util;

import mijzcx.synapse.desk.utils.FitIn;

/**
 *
 * @author Guinness
 */
public class DatePrevious {

    public static void main(String[] args) {
        String[] str = DatePrevious.get("12", "2015");
        System.out.println(str[0]);
        System.out.println(str[1]);
    }

    public static String[] get(String month, String year) {
        int m = FitIn.toInt(month);
        int y = FitIn.toInt(year);
        if (m == 1) {
            y--;
            m = 12;
        } else {
            m--;
        }
        String[] str = new String[2];
        str[0] = "" + m;
        if (str[0].length() == 1) {
            str[0] = "0" + str[0];
        }
        str[1] = "" + y;
        return str;
    }

}
