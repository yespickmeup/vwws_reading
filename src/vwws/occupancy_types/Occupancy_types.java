/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.occupancy_types;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;
import vwws.util.MyConnection;

/**
 *
 * @author Guinness
 */
public class Occupancy_types {

    public static class to_occupancy_types {

        public final int id;
        public final String occupancy;
        public final String occupancy_type_id;
        public final String occupancy_type_name;
        public final String occupancy_type_code;
        public final String pipe_size;
        public final String cubic;
        public final double mf;
        public final double mr;
        public final double charge;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;
        public final int status;
        public final String remarks;

        public to_occupancy_types(int id, String occupancy, String occupancy_type_id, String occupancy_type_name, String occupancy_type_code, String pipe_size, String cubic, double mf, double mr, double charge, String date_added, String date_updated, String added_by_id, String update_by_id, int status, String remarks) {
            this.id = id;
            this.occupancy = occupancy;
            this.occupancy_type_id = occupancy_type_id;
            this.occupancy_type_name = occupancy_type_name;
            this.occupancy_type_code = occupancy_type_code;
            this.pipe_size = pipe_size;
            this.cubic = cubic;
            this.mf = mf;
            this.mr = mr;
            this.charge = charge;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
            this.status = status;
            this.remarks = remarks;
        }
    }

    public static void add_data(to_occupancy_types to_occupancy_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into occupancy_types("
                    + "occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type_name"
                    + ",occupancy_type_code"
                    + ",pipe_size"
                    + ",cubic"
                    + ",mf"
                    + ",mr"
                    + ",charge"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + ",remarks"
                    + ")values("
                    + ":occupancy"
                    + ",:occupancy_type_id"
                    + ",:occupancy_type_name"
                    + ",:occupancy_type_code"
                    + ",:pipe_size"
                    + ",:cubic"
                    + ",:mf"
                    + ",:mr"
                    + ",:charge"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ",:status"
                    + ",:remarks"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("occupancy", to_occupancy_types.occupancy)
                    .setString("occupancy_type_id", to_occupancy_types.occupancy_type_id)
                    .setString("occupancy_type_name", to_occupancy_types.occupancy_type_name)
                    .setString("occupancy_type_code", to_occupancy_types.occupancy_type_code)
                    .setString("pipe_size", to_occupancy_types.pipe_size)
                    .setString("cubic", to_occupancy_types.cubic)
                    .setNumber("mf", to_occupancy_types.mf)
                    .setNumber("mr", to_occupancy_types.mr)
                    .setNumber("charge", to_occupancy_types.charge)
                    .setString("date_added", to_occupancy_types.date_added)
                    .setString("date_updated", to_occupancy_types.date_updated)
                    .setString("added_by_id", to_occupancy_types.added_by_id)
                    .setString("update_by_id", to_occupancy_types.update_by_id)
                    .setNumber("status", to_occupancy_types.status)
                    .setString("remarks", to_occupancy_types.remarks)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Occupancy_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_data_downloaded(List<to_occupancy_types> to_occupancy_types1) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            PreparedStatement stmt = conn.prepareStatement("");
            for (to_occupancy_types to_occupancy_types : to_occupancy_types1) {
                String s0 = "insert into occupancy_types("
                        + "occupancy"
                        + ",occupancy_type_id"
                        + ",occupancy_type_name"
                        + ",occupancy_type_code"
                        + ",pipe_size"
                        + ",cubic"
                        + ",mf"
                        + ",mr"
                        + ",charge"
                        + ",date_added"
                        + ",date_updated"
                        + ",added_by_id"
                        + ",update_by_id"
                        + ",status"
                        + ",remarks"
                        + ")values("
                        + ":occupancy"
                        + ",:occupancy_type_id"
                        + ",:occupancy_type_name"
                        + ",:occupancy_type_code"
                        + ",:pipe_size"
                        + ",:cubic"
                        + ",:mf"
                        + ",:mr"
                        + ",:charge"
                        + ",:date_added"
                        + ",:date_updated"
                        + ",:added_by_id"
                        + ",:update_by_id"
                        + ",:status"
                        + ",:remarks"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setString("occupancy", to_occupancy_types.occupancy)
                        .setString("occupancy_type_id", to_occupancy_types.occupancy_type_id)
                        .setString("occupancy_type_name", to_occupancy_types.occupancy_type_name)
                        .setString("occupancy_type_code", to_occupancy_types.occupancy_type_code)
                        .setString("pipe_size", to_occupancy_types.pipe_size)
                        .setString("cubic", to_occupancy_types.cubic)
                        .setNumber("mf", to_occupancy_types.mf)
                        .setNumber("mr", to_occupancy_types.mr)
                        .setNumber("charge", to_occupancy_types.charge)
                        .setString("date_added", to_occupancy_types.date_added)
                        .setString("date_updated", to_occupancy_types.date_updated)
                        .setString("added_by_id", to_occupancy_types.added_by_id)
                        .setString("update_by_id", to_occupancy_types.update_by_id)
                        .setNumber("status", to_occupancy_types.status)
                        .setString("remarks", to_occupancy_types.remarks)
                        .ok();
                stmt.addBatch(s0);
            }
            stmt.executeBatch();
            conn.commit();
            Lg.s(Occupancy_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_occupancy_types to_occupancy_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update occupancy_types set "
                    + "occupancy= :occupancy "
                    + ",occupancy_type_id= :occupancy_type_id "
                    + ",occupancy_type_name= :occupancy_type_name "
                    + ",occupancy_type_code= :occupancy_type_code "
                    + ",pipe_size= :pipe_size "
                    + ",cubic= :cubic "
                    + ",mf= :mf "
                    + ",mr= :mr "
                    + ",charge= :charge "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + ",status= :status "
                    + ",remarks= :remarks "
                    + " where id='" + to_occupancy_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("occupancy", to_occupancy_types.occupancy)
                    .setString("occupancy_type_id", to_occupancy_types.occupancy_type_id)
                    .setString("occupancy_type_name", to_occupancy_types.occupancy_type_name)
                    .setString("occupancy_type_code", to_occupancy_types.occupancy_type_code)
                    .setString("pipe_size", to_occupancy_types.pipe_size)
                    .setString("cubic", to_occupancy_types.cubic)
                    .setNumber("mf", to_occupancy_types.mf)
                    .setNumber("mr", to_occupancy_types.mr)
                    .setNumber("charge", to_occupancy_types.charge)
                    .setString("date_added", to_occupancy_types.date_added)
                    .setString("date_updated", to_occupancy_types.date_updated)
                    .setString("added_by_id", to_occupancy_types.added_by_id)
                    .setString("update_by_id", to_occupancy_types.update_by_id)
                    .setNumber("status", to_occupancy_types.status)
                    .setString("remarks", to_occupancy_types.remarks)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Occupancy_types.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_occupancy_types to_occupancy_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from occupancy_types  "
                    + " where id='" + to_occupancy_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Occupancy_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_occupancy_types> ret_data(String where) {
        List<to_occupancy_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type_name"
                    + ",occupancy_type_code"
                    + ",pipe_size"
                    + ",cubic"
                    + ",mf"
                    + ",mr"
                    + ",charge"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + ",remarks"
                    + " from occupancy_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String occupancy = rs.getString(2);
                String occupancy_type_id = rs.getString(3);
                String occupancy_type_name = rs.getString(4);
                String occupancy_type_code = rs.getString(5);
                String pipe_size = rs.getString(6);
                String cubic = rs.getString(7);
                double mf = rs.getDouble(8);
                double mr = rs.getDouble(9);
                double charge = rs.getDouble(10);
                String date_added = rs.getString(11);
                String date_updated = rs.getString(12);
                String added_by_id = rs.getString(13);
                String update_by_id = rs.getString(14);
                int status = rs.getInt(15);
                String remarks = rs.getString(16);

                to_occupancy_types to = new to_occupancy_types(id, occupancy, occupancy_type_id, occupancy_type_name, occupancy_type_code, pipe_size, cubic, mf, mr, charge, date_added, date_updated, added_by_id, update_by_id, status, remarks);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_occupancy_types> ret_data_server(String where) {
        List<to_occupancy_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect_server();
            String s0 = "select "
                    + "id"
                    + ",occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type_name"
                    + ",occupancy_type_code"
                    + ",pipe_size"
                    + ",cubic"
                    + ",mf"
                    + ",mr"
                    + ",charge"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + ",remarks"
                    + " from occupancy_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String occupancy = rs.getString(2);
                String occupancy_type_id = rs.getString(3);
                String occupancy_type_name = rs.getString(4);
                String occupancy_type_code = rs.getString(5);
                String pipe_size = rs.getString(6);
                String cubic = rs.getString(7);
                double mf = rs.getDouble(8);
                double mr = rs.getDouble(9);
                double charge = rs.getDouble(10);
                String date_added = rs.getString(11);
                String date_updated = rs.getString(12);
                String added_by_id = rs.getString(13);
                String update_by_id = rs.getString(14);
                int status = rs.getInt(15);
                String remarks = rs.getString(16);

                to_occupancy_types to = new to_occupancy_types(id, occupancy, occupancy_type_id, occupancy_type_name, occupancy_type_code, pipe_size, cubic, mf, mr, charge, date_added, date_updated, added_by_id, update_by_id, status, remarks);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close_server();
        }
    }

    public static List<to_occupancy_types> ret_data2(String where) {
        List<to_occupancy_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",concat(occupancy_type_code,'-',occupancy) as occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type_name"
                    + ",occupancy_type_code"
                    + ",pipe_size"
                    + ",cubic"
                    + ",mf"
                    + ",mr"
                    + ",charge"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + ",remarks"
                    + " from occupancy_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String occupancy = rs.getString(2);
                String occupancy_type_id = rs.getString(3);
                String occupancy_type_name = rs.getString(4);
                String occupancy_type_code = rs.getString(5);
                String pipe_size = rs.getString(6);
                String cubic = rs.getString(7);
                double mf = rs.getDouble(8);
                double mr = rs.getDouble(9);
                double charge = rs.getDouble(10);
                String date_added = rs.getString(11);
                String date_updated = rs.getString(12);
                String added_by_id = rs.getString(13);
                String update_by_id = rs.getString(14);
                int status = rs.getInt(15);
                String remarks = rs.getString(16);

                to_occupancy_types to = new to_occupancy_types(id, occupancy, occupancy_type_id, occupancy_type_name, occupancy_type_code, pipe_size, cubic, mf, mr, charge, date_added, date_updated, added_by_id, update_by_id, status, remarks);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}
