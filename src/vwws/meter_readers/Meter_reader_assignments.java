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
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

import vwws.customers.Customers;
import vwws.customers.Customers.to_customers;
import vwws.util.DateType;
import vwws.util.MyConnection;

/**
 *
 * @author Guinness
 */
public class Meter_reader_assignments {

    public static class to_meter_reader_assignments {

        public final int id;
        public final String meter_reader_id;
        public final String meter_reader_no;
        public final String meter_reader_name;
        public final String customer_id;
        public final String customer_no;
        public final String customer_name;
        public final String barangay;
        public final String barangay_id;
        public final String purok;
        public final String purok_id;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public String update_by_id;
        public int status;
        public final String occupancy_id;
        public final String occupancy;
        public final String occupancy_type_id;
        public final String occupancy_type;
        public final String occupancy_type_code;
        public final String city;
        public final String city_id;
        public final String sitio;
        public final String sitio_id;
        public final String meter_no;
        public final String pipe_size;
        public to_meter_reader_assignments(int id, String meter_reader_id, String meter_reader_no, String meter_reader_name, String customer_id, String customer_no, String customer_name, String barangay, String barangay_id, String purok, String purok_id, String date_added, String date_updated, String added_by_id, String update_by_id, int status, String occupancy_id, String occupancy, String occupancy_type_id, String occupancy_type,
                String occupancy_type_code, String city, String city_id, String sitio, String sitio_id, String meter_no,String pipe_size) {
            this.id = id;
            this.meter_reader_id = meter_reader_id;
            this.meter_reader_no = meter_reader_no;
            this.meter_reader_name = meter_reader_name;
            this.customer_id = customer_id;
            this.customer_no = customer_no;
            this.customer_name = customer_name;
            this.barangay = barangay;
            this.barangay_id = barangay_id;
            this.purok = purok;
            this.purok_id = purok_id;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
            this.status = status;
            this.occupancy_id = occupancy_id;
            this.occupancy = occupancy;
            this.occupancy_type_id = occupancy_type_id;
            this.occupancy_type = occupancy_type;
            this.occupancy_type_code = occupancy_type_code;
            this.city = city;
            this.city_id = city_id;
            this.sitio = sitio;
            this.sitio_id = sitio_id;
            this.meter_no = meter_no;
            this.pipe_size=pipe_size;
        }

        public String getUpdate_by_id() {
            return update_by_id;
        }

        public void setUpdate_by_id(String update_by_id) {
            this.update_by_id = update_by_id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }

    public static void add_data(List<to_meter_reader_assignments> to_meter_reader_assignments1) {
        try {
            Connection conn = MyConnection.connect();
            for (to_meter_reader_assignments to_meter_reader_assignments : to_meter_reader_assignments1) {
                if (to_meter_reader_assignments.id == 0) {
                    String s0 = "insert into meter_reader_assignments("
                            + "meter_reader_id"
                            + ",meter_reader_no"
                            + ",meter_reader_name"
                            + ",customer_id"
                            + ",customer_no"
                            + ",customer_name"
                            + ",barangay"
                            + ",barangay_id"
                            + ",purok"
                            + ",purok_id"
                            + ",date_added"
                            + ",date_updated"
                            + ",added_by_id"
                            + ",update_by_id"
                            + ",status"
                            + ",occupancy_id"
                            + ",occupancy"
                            + ",occupancy_type_id"
                            + ",occupancy_type"
                            + ",occupancy_type_code"
                            + ",city"
                            + ",city_id"
                            + ",sitio"
                            + ",sitio_id"
                            + ",meter_no"
                            + ",pipe_size"
                            + ")values("
                            + ":meter_reader_id"
                            + ",:meter_reader_no"
                            + ",:meter_reader_name"
                            + ",:customer_id"
                            + ",:customer_no"
                            + ",:customer_name"
                            + ",:barangay"
                            + ",:barangay_id"
                            + ",:purok"
                            + ",:purok_id"
                            + ",:date_added"
                            + ",:date_updated"
                            + ",:added_by_id"
                            + ",:update_by_id"
                            + ",:status"
                            + ",:occupancy_id"
                            + ",:occupancy"
                            + ",:occupancy_type_id"
                            + ",:occupancy_type"
                            + ",:occupancy_type_code"
                            + ",:city"
                            + ",:city_id"
                            + ",:sitio"
                            + ",:sitio_id"
                            + ",:meter_no"
                            + ",:pipe_size"
                            + ")";

                    s0 = SqlStringUtil.parse(s0)
                            .setString("meter_reader_id", to_meter_reader_assignments.meter_reader_id)
                            .setString("meter_reader_no", to_meter_reader_assignments.meter_reader_no)
                            .setString("meter_reader_name", to_meter_reader_assignments.meter_reader_name)
                            .setString("customer_id", to_meter_reader_assignments.customer_id)
                            .setString("customer_no", to_meter_reader_assignments.customer_no)
                            .setString("customer_name", to_meter_reader_assignments.customer_name)
                            .setString("barangay", to_meter_reader_assignments.barangay)
                            .setString("barangay_id", to_meter_reader_assignments.barangay_id)
                            .setString("purok", to_meter_reader_assignments.purok)
                            .setString("purok_id", to_meter_reader_assignments.purok_id)
                            .setString("date_added", to_meter_reader_assignments.date_added)
                            .setString("date_updated", to_meter_reader_assignments.date_updated)
                            .setString("added_by_id", to_meter_reader_assignments.added_by_id)
                            .setString("update_by_id", to_meter_reader_assignments.update_by_id)
                            .setNumber("status", to_meter_reader_assignments.status)
                            .setString("occupancy_id", to_meter_reader_assignments.occupancy_id)
                            .setString("occupancy", to_meter_reader_assignments.occupancy)
                            .setString("occupancy_type_id", to_meter_reader_assignments.occupancy_type_id)
                            .setString("occupancy_type", to_meter_reader_assignments.occupancy_type)
                            .setString("occupancy_type_code", to_meter_reader_assignments.occupancy_type_code)
                            .setString("city", to_meter_reader_assignments.city)
                            .setString("city_id", to_meter_reader_assignments.city_id)
                            .setString("sitio", to_meter_reader_assignments.sitio)
                            .setString("sitio_id", to_meter_reader_assignments.sitio_id)
                            .setString("meter_no", to_meter_reader_assignments.meter_no)
                            .setString("pipe_size",to_meter_reader_assignments.pipe_size)
                            .ok();

                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();
                    Lg.s(Meter_reader_assignments.class, "Successfully Added");
                } else {
                    String s0 = "update meter_reader_assignments set "
                            + "meter_reader_id= :meter_reader_id "
                            + ",meter_reader_no= :meter_reader_no "
                            + ",meter_reader_name= :meter_reader_name "
                            + " where id='" + to_meter_reader_assignments.id + "' "
                            + " ";

                    s0 = SqlStringUtil.parse(s0)
                            .setString("meter_reader_id", to_meter_reader_assignments.meter_reader_id)
                            .setString("meter_reader_no", to_meter_reader_assignments.meter_reader_no)
                            .setString("meter_reader_name", to_meter_reader_assignments.meter_reader_name)
                            .ok();

                    PreparedStatement stmt = conn.prepareStatement(s0);
                    stmt.execute();
                    Lg.s(Meter_reader_assignments.class, "Successfully Updated");
                }

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_downloaded(List<to_meter_reader_assignments> to_meter_reader_assignments1) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            PreparedStatement stmt = conn.prepareStatement("");
            String s = " delete from meter_reader_assignments";
            stmt.addBatch(s);
            for (to_meter_reader_assignments to_meter_reader_assignments : to_meter_reader_assignments1) {
                String s0 = "insert into meter_reader_assignments("
                        + "id"
                        + ",meter_reader_id"
                        + ",meter_reader_no"
                        + ",meter_reader_name"
                        + ",customer_id"
                        + ",customer_no"
                        + ",customer_name"
                        + ",barangay"
                        + ",barangay_id"
                        + ",purok"
                        + ",purok_id"
                        + ",date_added"
                        + ",date_updated"
                        + ",added_by_id"
                        + ",update_by_id"
                        + ",status"
                        + ",occupancy_id"
                        + ",occupancy"
                        + ",occupancy_type_id"
                        + ",occupancy_type"
                        + ",occupancy_type_code"
                        + ",city"
                        + ",city_id"
                        + ",sitio"
                        + ",sitio_id"
                        + ",meter_no"
                        + ",pipe_size"
                        + ")values("
                        + ":id"
                        + ",:meter_reader_id"
                        + ",:meter_reader_no"
                        + ",:meter_reader_name"
                        + ",:customer_id"
                        + ",:customer_no"
                        + ",:customer_name"
                        + ",:barangay"
                        + ",:barangay_id"
                        + ",:purok"
                        + ",:purok_id"
                        + ",:date_added"
                        + ",:date_updated"
                        + ",:added_by_id"
                        + ",:update_by_id"
                        + ",:status"
                        + ",:occupancy_id"
                        + ",:occupancy"
                        + ",:occupancy_type_id"
                        + ",:occupancy_type"
                        + ",:occupancy_type_code"
                        + ",:city"
                        + ",:city_id"
                        + ",:sitio"
                        + ",:sitio_id"
                        + ",:meter_no"
                        + ",:pipe_size"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setNumber("id", to_meter_reader_assignments.id)
                        .setString("meter_reader_id", to_meter_reader_assignments.meter_reader_id)
                        .setString("meter_reader_no", to_meter_reader_assignments.meter_reader_no)
                        .setString("meter_reader_name", to_meter_reader_assignments.meter_reader_name)
                        .setString("customer_id", to_meter_reader_assignments.customer_id)
                        .setString("customer_no", to_meter_reader_assignments.customer_no)
                        .setString("customer_name", to_meter_reader_assignments.customer_name)
                        .setString("barangay", to_meter_reader_assignments.barangay)
                        .setString("barangay_id", to_meter_reader_assignments.barangay_id)
                        .setString("purok", to_meter_reader_assignments.purok)
                        .setString("purok_id", to_meter_reader_assignments.purok_id)
                        .setString("date_added", to_meter_reader_assignments.date_added)
                        .setString("date_updated", to_meter_reader_assignments.date_updated)
                        .setString("added_by_id", to_meter_reader_assignments.added_by_id)
                        .setString("update_by_id", to_meter_reader_assignments.update_by_id)
                        .setNumber("status", to_meter_reader_assignments.status)
                        .setString("occupancy_id", to_meter_reader_assignments.occupancy_id)
                        .setString("occupancy", to_meter_reader_assignments.occupancy)
                        .setString("occupancy_type_id", to_meter_reader_assignments.occupancy_type_id)
                        .setString("occupancy_type", to_meter_reader_assignments.occupancy_type)
                        .setString("occupancy_type_code", to_meter_reader_assignments.occupancy_type_code)
                        .setString("city", to_meter_reader_assignments.city)
                        .setString("city_id", to_meter_reader_assignments.city_id)
                        .setString("sitio", to_meter_reader_assignments.sitio)
                        .setString("sitio_id", to_meter_reader_assignments.sitio_id)
                        .setString("meter_no", to_meter_reader_assignments.meter_no)
                        .setString("pipe_size",to_meter_reader_assignments.pipe_size)
                        .ok();
                 
                stmt.addBatch(s0);

            }
            stmt.executeBatch();
            conn.commit();
            Lg.s(Meter_reader_assignments.class, "Successfully Added");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_meter_reader_assignments to_meter_reader_assignments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into meter_reader_assignments("
                    + "meter_reader_id"
                    + ",meter_reader_no"
                    + ",meter_reader_name"
                    + ",customer_id"
                    + ",customer_no"
                    + ",customer_name"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + ",occupancy_id"
                    + ",occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type"
                    + ",occupancy_type_code"
                    + ",city"
                    + ",city_id"
                    + ",sitio"
                    + ",sitio_id"
                    + ",meter_no"
                    + ",pipe_size"
                    + ")values("
                    + ":meter_reader_id"
                    + ",:meter_reader_no"
                    + ",:meter_reader_name"
                    + ",:customer_id"
                    + ",:customer_no"
                    + ",:customer_name"
                    + ",:barangay"
                    + ",:barangay_id"
                    + ",:purok"
                    + ",:purok_id"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ",:status"
                    + ",:occupancy_id"
                    + ",:occupancy"
                    + ",:occupancy_type_id"
                    + ",:occupancy_type"
                    + ",:occupancy_type_code"
                    + ",:city"
                    + ",:city_id"
                    + ",:sitio"
                    + ",:sitio_id"
                    + ",:meter_no"
                    + ",:pipe_size"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("meter_reader_id", to_meter_reader_assignments.meter_reader_id)
                    .setString("meter_reader_no", to_meter_reader_assignments.meter_reader_no)
                    .setString("meter_reader_name", to_meter_reader_assignments.meter_reader_name)
                    .setString("customer_id", to_meter_reader_assignments.customer_id)
                    .setString("customer_no", to_meter_reader_assignments.customer_no)
                    .setString("customer_name", to_meter_reader_assignments.customer_name)
                    .setString("barangay", to_meter_reader_assignments.barangay)
                    .setString("barangay_id", to_meter_reader_assignments.barangay_id)
                    .setString("purok", to_meter_reader_assignments.purok)
                    .setString("purok_id", to_meter_reader_assignments.purok_id)
                    .setString("date_added", to_meter_reader_assignments.date_added)
                    .setString("date_updated", to_meter_reader_assignments.date_updated)
                    .setString("added_by_id", to_meter_reader_assignments.added_by_id)
                    .setString("update_by_id", to_meter_reader_assignments.update_by_id)
                    .setNumber("status", to_meter_reader_assignments.status)
                    .setString("occupancy_id", to_meter_reader_assignments.occupancy_id)
                    .setString("occupancy", to_meter_reader_assignments.occupancy)
                    .setString("occupancy_type_id", to_meter_reader_assignments.occupancy_type_id)
                    .setString("occupancy_type", to_meter_reader_assignments.occupancy_type)
                    .setString("occupancy_type_code", to_meter_reader_assignments.occupancy_type_code)
                    .setString("city", to_meter_reader_assignments.city)
                    .setString("city_id", to_meter_reader_assignments.city_id)
                    .setString("sitio", to_meter_reader_assignments.sitio)
                    .setString("sitio_id", to_meter_reader_assignments.sitio_id)
                    .setString("meter_no", to_meter_reader_assignments.meter_no)
                    .setString("pipe_size",to_meter_reader_assignments.pipe_size)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Meter_reader_assignments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_meter_reader_assignments to_meter_reader_assignments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from meter_reader_assignments  "
                    + " where id='" + to_meter_reader_assignments.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Meter_reader_assignments.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_meter_reader_assignments> ret_data(String where) {
        List<to_meter_reader_assignments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + " mra.id"
                    + ",mra.meter_reader_id"
                    + ",mra.meter_reader_no"
                    + ",mra.meter_reader_name"
                    + ",mra.customer_id"
                    + ",mra.customer_no"
                    + ",mra.customer_name"
                    + ",mra.barangay"
                    + ",mra.barangay_id"
                    + ",mra.purok"
                    + ",mra.purok_id"
                    + ",mra.date_added"
                    + ",mra.date_updated"
                    + ",mra.added_by_id"
                    + ",ifnull(r.id,0)"
                    + ",ifnull(r.status,0)"
                    + ",mra.occupancy_id"
                    + ",mra.occupancy"
                    + ",mra.occupancy_type_id"
                    + ",mra.occupancy_type"
                    + ",mra.occupancy_type_code"
                    + ",c.city"
                    + ",c.city_id"
                    + ",c.sitio"
                    + ",c.sitio_id"
                    + ",c.meter_no"
                    + ",mra.pipe_size"
                    + " from meter_reader_assignments mra "
                    + " left join readings r "
                    + " on r.customer_id=mra.customer_id "
                    + " " + where;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String meter_reader_id = rs.getString(2);
                String meter_reader_no = rs.getString(3);
                String meter_reader_name = rs.getString(4);
                String customer_id = rs.getString(5);
                String customer_no = rs.getString(6);
                String customer_name = rs.getString(7);
                String barangay = rs.getString(8);
                String barangay_id = rs.getString(9);
                String purok = rs.getString(10);
                String purok_id = rs.getString(11);
                String date_added = rs.getString(12);
                String date_updated = rs.getString(13);
                String added_by_id = rs.getString(14);
                String update_by_id = rs.getString(15);
                int status = rs.getInt(16);
                String occupancy_id = rs.getString(17);
                String occupancy = rs.getString(18);
                String occupancy_type_id = rs.getString(19);
                String occupancy_type = rs.getString(20);
                String occupancy_type_code = rs.getString(21);
                String city = rs.getString(22);
                String city_id = rs.getString(23);
                String sitio = rs.getString(24);
                String sitio_id = rs.getString(25);
                String meter_no = rs.getString(26);
                String pipe_size=rs.getString(27);
                to_meter_reader_assignments to = new to_meter_reader_assignments(id, meter_reader_id, meter_reader_no, meter_reader_name, customer_id, customer_no, customer_name, barangay, barangay_id, purok, purok_id, date_added, date_updated, added_by_id, update_by_id, status, occupancy_id, occupancy, occupancy_type_id, occupancy_type, occupancy_type_code, city, city_id, sitio, sitio_id, meter_no,pipe_size);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<Customers.to_customers> ret_customers(String where) {
        List<Customers.to_customers> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + " c.id"
                    + ",c.customer_no"
                    + ",ifnull(c.fname,'')"
                    + ",ifnull(c.mi,'')"
                    + ",ifnull(c.lname,'')"
                    + ",c.bday"
                    + ",c.city"
                    + ",c.city_id"
                    + ",c.barangay"
                    + ",c.barangay_id"
                    + ",c.purok"
                    + ",c.purok_id"
                    + ",c.sitio"
                    + ",c.sitio_id"
                    + ",c.address"
                    + ",c.balance"
                    + ",ifnull(mra.meter_reader_name,'')"
                    + ",ifnull(mra.id,'0')"
                    + ",c.date_added"
                    + ",c.date_updated"
                    + ",c.added_by_id"
                    + ",c.updated_by_id"
                    + ",ifnull(mra.status,0)"
                    + ",c.occupancy_id"
                    + ",c.occupancy"
                    + ",c.occupancy_type_id"
                    + ",c.occupancy_type"
                    + ",c.occupancy_type_code"
                    + ",c.gender"
                    + ",c.religion"
                    + ",c.height"
                    + ",c.weight"
                    + ",c.civil_status"
                    + ",c.contact_landline"
                    + ",c.contact_mobile"
                    + ",c.contact_email"
                    + ",c.meter_no"
                    + ",c.meter_description"
                    + ",c.serial_no"
                    + " from customers c "
                    + " left join meter_reader_assignments mra "
                    + " on c.id = mra.customer_id "
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
                int status = rs.getInt(23);

                String occupancy_id = rs.getString(24);
                String occupancy = rs.getString(25);
                String occupancy_type_id = rs.getString(26);
                String occupancy_type = rs.getString(27);
                String occupancy_type_code = rs.getString(28);
                String gender = rs.getString(29);
                String religion = rs.getString(30);
                String height = rs.getString(31);
                String weight = rs.getString(32);
                String civil_status = rs.getString(33);
                String contact_landline = rs.getString(34);
                String contact_mobile = rs.getString(35);
                String contact_email = rs.getString(36);
                String meter_no = rs.getString(37);
                String meter_description = rs.getString(38);
                String serial_no = rs.getString(39);
                boolean selected = false;

                to_customers to = new to_customers(id, customer_no, fname, mi, lname, bday, city, city_id, barangay, barangay_id, purok, purok_id, sitio, sitio_id, address, balance, tax_dec_no, meter_is_paid, date_added, date_updated, added_by_id, updated_by_id, occupancy_id, occupancy, occupancy_type_id, occupancy_type, occupancy_type_code, gender, religion, height, weight, civil_status, contact_landline, contact_mobile, contact_email, meter_no, meter_description, serial_no, status, selected);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_meter_reader_assignments> ret_assignments(String where) {
        List<to_meter_reader_assignments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",meter_reader_id"
                    + ",meter_reader_no"
                    + ",meter_reader_name"
                    + ",customer_id"
                    + ",customer_no"
                    + ",customer_name"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + ",occupancy_id"
                    + ",occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type"
                    + ",occupancy_type_code"
                    + ",city"
                    + ",city_id"
                    + ",sitio"
                    + ",sitio_id"
                    + ",ifnull(meter_no,'')"
                    + ",pipe_size"
                    + " from meter_reader_assignments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String meter_reader_id = rs.getString(2);
                String meter_reader_no = rs.getString(3);
                String meter_reader_name = rs.getString(4);
                String customer_id = rs.getString(5);
                String customer_no = rs.getString(6);
                String customer_name = rs.getString(7);
                String barangay = rs.getString(8);
                String barangay_id = rs.getString(9);
                String purok = rs.getString(10);
                String purok_id = rs.getString(11);
                String date_added = rs.getString(12);
                String date_updated = rs.getString(13);
                String added_by_id = rs.getString(14);
                String update_by_id = rs.getString(15);
                int status = rs.getInt(16);
                String occupancy_id = rs.getString(17);
                String occupancy = rs.getString(18);
                String occupancy_type_id = rs.getString(19);
                String occupancy_type = rs.getString(20);
                String occupancy_type_code = rs.getString(21);
                String city = rs.getString(22);
                String city_id = rs.getString(23);
                String sitio = rs.getString(24);
                String sitio_id = rs.getString(25);
                String meter_no = rs.getString(26);
                String pipe_size=rs.getString(27);
                to_meter_reader_assignments to = new to_meter_reader_assignments(id, meter_reader_id, meter_reader_no, meter_reader_name, customer_id, customer_no, customer_name, barangay, barangay_id, purok, purok_id, date_added, date_updated, added_by_id, update_by_id, status, occupancy_id, occupancy, occupancy_type_id, occupancy_type, occupancy_type_code, city, city_id, sitio, sitio_id, meter_no,pipe_size);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_meter_reader_assignments> ret_assignments2(String where) {
        List<to_meter_reader_assignments> datas = new ArrayList();
        int year = FitIn.toInt(DateType.y.format(new Date()));
        int month = FitIn.toInt(DateType.m1.format(new Date()));

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "mra.id"
                    + ",mra.meter_reader_id"
                    + ",mra.meter_reader_no"
                    + ",mra.meter_reader_name"
                    + ",mra.customer_id"
                    + ",mra.customer_no"
                    + ",mra.customer_name"
                    + ",mra.barangay"
                    + ",mra.barangay_id"
                    + ",mra.purok"
                    + ",mra.purok_id"
                    + ",mra.date_added"
                    + ",mra.date_updated"
                    + ",mra.added_by_id"
                    + ",mra.update_by_id"
                    + ",mra.status"
                    + ",mra.occupancy_id"
                    + ",mra.occupancy"
                    + ",mra.occupancy_type_id"
                    + ",mra.occupancy_type"
                    + ",mra.occupancy_type_code"
                    + ",mra.city"
                    + ",mra.city_id"
                    + ",mra.sitio"
                    + ",mra.sitio_id"
                    + ",ifnull(mra.meter_no,'')"
                    + ",mra.pipe_size"
                    + " from meter_reader_assignments mra "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String meter_reader_id = rs.getString(2);
                String meter_reader_no = rs.getString(3);
                String meter_reader_name = rs.getString(4);
                String customer_id = rs.getString(5);
                String customer_no = rs.getString(6);
                String customer_name = rs.getString(7);
                String barangay = rs.getString(8);
                String barangay_id = rs.getString(9);
                String purok = rs.getString(10);
                String purok_id = rs.getString(11);
                String date_added = rs.getString(12);
                String date_updated = rs.getString(13);
                String added_by_id = rs.getString(14);
                String update_by_id = rs.getString(15);
                int status = 0;
                String occupancy_id = rs.getString(17);
                String occupancy = rs.getString(18);
                String occupancy_type_id = rs.getString(19);
                String occupancy_type = rs.getString(20);
                String occupancy_type_code = rs.getString(21);
                String city = rs.getString(22);
                String city_id = rs.getString(23);
                String sitio = rs.getString(24);
                String sitio_id = rs.getString(25);
                String meter_no = rs.getString(26);
                String pipe_size=rs.getString(27);
                String s2 = "select "
                        + " id"
                        + ",customer_id"
                        + ",created_at"
                        + " from readings"
                        + " where customer_id='" + customer_id + "' order by created_at desc limit 1";

                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                Date d = new Date();
                if (rs2.next()) {

                    String date = rs2.getString(3);
                    try {
                        d = DateType.datetime.parse(date);
                        int year2 = FitIn.toInt(DateType.y.format(d));
                        int month2 = FitIn.toInt(DateType.m1.format(d));
                        if (year == year2 && month == month2) {
                            status = 1;
                            update_by_id = "" + rs2.getInt(1);
                        }
                    } catch (ParseException ex) {
                        Logger.getLogger(Meter_reader_assignments.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                to_meter_reader_assignments to = new to_meter_reader_assignments(id, meter_reader_id, meter_reader_no, meter_reader_name, customer_id, customer_no, customer_name, barangay, barangay_id, purok, purok_id, date_added, date_updated, added_by_id, update_by_id, status, occupancy_id, occupancy, occupancy_type_id, occupancy_type, occupancy_type_code, city, city_id, sitio, sitio_id, meter_no,pipe_size);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_meter_reader_assignments> ret_data_server(String where) {
        List<to_meter_reader_assignments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect_server();
            String s0 = "select "
                    + "id"
                    + ",meter_reader_id"
                    + ",meter_reader_no"
                    + ",meter_reader_name"
                    + ",customer_id"
                    + ",customer_no"
                    + ",customer_name"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + ",occupancy_id"
                    + ",occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type"
                    + ",occupancy_type_code"
                    + ",city"
                    + ",city_id"
                    + ",sitio"
                    + ",sitio_id"
                    + ",meter_no"
                    + ",pipe_size"
                    + " from meter_reader_assignments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String meter_reader_id = rs.getString(2);
                String meter_reader_no = rs.getString(3);
                String meter_reader_name = rs.getString(4);
                String customer_id = rs.getString(5);
                String customer_no = rs.getString(6);
                String customer_name = rs.getString(7);
                String barangay = rs.getString(8);
                String barangay_id = rs.getString(9);
                String purok = rs.getString(10);
                String purok_id = rs.getString(11);
                String date_added = rs.getString(12);
                String date_updated = rs.getString(13);
                String added_by_id = rs.getString(14);
                String update_by_id = rs.getString(15);
                int status = rs.getInt(16);
                String occupancy_id = rs.getString(17);
                String occupancy = rs.getString(18);
                String occupancy_type_id = rs.getString(19);
                String occupancy_type = rs.getString(20);
                String occupancy_type_code = rs.getString(21);
                String city = rs.getString(22);
                String city_id = rs.getString(23);
                String sitio = rs.getString(24);
                String sitio_id = rs.getString(25);
                String meter_no = rs.getString(26);
                String pipe_size=rs.getString(27);
               
                to_meter_reader_assignments to = new to_meter_reader_assignments(id, meter_reader_id, meter_reader_no, meter_reader_name, customer_id, customer_no, customer_name, barangay, barangay_id, purok, purok_id, date_added, date_updated, added_by_id, update_by_id, status, occupancy_id, occupancy, occupancy_type_id, occupancy_type, occupancy_type_code, city, city_id, sitio, sitio_id, meter_no,pipe_size);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close_server();
        }
    }

}
