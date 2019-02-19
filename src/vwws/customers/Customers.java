/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.customers;

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
public class Customers {

    public static class to_customers {

        public final int id;
        public final String customer_no;
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
        public final String sitio;
        public final String sitio_id;
        public final String address;
        public final double balance;
        public final String tax_dec_no;
        public final int meter_is_paid;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String updated_by_id;
        public final String occupancy_id;
        public final String occupancy;
        public final String occupancy_type_id;
        public final String occupancy_type;
        public final String occupancy_type_code;
        public final String gender;
        public final String religion;
        public final String height;
        public final String weight;
        public final String civil_status;
        public final String contact_landline;
        public final String contact_mobile;
        public final String contact_email;
        public final String meter_no;
        public final String meter_description;
        public final String serial_no;
        public final int status;
        public boolean selected;
        public to_customers(int id, String customer_no, String fname, String mi, String lname, String bday, String city, String city_id, String barangay,
                String barangay_id, String purok, String purok_id, String sitio, String sitio_id, String address, double balance, String tax_dec_no, int meter_is_paid, String date_added, String date_updated, String added_by_id, String updated_by_id, String occupancy_id, String occupancy, String occupancy_type_id, String occupancy_type, String occupancy_type_code, String gender, String religion, String height, String weight, String civil_status, String contact_landline, String contact_mobile, String contact_email, String meter_no, String meter_description, String serial_no, int status,boolean selected) {
            this.id = id;
            this.customer_no = customer_no;
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
            this.sitio = sitio;
            this.sitio_id = sitio_id;
            this.address = address;
            this.balance = balance;
            this.tax_dec_no = tax_dec_no;
            this.meter_is_paid = meter_is_paid;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.updated_by_id = updated_by_id;
            this.occupancy_id = occupancy_id;
            this.occupancy = occupancy;
            this.occupancy_type_id = occupancy_type_id;
            this.occupancy_type = occupancy_type;
            this.occupancy_type_code = occupancy_type_code;
            this.gender = gender;
            this.religion = religion;
            this.height = height;
            this.weight = weight;
            this.civil_status = civil_status;
            this.contact_landline = contact_landline;
            this.contact_mobile = contact_mobile;
            this.contact_email = contact_email;
            this.meter_no = meter_no;
            this.meter_description = meter_description;
            this.serial_no = serial_no;
            this.status = status;
            this.selected=selected;
        }

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }
        
    }

    public static void add_data(to_customers to_customers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into customers("
                    + "customer_no"
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
                    + ",sitio"
                    + ",sitio_id"
                    + ",address"
                    + ",balance"
                    + ",tax_dec_no"
                    + ",meter_is_paid"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",updated_by_id"
                    + ",occupancy_id"
                    + ",occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type"
                    + ",occupancy_type_code"
                    + ",gender"
                    + ",religion"
                    + ",height"
                    + ",weight"
                    + ",civil_status"
                    + ",contact_landline"
                    + ",contact_mobile"
                    + ",contact_email"
                    + ",meter_no"
                    + ",meter_description"
                    + ",serial_no"
                    + ",status"
                    + ")values("
                    + ":customer_no"
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
                    + ",:sitio"
                    + ",:sitio_id"
                    + ",:address"
                    + ",:balance"
                    + ",:tax_dec_no"
                    + ",:meter_is_paid"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:updated_by_id"
                    + ",:occupancy_id"
                    + ",:occupancy"
                    + ",:occupancy_type_id"
                    + ",:occupancy_type"
                    + ",:occupancy_type_code"
                    + ",:gender"
                    + ",:religion"
                    + ",:height"
                    + ",:weight"
                    + ",:civil_status"
                    + ",:contact_landline"
                    + ",:contact_mobile"
                    + ",:contact_email"
                    + ",:meter_no"
                    + ",:meter_description"
                    + ",:serial_no"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("customer_no", to_customers.customer_no)
                    .setString("fname", to_customers.fname)
                    .setString("mi", to_customers.mi)
                    .setString("lname", to_customers.lname)
                    .setString("bday", to_customers.bday)
                    .setString("city", to_customers.city)
                    .setString("city_id", to_customers.city_id)
                    .setString("barangay", to_customers.barangay)
                    .setString("barangay_id", to_customers.barangay_id)
                    .setString("purok", to_customers.purok)
                    .setString("purok_id", to_customers.purok_id)
                    .setString("sitio", to_customers.sitio)
                    .setString("sitio_id", to_customers.sitio_id)
                    .setString("address", to_customers.address)
                    .setNumber("balance", to_customers.balance)
                    .setString("tax_dec_no", to_customers.tax_dec_no)
                    .setNumber("meter_is_paid", to_customers.meter_is_paid)
                    .setString("date_added", to_customers.date_added)
                    .setString("date_updated", to_customers.date_updated)
                    .setString("added_by_id", to_customers.added_by_id)
                    .setString("updated_by_id", to_customers.updated_by_id)
                    .setString("occupancy_id", to_customers.occupancy_id)
                    .setString("occupancy", to_customers.occupancy)
                    .setString("occupancy_type_id", to_customers.occupancy_type_id)
                    .setString("occupancy_type", to_customers.occupancy_type)
                    .setString("occupancy_type_code", to_customers.occupancy_type_code)
                    .setString("gender", to_customers.gender)
                    .setString("religion", to_customers.religion)
                    .setString("height", to_customers.height)
                    .setString("weight", to_customers.weight)
                    .setString("civil_status", to_customers.civil_status)
                    .setString("contact_landline", to_customers.contact_landline)
                    .setString("contact_mobile", to_customers.contact_mobile)
                    .setString("contact_email", to_customers.contact_email)
                    .setString("meter_no", to_customers.meter_no)
                    .setString("meter_description", to_customers.meter_description)
                    .setString("serial_no", to_customers.serial_no)
                    .setNumber("status", to_customers.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Customers.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_customers to_customers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update customers set "
                    + "customer_no= :customer_no "
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
                    + ",sitio= :sitio"
                    + ",sitio_id= :sitio"
                    + ",address= :address "
                    + ",balance= :balance "
                    + ",tax_dec_no= :tax_dec_no "
                    + ",meter_is_paid= :meter_is_paid "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",updated_by_id= :updated_by_id "
                    + ",occupancy_id= :occupancy_id "
                    + ",occupancy= :occupancy "
                    + ",occupancy_type_id= :occupancy_type_id "
                    + ",occupancy_type= :occupancy_type "
                    + ",occupancy_type_code= :occupancy_type_code "
                    + ",gender= :gender "
                    + ",religion= :religion "
                    + ",height= :height "
                    + ",weight= :weight "
                    + ",civil_status= :civil_status "
                    + ",contact_landline= :contact_landline "
                    + ",contact_mobile= :contact_mobile "
                    + ",contact_email= :contact_email "
                    + ",meter_no= :meter_no "
                    + ",meter_description= :meter_description "
                    + ",serial_no= :serial_no "
                    + ",status= :status "
                    + " where id='" + to_customers.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("customer_no", to_customers.customer_no)
                    .setString("fname", to_customers.fname)
                    .setString("mi", to_customers.mi)
                    .setString("lname", to_customers.lname)
                    .setString("bday", to_customers.bday)
                    .setString("city", to_customers.city)
                    .setString("city_id", to_customers.city_id)
                    .setString("barangay", to_customers.barangay)
                    .setString("barangay_id", to_customers.barangay_id)
                    .setString("purok", to_customers.purok)
                    .setString("purok_id", to_customers.purok_id)
                    .setString("sitio", to_customers.sitio)
                    .setString("sitio_id", to_customers.sitio_id)
                    .setString("address", to_customers.address)
                    .setNumber("balance", to_customers.balance)
                    .setString("tax_dec_no", to_customers.tax_dec_no)
                    .setNumber("meter_is_paid", to_customers.meter_is_paid)
                    .setString("date_added", to_customers.date_added)
                    .setString("date_updated", to_customers.date_updated)
                    .setString("added_by_id", to_customers.added_by_id)
                    .setString("updated_by_id", to_customers.updated_by_id)
                    .setString("occupancy_id", to_customers.occupancy_id)
                    .setString("occupancy", to_customers.occupancy)
                    .setString("occupancy_type_id", to_customers.occupancy_type_id)
                    .setString("occupancy_type", to_customers.occupancy_type)
                    .setString("occupancy_type_code", to_customers.occupancy_type_code)
                    .setString("gender", to_customers.gender)
                    .setString("religion", to_customers.religion)
                    .setString("height", to_customers.height)
                    .setString("weight", to_customers.weight)
                    .setString("civil_status", to_customers.civil_status)
                    .setString("contact_landline", to_customers.contact_landline)
                    .setString("contact_mobile", to_customers.contact_mobile)
                    .setString("contact_email", to_customers.contact_email)
                    .setString("meter_no", to_customers.meter_no)
                    .setString("meter_description", to_customers.meter_description)
                    .setString("serial_no", to_customers.serial_no)
                    .setNumber("status", to_customers.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Customers.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_customers to_customers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from customers  "
                    + " where id='" + to_customers.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Customers.class, "Successfully Deleted");

//            String s2 = "delete from customer_ordered_items  "
//                    + " where customer_no='" + to_customers.customer_no + "' "
//                    + " ";
//
//            PreparedStatement stmt2 = conn.prepareStatement(s2);
//            stmt2.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_customers> ret_data(String where) {
        List<to_customers> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",customer_no"
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
                    + ",sitio"
                    + ",sitio_id"
                    + ",address"
                    + ",balance"
                    + ",tax_dec_no"
                    + ",meter_is_paid"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",updated_by_id"
                    + ",occupancy_id"
                    + ",occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type"
                    + ",occupancy_type_code"
                    + ",gender"
                    + ",religion"
                    + ",height"
                    + ",weight"
                    + ",civil_status"
                    + ",contact_landline"
                    + ",contact_mobile"
                    + ",contact_email"
                    + ",meter_no"
                    + ",meter_description"
                    + ",serial_no"
                    + ",status"
                    + " from customers"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String customer_no = rs.getString(2);
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
                String sitio = rs.getString(13);
                String sitio_id = rs.getString(14);
                String address = rs.getString(15);
                double balance = rs.getDouble(16);
                String tax_dec_no = rs.getString(17);
                int meter_is_paid = rs.getInt(18);
                String date_added = rs.getString(19);
                String date_updated = rs.getString(20);
                String added_by_id = rs.getString(21);
                String updated_by_id = rs.getString(22);
                String occupancy_id = rs.getString(23);
                String occupancy = rs.getString(24);
                String occupancy_type_id = rs.getString(25);
                String occupancy_type = rs.getString(26);
                String occupancy_type_code = rs.getString(27);
                String gender = rs.getString(28);
                String religion = rs.getString(29);
                String height = rs.getString(30);
                String weight = rs.getString(31);
                String civil_status = rs.getString(32);
                String contact_landline = rs.getString(33);
                String contact_mobile = rs.getString(34);
                String contact_email = rs.getString(35);
                String meter_no = rs.getString(36);
                String meter_description = rs.getString(37);
                String serial_no = rs.getString(38);
                int status = rs.getInt(39);
                boolean selected=false;
                to_customers to = new to_customers(id, customer_no, fname, mi, lname, bday, city, city_id, barangay, barangay_id, purok, purok_id, sitio, sitio_id, address, balance, tax_dec_no, meter_is_paid, date_added, date_updated, added_by_id, updated_by_id, occupancy_id, occupancy, occupancy_type_id, occupancy_type, occupancy_type_code, gender, religion, height, weight, civil_status, contact_landline, contact_mobile, contact_email, meter_no, meter_description, serial_no, status,selected);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static String increment_id() {
        String id = "00000000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from customers";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select customer_no from customers where id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                }
            }
            if (id == null) {
                id = "00000000";
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
