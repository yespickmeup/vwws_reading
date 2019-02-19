/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwww.pnl;

import java.io.InputStream;
import java.util.List;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Ronescape
 */
public class Srpt_reading {

    public final String business_name;
    public final String business_address;
    public final String contact_no;
    public final String for_the_month_of;
    public final String bill_number;
    public final String date;
    public final String period_covered;

    public final String account_no;
    public final String customer_name;
    public final String customer_address;
    public final String meter_no;
    public final String occupancy;
    public final String pipe_size;
    public final double previous_reading;
    public final double current_reading;
    public final double total_consumption;
    public final double sub_total;
    public final double mf;
    public final double mr;
    public final double interest;
    public final double discount;
    public final double net_due;
    public final double due_after;
    public final String due_date_after;
    public final String meter_reader;

    public Srpt_reading(String business_name, String business_address, String contact_no, String for_the_month_of, String bill_number, String date, String period_covered, String account_no, String customer_name, String customer_address, String meter_no, String occupancy, String pipe_size, double previous_reading, double current_reading, double total_consumption, double sub_total, double mf, double mr, double interest, double discount, double net_due, double due_after, String due_date_after, String meter_reader) {
        this.business_name = business_name;
        this.business_address = business_address;
        this.contact_no = contact_no;
        this.for_the_month_of = for_the_month_of;
        this.bill_number = bill_number;
        this.date = date;
        this.period_covered = period_covered;
        this.account_no = account_no;
        this.customer_name = customer_name;
        this.customer_address = customer_address;
        this.meter_no = meter_no;
        this.occupancy = occupancy;
        this.pipe_size = pipe_size;
        this.previous_reading = previous_reading;
        this.current_reading = current_reading;
        this.total_consumption = total_consumption;
        this.sub_total = sub_total;
        this.mf = mf;
        this.mr = mr;
        this.interest = interest;
        this.discount = discount;
        this.net_due = net_due;
        this.due_after = due_after;
        this.due_date_after = due_date_after;
        this.meter_reader = meter_reader;
    }

    public static void main(String[] args) {
        String business_name = System.getProperty("business_name", "Valencia Waterworks System");
        String business_address = System.getProperty("address", "Valencia, Negros Oriental");
        String contact_no = "2551235, 4221234";
        String for_the_month_of = "December 2018";
        String bill_number = "12345";
        String date = "12/03/2018 07:40:41 AM";
        String period_covered = "11/20/2018 - 12/20/2018";

        String account_no = "0000001";
        String customer_name = "Cruz, Juan dela";
        String customer_address = "Dumaguete City";
        String meter_no = "03183";
        String occupancy = "R-I";
        String pipe_size = "1/2";
        double previous_reading = 2136;
        double current_reading = 2171;
        double total_consumption = 5;
        double sub_total = 120;
        double mf = 0;
        double mr = 0;
        double interest = 0;
        double discount = 0;
        double net_due = 120;
        double due_after = 130;
        String due_date_after = "08/06/2018";
        String meter_reader = "Roger Cubalan";

        Srpt_reading rpt = new Srpt_reading(business_name, business_address, contact_no, for_the_month_of, bill_number, date, period_covered, account_no, customer_name, customer_address, meter_no, occupancy, pipe_size, previous_reading, current_reading, total_consumption, sub_total, mf, mr, interest, discount, net_due, due_after, due_date_after, meter_reader);

        String jrxml = "rpt_reading.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_reading.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_reading to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());
    }

}
