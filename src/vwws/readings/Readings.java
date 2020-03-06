/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.readings;

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
import vwws.meter_readers.Meter_reader_assignments.to_meter_reader_assignments;
import vwws.util.Alert;
import vwws.util.MyConnection;
/**
 *
 * @author Guinness
 */
public class Readings {

    public static class to_readings {

        public final int id;
        public final String reading_no;
        public final String meter_reader_id;
        public final String meter_reader_name;
        public final String customer_id;
        public final String customer_no;
        public final String customer_name;
        public final String customer_meter_no;
        public final String previous_reading_date;
        public final double previous_reading;
        public final double current_reading;
        public final String city;
        public final String city_id;
        public final String barangay;
        public final String barangay_id;
        public final String purok;
        public final String purok_id;
        public final String sitio;
        public final String sitio_id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final String occupancy_id;
        public final String occupancy;
        public final String occupancy_type_id;
        public final String occupancy_type;
        public final String occupancy_type_code;
        public final double actual_consumption;
        public double amount_due;
        public double mf;
        public double mr;
        public double interest;
        public double discount;
        public double net_due;
        public final int is_paid;
        public final String or_id;
        public final String or_no;
        public final String date_uploaded;
        public final int is_uploaded;
        public boolean selected;
        public final String pipe_size;

        public to_readings(int id, String reading_no, String meter_reader_id, String meter_reader_name, String customer_id, String customer_no, String customer_name, String customer_meter_no, String previous_reading_date, double previous_reading, double current_reading, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, String sitio, String sitio_id, String created_at, String updated_at, String created_by, String updated_by, int status, String occupancy_id, String occupancy, String occupancy_type_id, String occupancy_type, String occupancy_type_code, double actual_consumption, double amount_due, double mf, double mr, double interest, double discount, double net_due, int is_paid, String or_id, String or_no, String date_uploaded, int is_uploaded, boolean selected, String pipe_size) {
            this.id = id;
            this.reading_no = reading_no;
            this.meter_reader_id = meter_reader_id;
            this.meter_reader_name = meter_reader_name;
            this.customer_id = customer_id;
            this.customer_no = customer_no;
            this.customer_name = customer_name;
            this.customer_meter_no = customer_meter_no;
            this.previous_reading_date = previous_reading_date;
            this.previous_reading = previous_reading;
            this.current_reading = current_reading;
            this.city = city;
            this.city_id = city_id;
            this.barangay = barangay;
            this.barangay_id = barangay_id;
            this.purok = purok;
            this.purok_id = purok_id;
            this.sitio = sitio;
            this.sitio_id = sitio_id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.occupancy_id = occupancy_id;
            this.occupancy = occupancy;
            this.occupancy_type_id = occupancy_type_id;
            this.occupancy_type = occupancy_type;
            this.occupancy_type_code = occupancy_type_code;
            this.actual_consumption = actual_consumption;
            this.amount_due = amount_due;
            this.mf = mf;
            this.mr = mr;
            this.interest = interest;
            this.discount = discount;
            this.net_due = net_due;
            this.is_paid = is_paid;
            this.or_id = or_id;
            this.or_no = or_no;
            this.date_uploaded = date_uploaded;
            this.is_uploaded = is_uploaded;
            this.selected = selected;
            this.pipe_size = pipe_size;
        }

        public double getAmount_due() {
            return amount_due;
        }

        public void setAmount_due(double amount_due) {
            this.amount_due = amount_due;
        }

        public double getMf() {
            return mf;
        }

        public void setMf(double mf) {
            this.mf = mf;
        }

        public double getMr() {
            return mr;
        }

        public void setMr(double mr) {
            this.mr = mr;
        }

        public double getInterest() {
            return interest;
        }

        public void setInterest(double interest) {
            this.interest = interest;
        }

        public double getDiscount() {
            return discount;
        }

        public void setDiscount(double discount) {
            this.discount = discount;
        }

        public double getNet_due() {
            return net_due;
        }

        public void setNet_due(double net_due) {
            this.net_due = net_due;
        }

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }

    }

    public static void add_data(to_readings to_readings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into readings("
                    + "reading_no"
                    + ",meter_reader_id"
                    + ",meter_reader_name"
                    + ",customer_id"
                    + ",customer_no"
                    + ",customer_name"
                    + ",customer_meter_no"
                    + ",previous_reading_date"
                    + ",previous_reading"
                    + ",current_reading"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",sitio"
                    + ",sitio_id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",occupancy_id"
                    + ",occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type"
                    + ",occupancy_type_code"
                    + ",actual_consumption"
                    + ",amount_due"
                    + ",mf"
                    + ",mr"
                    + ",interest"
                    + ",discount"
                    + ",net_due"
                    + ",is_paid"
                    + ",or_id"
                    + ",or_no"
                    + ",date_uploaded"
                    + ",is_uploaded"
                    + ",pipe_size"
                    + ")values("
                    + ":reading_no"
                    + ",:meter_reader_id"
                    + ",:meter_reader_name"
                    + ",:customer_id"
                    + ",:customer_no"
                    + ",:customer_name"
                    + ",:customer_meter_no"
                    + ",:previous_reading_date"
                    + ",:previous_reading"
                    + ",:current_reading"
                    + ",:city"
                    + ",:city_id"
                    + ",:barangay"
                    + ",:barangay_id"
                    + ",:purok"
                    + ",:purok_id"
                    + ",:sitio"
                    + ",:sitio_id"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:occupancy_id"
                    + ",:occupancy"
                    + ",:occupancy_type_id"
                    + ",:occupancy_type"
                    + ",:occupancy_type_code"
                    + ",:actual_consumption"
                    + ",:amount_due"
                    + ",:mf"
                    + ",:mr"
                    + ",:interest"
                    + ",:discount"
                    + ",:net_due"
                    + ",:is_paid"
                    + ",:or_id"
                    + ",:or_no"
                    + ",:date_uploaded"
                    + ",:is_uploaded"
                    + ",:pipe_size"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("reading_no", to_readings.reading_no)
                    .setString("meter_reader_id", to_readings.meter_reader_id)
                    .setString("meter_reader_name", to_readings.meter_reader_name)
                    .setString("customer_id", to_readings.customer_id)
                    .setString("customer_no", to_readings.customer_no)
                    .setString("customer_name", to_readings.customer_name)
                    .setString("customer_meter_no", to_readings.customer_meter_no)
                    .setString("previous_reading_date", to_readings.previous_reading_date)
                    .setNumber("previous_reading", to_readings.previous_reading)
                    .setNumber("current_reading", to_readings.current_reading)
                    .setString("city", to_readings.city)
                    .setString("city_id", to_readings.city_id)
                    .setString("barangay", to_readings.barangay)
                    .setString("barangay_id", to_readings.barangay_id)
                    .setString("purok", to_readings.purok)
                    .setString("purok_id", to_readings.purok_id)
                    .setString("sitio", to_readings.sitio)
                    .setString("sitio_id", to_readings.sitio_id)
                    .setString("created_at", to_readings.created_at)
                    .setString("updated_at", to_readings.updated_at)
                    .setString("created_by", to_readings.created_by)
                    .setString("updated_by", to_readings.updated_by)
                    .setNumber("status", to_readings.status)
                    .setString("occupancy_id", to_readings.occupancy_id)
                    .setString("occupancy", to_readings.occupancy)
                    .setString("occupancy_type_id", to_readings.occupancy_type_id)
                    .setString("occupancy_type", to_readings.occupancy_type)
                    .setString("occupancy_type_code", to_readings.occupancy_type_code)
                    .setNumber("actual_consumption", to_readings.actual_consumption)
                    .setNumber("amount_due", to_readings.amount_due)
                    .setNumber("mf", to_readings.mf)
                    .setNumber("mr", to_readings.mr)
                    .setNumber("interest", to_readings.interest)
                    .setNumber("discount", to_readings.discount)
                    .setNumber("net_due", to_readings.net_due)
                    .setNumber("is_paid", to_readings.is_paid)
                    .setString("or_id", to_readings.or_id)
                    .setString("or_no", to_readings.or_no)
                    .setString("date_uploaded", to_readings.date_uploaded)
                    .setNumber("is_uploaded", to_readings.is_uploaded)
                    .setString("pipe_size", to_readings.pipe_size)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Readings.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_data_downloaded(List<to_readings> to_readings1) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            PreparedStatement stmt = conn.prepareStatement("");
            String s = " delete from readings ";
            stmt.addBatch(s);
            for (to_readings to_readings : to_readings1) {
                String s0 = "insert into readings("
                        + "id"
                        + ",reading_no"
                        + ",meter_reader_id"
                        + ",meter_reader_name"
                        + ",customer_id"
                        + ",customer_no"
                        + ",customer_name"
                        + ",customer_meter_no"
                        + ",previous_reading_date"
                        + ",previous_reading"
                        + ",current_reading"
                        + ",city"
                        + ",city_id"
                        + ",barangay"
                        + ",barangay_id"
                        + ",purok"
                        + ",purok_id"
                        + ",sitio"
                        + ",sitio_id"
                        + ",created_at"
                        + ",updated_at"
                        + ",created_by"
                        + ",updated_by"
                        + ",status"
                        + ",occupancy_id"
                        + ",occupancy"
                        + ",occupancy_type_id"
                        + ",occupancy_type"
                        + ",occupancy_type_code"
                        + ",actual_consumption"
                        + ",amount_due"
                        + ",mf"
                        + ",mr"
                        + ",interest"
                        + ",discount"
                        + ",net_due"
                        + ",is_paid"
                        + ",or_id"
                        + ",or_no"
                        + ",date_uploaded"
                        + ",is_uploaded"
                        + ",pipe_size"
                        + ")values("
                        + ":id"
                        + ",:reading_no"
                        + ",:meter_reader_id"
                        + ",:meter_reader_name"
                        + ",:customer_id"
                        + ",:customer_no"
                        + ",:customer_name"
                        + ",:customer_meter_no"
                        + ",:previous_reading_date"
                        + ",:previous_reading"
                        + ",:current_reading"
                        + ",:city"
                        + ",:city_id"
                        + ",:barangay"
                        + ",:barangay_id"
                        + ",:purok"
                        + ",:purok_id"
                        + ",:sitio"
                        + ",:sitio_id"
                        + ",:created_at"
                        + ",:updated_at"
                        + ",:created_by"
                        + ",:updated_by"
                        + ",:status"
                        + ",:occupancy_id"
                        + ",:occupancy"
                        + ",:occupancy_type_id"
                        + ",:occupancy_type"
                        + ",:occupancy_type_code"
                        + ",:actual_consumption"
                        + ",:amount_due"
                        + ",:mf"
                        + ",:mr"
                        + ",:interest"
                        + ",:discount"
                        + ",:net_due"
                        + ",:is_paid"
                        + ",:or_id"
                        + ",:or_no"
                        + ",:date_uploaded"
                        + ",:is_uploaded"
                        + ",:pipe_size"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setNumber("id", to_readings.id)
                        .setString("reading_no", to_readings.reading_no)
                        .setString("meter_reader_id", to_readings.meter_reader_id)
                        .setString("meter_reader_name", to_readings.meter_reader_name)
                        .setString("customer_id", to_readings.customer_id)
                        .setString("customer_no", to_readings.customer_no)
                        .setString("customer_name", to_readings.customer_name)
                        .setString("customer_meter_no", to_readings.customer_meter_no)
                        .setString("previous_reading_date", to_readings.previous_reading_date)
                        .setNumber("previous_reading", to_readings.previous_reading)
                        .setNumber("current_reading", to_readings.current_reading)
                        .setString("city", to_readings.city)
                        .setString("city_id", to_readings.city_id)
                        .setString("barangay", to_readings.barangay)
                        .setString("barangay_id", to_readings.barangay_id)
                        .setString("purok", to_readings.purok)
                        .setString("purok_id", to_readings.purok_id)
                        .setString("sitio", to_readings.sitio)
                        .setString("sitio_id", to_readings.sitio_id)
                        .setString("created_at", to_readings.created_at)
                        .setString("updated_at", to_readings.updated_at)
                        .setString("created_by", to_readings.created_by)
                        .setString("updated_by", to_readings.updated_by)
                        .setNumber("status", to_readings.status)
                        .setString("occupancy_id", to_readings.occupancy_id)
                        .setString("occupancy", to_readings.occupancy)
                        .setString("occupancy_type_id", to_readings.occupancy_type_id)
                        .setString("occupancy_type", to_readings.occupancy_type)
                        .setString("occupancy_type_code", to_readings.occupancy_type_code)
                        .setNumber("actual_consumption", to_readings.actual_consumption)
                        .setNumber("amount_due", to_readings.amount_due)
                        .setNumber("mf", to_readings.mf)
                        .setNumber("mr", to_readings.mr)
                        .setNumber("interest", to_readings.interest)
                        .setNumber("discount", to_readings.discount)
                        .setNumber("net_due", to_readings.net_due)
                        .setNumber("is_paid", to_readings.is_paid)
                        .setString("or_id", to_readings.or_id)
                        .setString("or_no", to_readings.or_no)
                        .setString("date_uploaded", to_readings.date_uploaded)
                        .setNumber("is_uploaded", to_readings.is_uploaded)
                        .setString("pipe_size", to_readings.pipe_size)
                        .ok();
                stmt.addBatch(s0);
            }

            stmt.executeBatch();
            conn.commit();
            Lg.s(Readings.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void upload_to_server(List<to_readings> to_readings1) {
        try {
            Connection conn = MyConnection.connect_server();
            Connection conn_app = MyConnection.connect();

            conn.setAutoCommit(false);
            conn_app.setAutoCommit(false);
            PreparedStatement stmt = conn.prepareStatement("");
            PreparedStatement stmt2 = conn_app.prepareStatement("");
            for (to_readings to_readings : to_readings1) {
                String s0 = "insert into readings("
                        + "reading_no"
                        + ",meter_reader_id"
                        + ",meter_reader_name"
                        + ",customer_id"
                        + ",customer_no"
                        + ",customer_name"
                        + ",customer_meter_no"
                        + ",previous_reading_date"
                        + ",previous_reading"
                        + ",current_reading"
                        + ",city"
                        + ",city_id"
                        + ",barangay"
                        + ",barangay_id"
                        + ",purok"
                        + ",purok_id"
                        + ",sitio"
                        + ",sitio_id"
                        + ",created_at"
                        + ",updated_at"
                        + ",created_by"
                        + ",updated_by"
                        + ",status"
                        + ",occupancy_id"
                        + ",occupancy"
                        + ",occupancy_type_id"
                        + ",occupancy_type"
                        + ",occupancy_type_code"
                        + ",actual_consumption"
                        + ",amount_due"
                        + ",mf"
                        + ",mr"
                        + ",interest"
                        + ",discount"
                        + ",net_due"
                        + ",is_paid"
                        + ",or_id"
                        + ",or_no"
                        + ",date_uploaded"
                        + ",is_uploaded"
                        + ",pipe_size"
                        + ")values("
                        + ":reading_no"
                        + ",:meter_reader_id"
                        + ",:meter_reader_name"
                        + ",:customer_id"
                        + ",:customer_no"
                        + ",:customer_name"
                        + ",:customer_meter_no"
                        + ",:previous_reading_date"
                        + ",:previous_reading"
                        + ",:current_reading"
                        + ",:city"
                        + ",:city_id"
                        + ",:barangay"
                        + ",:barangay_id"
                        + ",:purok"
                        + ",:purok_id"
                        + ",:sitio"
                        + ",:sitio_id"
                        + ",:created_at"
                        + ",:updated_at"
                        + ",:created_by"
                        + ",:updated_by"
                        + ",:status"
                        + ",:occupancy_id"
                        + ",:occupancy"
                        + ",:occupancy_type_id"
                        + ",:occupancy_type"
                        + ",:occupancy_type_code"
                        + ",:actual_consumption"
                        + ",:amount_due"
                        + ",:mf"
                        + ",:mr"
                        + ",:interest"
                        + ",:discount"
                        + ",:net_due"
                        + ",:is_paid"
                        + ",:or_id"
                        + ",:or_no"
                        + ",:date_uploaded"
                        + ",:is_uploaded"
                        + ",:pipe_size"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setString("reading_no", to_readings.reading_no)
                        .setString("meter_reader_id", to_readings.meter_reader_id)
                        .setString("meter_reader_name", to_readings.meter_reader_name)
                        .setString("customer_id", to_readings.customer_id)
                        .setString("customer_no", to_readings.customer_no)
                        .setString("customer_name", to_readings.customer_name)
                        .setString("customer_meter_no", to_readings.customer_meter_no)
                        .setString("previous_reading_date", to_readings.previous_reading_date)
                        .setNumber("previous_reading", to_readings.previous_reading)
                        .setNumber("current_reading", to_readings.current_reading)
                        .setString("city", to_readings.city)
                        .setString("city_id", to_readings.city_id)
                        .setString("barangay", to_readings.barangay)
                        .setString("barangay_id", to_readings.barangay_id)
                        .setString("purok", to_readings.purok)
                        .setString("purok_id", to_readings.purok_id)
                        .setString("sitio", to_readings.sitio)
                        .setString("sitio_id", to_readings.sitio_id)
                        .setString("created_at", to_readings.created_at)
                        .setString("updated_at", to_readings.updated_at)
                        .setString("created_by", to_readings.created_by)
                        .setString("updated_by", to_readings.updated_by)
                        .setNumber("status", to_readings.status)
                        .setString("occupancy_id", to_readings.occupancy_id)
                        .setString("occupancy", to_readings.occupancy)
                        .setString("occupancy_type_id", to_readings.occupancy_type_id)
                        .setString("occupancy_type", to_readings.occupancy_type)
                        .setString("occupancy_type_code", to_readings.occupancy_type_code)
                        .setNumber("actual_consumption", to_readings.actual_consumption)
                        .setNumber("amount_due", to_readings.amount_due)
                        .setNumber("mf", to_readings.mf)
                        .setNumber("mr", to_readings.mr)
                        .setNumber("interest", to_readings.interest)
                        .setNumber("discount", to_readings.discount)
                        .setNumber("net_due", to_readings.net_due)
                        .setNumber("is_paid", to_readings.is_paid)
                        .setString("or_id", to_readings.or_id)
                        .setString("or_no", to_readings.or_no)
                        .setString("date_uploaded", to_readings.date_uploaded)
                        .setNumber("is_uploaded", 1)
                        .setString("pipe_size", to_readings.pipe_size)
                        .ok();
                stmt.addBatch(s0);

                String s2 = " update readings set is_uploaded=1 where id='" + to_readings.id + "' ";
                stmt2.addBatch(s2);
            }

            stmt.executeBatch();
            stmt2.executeBatch();
            conn.setAutoCommit(true);
            conn_app.setAutoCommit(true);
            Lg.s(Readings.class, "Successfully Added");
        } catch (SQLException e) {
            Alert.set(0, "" + e);
            throw new RuntimeException(e);
        } finally {
            MyConnection.close_server();
            MyConnection.close();
        }
    }

    public static void update_data(to_readings to_readings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update readings set "
                    + "reading_no= :reading_no "
                    + ",meter_reader_id= :meter_reader_id "
                    + ",meter_reader_name= :meter_reader_name "
                    + ",customer_id= :customer_id "
                    + ",customer_no= :customer_no "
                    + ",customer_name= :customer_name "
                    + ",customer_meter_no= :customer_meter_no "
                    + ",previous_reading_date= :previous_reading_date "
                    + ",previous_reading= :previous_reading "
                    + ",current_reading= :current_reading "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + ",sitio= :sitio "
                    + ",sitio_id= :sitio_id "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",occupancy_id= :occupancy_id "
                    + ",occupancy= :occupancy "
                    + ",occupancy_type_id= :occupancy_type_id "
                    + ",occupancy_type= :occupancy_type "
                    + ",occupancy_type_code= :occupancy_type_code "
                    + ",actual_consumption= :actual_consumption "
                    + ",amount_due= :amount_due "
                    + ",mf= :mf "
                    + ",mr= :mr "
                    + ",interest= :interest "
                    + ",discount= :discount "
                    + ",net_due= :net_due "
                    + ",is_paid= :is_paid "
                    + ",or_id= :or_id "
                    + ",or_no= :or_no "
                    + ",date_uploaded= :date_uploaded "
                    + ",is_uploaded= :is_uploaded "
                    + ",pipe_size= :pipe_size"
                    + " where id='" + to_readings.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("reading_no", to_readings.reading_no)
                    .setString("meter_reader_id", to_readings.meter_reader_id)
                    .setString("meter_reader_name", to_readings.meter_reader_name)
                    .setString("customer_id", to_readings.customer_id)
                    .setString("customer_no", to_readings.customer_no)
                    .setString("customer_name", to_readings.customer_name)
                    .setString("customer_meter_no", to_readings.customer_meter_no)
                    .setString("previous_reading_date", to_readings.previous_reading_date)
                    .setNumber("previous_reading", to_readings.previous_reading)
                    .setNumber("current_reading", to_readings.current_reading)
                    .setString("city", to_readings.city)
                    .setString("city_id", to_readings.city_id)
                    .setString("barangay", to_readings.barangay)
                    .setString("barangay_id", to_readings.barangay_id)
                    .setString("purok", to_readings.purok)
                    .setString("purok_id", to_readings.purok_id)
                    .setString("sitio", to_readings.sitio)
                    .setString("sitio_id", to_readings.sitio_id)
                    .setString("created_at", to_readings.created_at)
                    .setString("updated_at", to_readings.updated_at)
                    .setString("created_by", to_readings.created_by)
                    .setString("updated_by", to_readings.updated_by)
                    .setNumber("status", to_readings.status)
                    .setString("occupancy_id", to_readings.occupancy_id)
                    .setString("occupancy", to_readings.occupancy)
                    .setString("occupancy_type_id", to_readings.occupancy_type_id)
                    .setString("occupancy_type", to_readings.occupancy_type)
                    .setString("occupancy_type_code", to_readings.occupancy_type_code)
                    .setNumber("actual_consumption", to_readings.actual_consumption)
                    .setNumber("amount_due", to_readings.amount_due)
                    .setNumber("mf", to_readings.mf)
                    .setNumber("mr", to_readings.mr)
                    .setNumber("interest", to_readings.interest)
                    .setNumber("discount", to_readings.discount)
                    .setNumber("net_due", to_readings.net_due)
                    .setNumber("is_paid", to_readings.is_paid)
                    .setString("or_id", to_readings.or_id)
                    .setString("or_no", to_readings.or_no)
                    .setString("date_uploaded", to_readings.date_uploaded)
                    .setNumber("is_uploaded", to_readings.is_uploaded)
                    .setString("pipe_size", to_readings.pipe_size)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Readings.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data2(to_readings to_readings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update readings set "
                    + "  current_reading= :current_reading "
                    + " ,actual_consumption= :actual_consumption "
                    + " ,amount_due= :amount_due "
                    + " ,mf= :mf "
                    + " ,mr= :mr "
                    + " ,interest= :interest "
                    + " ,discount= :discount "
                    + " ,net_due= :net_due "
                    + " where id='" + to_readings.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("current_reading", to_readings.current_reading)
                    .setNumber("actual_consumption", to_readings.actual_consumption)
                    .setNumber("amount_due", to_readings.amount_due)
                    .setNumber("mf", to_readings.mf)
                    .setNumber("mr", to_readings.mr)
                    .setNumber("interest", to_readings.interest)
                    .setNumber("discount", to_readings.discount)
                    .setNumber("net_due", to_readings.net_due)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Readings.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_readings to_readings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from readings  "
                    + " where id='" + to_readings.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Readings.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_readings> ret_data(String where) {
        List<to_readings> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",reading_no"
                    + ",meter_reader_id"
                    + ",meter_reader_name"
                    + ",customer_id"
                    + ",customer_no"
                    + ",customer_name"
                    + ",customer_meter_no"
                    + ",previous_reading_date"
                    + ",previous_reading"
                    + ",current_reading"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",sitio"
                    + ",sitio_id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",occupancy_id"
                    + ",occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type"
                    + ",occupancy_type_code"
                    + ",actual_consumption"
                    + ",amount_due"
                    + ",mf"
                    + ",mr"
                    + ",interest"
                    + ",discount"
                    + ",net_due"
                    + ",is_paid"
                    + ",or_id"
                    + ",or_no"
                    + ",date_uploaded"
                    + ",is_uploaded"
                    + ",pipe_size"
                    + " from readings"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String reading_no = rs.getString(2);
                String meter_reader_id = rs.getString(3);
                String meter_reader_name = rs.getString(4);
                String customer_id = rs.getString(5);
                String customer_no = rs.getString(6);
                String customer_name = rs.getString(7);
                String customer_meter_no = rs.getString(8);
                String previous_reading_date = rs.getString(9);
                double previous_reading = rs.getDouble(10);
                double current_reading = rs.getDouble(11);
                String city = rs.getString(12);
                String city_id = rs.getString(13);
                String barangay = rs.getString(14);
                String barangay_id = rs.getString(15);
                String purok = rs.getString(16);
                String purok_id = rs.getString(17);
                String sitio = rs.getString(18);
                String sitio_id = rs.getString(19);
                String created_at = rs.getString(20);
                String updated_at = rs.getString(21);
                String created_by = rs.getString(22);
                String updated_by = rs.getString(23);
                int status = rs.getInt(24);
                String occupancy_id = rs.getString(25);
                String occupancy = rs.getString(26);
                String occupancy_type_id = rs.getString(27);
                String occupancy_type = rs.getString(28);
                String occupancy_type_code = rs.getString(29);
                double actual_consumption = rs.getDouble(30);
                double amount_due = rs.getDouble(31);
                double mf = rs.getDouble(32);
                double mr = rs.getDouble(33);
                double interest = rs.getDouble(34);
                double discount = rs.getDouble(35);
                double net_due = rs.getDouble(36);
                int is_paid = rs.getInt(37);
                String or_id = rs.getString(38);
                String or_no = rs.getString(39);
                String date_uploaded = rs.getString(40);
                int is_uploaded = rs.getInt(41);
                boolean selected = false;
                String pipe_size = rs.getString(42);
                to_readings to = new to_readings(id, reading_no, meter_reader_id, meter_reader_name, customer_id, customer_no, customer_name, customer_meter_no, previous_reading_date, previous_reading, current_reading, city, city_id, barangay, barangay_id, purok, purok_id, sitio, sitio_id, created_at, updated_at, created_by, updated_by, status, occupancy_id, occupancy, occupancy_type_id, occupancy_type, occupancy_type_code, actual_consumption, amount_due, mf, mr, interest, discount, net_due, is_paid, or_id, or_no, date_uploaded, is_uploaded, selected, pipe_size);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_readings> ret_data_server(String where) {
        List<to_readings> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect_server();
            String s0 = "select "
                    + "id"
                    + ",reading_no"
                    + ",meter_reader_id"
                    + ",meter_reader_name"
                    + ",customer_id"
                    + ",customer_no"
                    + ",customer_name"
                    + ",customer_meter_no"
                    + ",previous_reading_date"
                    + ",previous_reading"
                    + ",current_reading"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",sitio"
                    + ",sitio_id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",occupancy_id"
                    + ",occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type"
                    + ",occupancy_type_code"
                    + ",actual_consumption"
                    + ",amount_due"
                    + ",mf"
                    + ",mr"
                    + ",interest"
                    + ",discount"
                    + ",net_due"
                    + ",is_paid"
                    + ",or_id"
                    + ",or_no"
                    + ",date_uploaded"
                    + ",is_uploaded"
                    + ",pipe_size"
                    + " from readings"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String reading_no = rs.getString(2);
                String meter_reader_id = rs.getString(3);
                String meter_reader_name = rs.getString(4);
                String customer_id = rs.getString(5);
                String customer_no = rs.getString(6);
                String customer_name = rs.getString(7);
                String customer_meter_no = rs.getString(8);
                String previous_reading_date = rs.getString(9);
                double previous_reading = rs.getDouble(10);
                double current_reading = rs.getDouble(11);
                String city = rs.getString(12);
                String city_id = rs.getString(13);
                String barangay = rs.getString(14);
                String barangay_id = rs.getString(15);
                String purok = rs.getString(16);
                String purok_id = rs.getString(17);
                String sitio = rs.getString(18);
                String sitio_id = rs.getString(19);
                String created_at = rs.getString(20);
                String updated_at = rs.getString(21);
                String created_by = rs.getString(22);
                String updated_by = rs.getString(23);
                int status = rs.getInt(24);
                String occupancy_id = rs.getString(25);
                String occupancy = rs.getString(26);
                String occupancy_type_id = rs.getString(27);
                String occupancy_type = rs.getString(28);
                String occupancy_type_code = rs.getString(29);
                double actual_consumption = rs.getDouble(30);
                double amount_due = rs.getDouble(31);
                double mf = rs.getDouble(32);
                double mr = rs.getDouble(33);
                double interest = rs.getDouble(34);
                double discount = rs.getDouble(35);
                double net_due = rs.getDouble(36);
                int is_paid = rs.getInt(37);
                String or_id = rs.getString(38);
                String or_no = rs.getString(39);
                String date_uploaded = rs.getString(40);
                int is_uploaded = rs.getInt(41);
                boolean selected = false;
                String pipe_size = rs.getString(42);
                to_readings to = new to_readings(id, reading_no, meter_reader_id, meter_reader_name, customer_id, customer_no, customer_name, customer_meter_no, previous_reading_date, previous_reading, current_reading, city, city_id, barangay, barangay_id, purok, purok_id, sitio, sitio_id, created_at, updated_at, created_by, updated_by, status, occupancy_id, occupancy, occupancy_type_id, occupancy_type, occupancy_type_code, actual_consumption, amount_due, mf, mr, interest, discount, net_due, is_paid, or_id, or_no, date_uploaded, is_uploaded, selected, pipe_size);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close_server();
        }
    }

    public static List<to_meter_reader_assignments> ret_reader_assignments(String where) {
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
                    + ",meter_no"
                    + ",pipe_size"
                    + " from meter_reader_assignments "
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
                String pipe_size = rs.getString(27);
                to_meter_reader_assignments to = new to_meter_reader_assignments(id, meter_reader_id, meter_reader_no, meter_reader_name, customer_id, customer_no, customer_name, barangay, barangay_id, purok, purok_id, date_added, date_updated, added_by_id, update_by_id, status, occupancy_id, occupancy, occupancy_type_id, occupancy_type, occupancy_type_code, city, city_id, sitio, sitio_id, meter_no, pipe_size);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_reading(to_readings to_readings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update readings set "
                    + " previous_reading= :previous_reading "
                    + ",current_reading= :current_reading "
                    + ",updated_at= :updated_at "
                    + ",updated_by= :updated_by "
                    + " where id='" + to_readings.id + "' "
                    + " ";
            s0 = SqlStringUtil.parse(s0)
                    .setNumber("previous_reading", to_readings.previous_reading)
                    .setNumber("current_reading", to_readings.current_reading)
                    .setString("updated_at", to_readings.updated_at)
                    .setString("updated_by", to_readings.updated_by)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Readings.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static String increment_id(String meter_reader_id) {
        String id = meter_reader_id + "-000000000000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from readings where meter_reader_id='" + meter_reader_id + "' ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select reading_no from readings where id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                }
            }
            if (id == null) {
                id = meter_reader_id + "-000000000000";
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
