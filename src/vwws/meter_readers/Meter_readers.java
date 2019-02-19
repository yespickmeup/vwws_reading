/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.meter_readers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.ReceiptIncrementor;
import mijzcx.synapse.desk.utils.SqlStringUtil;
import vwws.util.MyConnection;

/**
 *
 * @author Guinness
 */
public class Meter_readers {

    public static class to_meter_readers {

        public final int id;
        public final String meter_reader_no;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String bday;
        public final String city;
        public final String city_id;
        public final String barangay;
        public final String barangay_id;
        public final String purok;
        public final String purok_id;
        public final String address;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;
        public final int status;
        public final String user_name;
        public final String password;

        public to_meter_readers(int id, String meter_reader_no, String fname, String mi, String lname, String bday, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, String address, String date_added, String date_updated, String added_by_id, String update_by_id, int status, String user_name, String password) {
            this.id = id;
            this.meter_reader_no = meter_reader_no;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.bday = bday;
            this.city = city;
            this.city_id = city_id;
            this.barangay = barangay;
            this.barangay_id = barangay_id;
            this.purok = purok;
            this.purok_id = purok_id;
            this.address = address;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
            this.status = status;
            this.user_name = user_name;
            this.password = password;
        }
    }

    public static void add_data(to_meter_readers to_meter_readers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into meter_readers("
                    + "meter_reader_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",bday"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",address"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + ",user_name"
                    + ",password"
                    + ")values("
                    + ":meter_reader_no"
                    + ",:fname"
                    + ",:mi"
                    + ",:lname"
                    + ",:bday"
                    + ",:city"
                    + ",:city_id"
                    + ",:barangay"
                    + ",:barangay_id"
                    + ",:purok"
                    + ",:purok_id"
                    + ",:address"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ",:status"
                    + ",:user_name"
                    + ",:password"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("meter_reader_no", to_meter_readers.meter_reader_no)
                    .setString("fname", to_meter_readers.fname)
                    .setString("mi", to_meter_readers.mi)
                    .setString("lname", to_meter_readers.lname)
                    .setString("bday", to_meter_readers.bday)
                    .setString("city", to_meter_readers.city)
                    .setString("city_id", to_meter_readers.city_id)
                    .setString("barangay", to_meter_readers.barangay)
                    .setString("barangay_id", to_meter_readers.barangay_id)
                    .setString("purok", to_meter_readers.purok)
                    .setString("purok_id", to_meter_readers.purok_id)
                    .setString("address", to_meter_readers.address)
                    .setString("date_added", to_meter_readers.date_added)
                    .setString("date_updated", to_meter_readers.date_updated)
                    .setString("added_by_id", to_meter_readers.added_by_id)
                    .setString("update_by_id", to_meter_readers.update_by_id)
                    .setNumber("status", to_meter_readers.status)
                    .setString("user_name", to_meter_readers.user_name)
                    .setString("password", to_meter_readers.password)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Meter_readers.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_downloaded(List<to_meter_readers> to_meter_readers1) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            PreparedStatement stmt = conn.prepareStatement("");
            String s2 = " delete from meter_readers ";
            stmt.addBatch(s2);
            for (to_meter_readers to_meter_readers : to_meter_readers1) {
                String s0 = "insert into meter_readers("
                        + "id"
                        + ",meter_reader_no"
                        + ",fname"
                        + ",mi"
                        + ",lname"
                        + ",bday"
                        + ",city"
                        + ",city_id"
                        + ",barangay"
                        + ",barangay_id"
                        + ",purok"
                        + ",purok_id"
                        + ",address"
                        + ",date_added"
                        + ",date_updated"
                        + ",added_by_id"
                        + ",update_by_id"
                        + ",status"
                        + ",user_name"
                        + ",password"
                        + ")values("
                        + ":id"
                        + ",:meter_reader_no"
                        + ",:fname"
                        + ",:mi"
                        + ",:lname"
                        + ",:bday"
                        + ",:city"
                        + ",:city_id"
                        + ",:barangay"
                        + ",:barangay_id"
                        + ",:purok"
                        + ",:purok_id"
                        + ",:address"
                        + ",:date_added"
                        + ",:date_updated"
                        + ",:added_by_id"
                        + ",:update_by_id"
                        + ",:status"
                        + ",:user_name"
                        + ",:password"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setNumber("id", to_meter_readers.id)
                        .setString("meter_reader_no", to_meter_readers.meter_reader_no)
                        .setString("fname", to_meter_readers.fname)
                        .setString("mi", to_meter_readers.mi)
                        .setString("lname", to_meter_readers.lname)
                        .setString("bday", to_meter_readers.bday)
                        .setString("city", to_meter_readers.city)
                        .setString("city_id", to_meter_readers.city_id)
                        .setString("barangay", to_meter_readers.barangay)
                        .setString("barangay_id", to_meter_readers.barangay_id)
                        .setString("purok", to_meter_readers.purok)
                        .setString("purok_id", to_meter_readers.purok_id)
                        .setString("address", to_meter_readers.address)
                        .setString("date_added", to_meter_readers.date_added)
                        .setString("date_updated", to_meter_readers.date_updated)
                        .setString("added_by_id", to_meter_readers.added_by_id)
                        .setString("update_by_id", to_meter_readers.update_by_id)
                        .setNumber("status", to_meter_readers.status)
                        .setString("user_name", to_meter_readers.user_name)
                        .setString("password", to_meter_readers.password)
                        .ok();
                stmt.addBatch(s0);
            }

            stmt.executeBatch();
            conn.commit();
            Lg.s(Meter_readers.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_meter_readers to_meter_readers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update meter_readers set "
                    + "meter_reader_no= :meter_reader_no "
                    + ",fname= :fname "
                    + ",mi= :mi "
                    + ",lname= :lname "
                    + ",bday= :bday "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + ",address= :address "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + ",status= :status "
                    + ",user_name= :user_name"
                    + ",password= :password"
                    + " where id='" + to_meter_readers.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("meter_reader_no", to_meter_readers.meter_reader_no)
                    .setString("fname", to_meter_readers.fname)
                    .setString("mi", to_meter_readers.mi)
                    .setString("lname", to_meter_readers.lname)
                    .setString("bday", to_meter_readers.bday)
                    .setString("city", to_meter_readers.city)
                    .setString("city_id", to_meter_readers.city_id)
                    .setString("barangay", to_meter_readers.barangay)
                    .setString("barangay_id", to_meter_readers.barangay_id)
                    .setString("purok", to_meter_readers.purok)
                    .setString("purok_id", to_meter_readers.purok_id)
                    .setString("address", to_meter_readers.address)
                    .setString("date_added", to_meter_readers.date_added)
                    .setString("date_updated", to_meter_readers.date_updated)
                    .setString("added_by_id", to_meter_readers.added_by_id)
                    .setString("update_by_id", to_meter_readers.update_by_id)
                    .setNumber("status", to_meter_readers.status)
                    .setString("user_name", to_meter_readers.user_name)
                    .setString("password", to_meter_readers.password)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Meter_readers.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_meter_readers to_meter_readers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from meter_readers  "
                    + " where id='" + to_meter_readers.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Meter_readers.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_meter_readers> ret_data(String where) {
        List<to_meter_readers> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",meter_reader_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",bday"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",address"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + ",user_name"
                    + ",password"
                    + " from meter_readers"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String meter_reader_no = rs.getString(2);
                String fname = rs.getString(3);
                String mi = rs.getString(4);
                String lname = rs.getString(5);
                String bday = rs.getString(6);
                String city = rs.getString(7);
                String city_id = rs.getString(8);
                String barangay = rs.getString(9);
                String barangay_id = rs.getString(10);
                String purok = rs.getString(11);
                String purok_id = rs.getString(12);
                String address = rs.getString(13);
                String date_added = rs.getString(14);
                String date_updated = rs.getString(15);
                String added_by_id = rs.getString(16);
                String update_by_id = rs.getString(17);
                int status = rs.getInt(18);
                String user_name = rs.getString(19);
                String password = rs.getString(20);
                to_meter_readers to = new to_meter_readers(id, meter_reader_no, fname, mi,
                                                           lname, bday, city, city_id, barangay, barangay_id, purok, purok_id,
                                                           address, date_added, date_updated, added_by_id, update_by_id,
                                                           status, user_name, password);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_meter_readers> download_from_server(String where) {
        List<to_meter_readers> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect_server();
            String s0 = "select "
                    + "id"
                    + ",meter_reader_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",bday"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",address"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + ",user_name"
                    + ",password"
                    + " from meter_readers"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String meter_reader_no = rs.getString(2);
                String fname = rs.getString(3);
                String mi = rs.getString(4);
                String lname = rs.getString(5);
                String bday = rs.getString(6);
                String city = rs.getString(7);
                String city_id = rs.getString(8);
                String barangay = rs.getString(9);
                String barangay_id = rs.getString(10);
                String purok = rs.getString(11);
                String purok_id = rs.getString(12);
                String address = rs.getString(13);
                String date_added = rs.getString(14);
                String date_updated = rs.getString(15);
                String added_by_id = rs.getString(16);
                String update_by_id = rs.getString(17);
                int status = rs.getInt(18);
                String user_name = rs.getString(19);
                String password = rs.getString(20);
                to_meter_readers to = new to_meter_readers(id, meter_reader_no, fname, mi,
                                                           lname, bday, city, city_id, barangay, barangay_id, purok, purok_id,
                                                           address, date_added, date_updated, added_by_id, update_by_id,
                                                           status, user_name, password);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close_server();
        }
    }

    public static String increment_id() {
        String id = "00000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from meter_readers";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select meter_reader_no from meter_readers where id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                }
            }
            if (id == null) {
                id = "00000";
            }
            id = ReceiptIncrementor.increment(id);
            return id;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}
