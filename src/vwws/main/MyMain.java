/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.main;

import java.awt.Toolkit;
import java.awt.Window;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.CloseDialog;
import synsoftech.util.Center;
import vwww.pnl.Dlg_login;

/**
 *
 * @author Guinness
 */
public class MyMain {

    public static void main(String[] args) {
        ret_config();
    }

    private static void ret_config() {
        String home = System.getProperty("user.home") + "\\my_config_vwws_app.conf";

        try {

            Properties prop = new Properties();
            String conf = "my_config_vwws_app.conf";
            String userHome = System.getProperty("user.home");
            System.out.println(conf);
            File file = new File(userHome + "/" + conf);
            if (file.exists()) {
                InputStream is = new FileInputStream(file);
                prop.load(is);
            } else {
                file = new File(conf);
                if (file.exists()) {
                    InputStream is = new FileInputStream(file);
                    prop.load(is);
                }
            }

//            System.out.println(home);
            System.setProperty("pool_host", prop.getProperty("pool_host", "localhost"));
            System.setProperty("pool_port", prop.getProperty("pool_port", "3306"));
            System.setProperty("pool_user", prop.getProperty("pool_user", "root"));
            System.setProperty("pool_password", prop.getProperty("pool_password", "password"));
            System.setProperty("pool_db", prop.getProperty("pool_db", "db_vwws_reading"));

            System.setProperty("pool_host_server", prop.getProperty("pool_host_server", "localhost"));
            System.setProperty("pool_port_server", prop.getProperty("pool_port_server", "3306"));
            System.setProperty("pool_user_server", prop.getProperty("pool_user_server", "root"));
            System.setProperty("pool_password_server", prop.getProperty("pool_password_server", "password"));
            System.setProperty("pool_db_server", prop.getProperty("pool_db_server", "db_vwws"));

            System.setProperty("pool_host_finance", prop.getProperty("pool_host_finance", "localhost"));
            System.setProperty("pool_port_finance", prop.getProperty("pool_port_finance", "3306"));
            System.setProperty("pool_user_finance", prop.getProperty("pool_user_finance", "root"));
            System.setProperty("pool_password_finance", prop.getProperty("pool_password_finance", "password"));
            System.setProperty("pool_db_finance", prop.getProperty("pool_db_finance", "db_vwws_finance"));

            System.setProperty("pool_host_cloud", prop.getProperty("pool_host_cloud", "localhost"));
            System.setProperty("pool_port_cloud", prop.getProperty("pool_port_cloud", "3306"));
            System.setProperty("pool_user_cloud", prop.getProperty("pool_user_cloud", "root"));
            System.setProperty("pool_password_cloud", prop.getProperty("pool_password_cloud", "password"));
            System.setProperty("pool_db_cloud", prop.getProperty("pool_db_cloud", "db_vwws_cloud"));

            System.setProperty("hdd_drive", prop.getProperty("hdd_drive", ""));
            System.setProperty("environment", prop.getProperty("environment", "production"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Window p = (Window) new JFrame();
            Loading nd = Loading.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Loading.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Loading.OutputData data) {
                    new MyMain().start();
                    closeDialog.ok();
                }
            });
            Center.setCenter(nd);
            nd.setVisible(true);
        }
    }

    private void start() {

        Application.setSystemLookAndFeel();
        Dlg_login pnl = Dlg_login.create(new javax.swing.JFrame(), true);

//        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/qs/img/link_logo (Custom).png"));
//        pnl.setIconImage(image);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());
        Center.setCenter(pnl);
        pnl.setVisible(true);
    }

    public static String getSerialNumber() {
        String drive = System.getProperty("hdd_drive", "");

        String result = "";
        try {
            File file = File.createTempFile("realhowto", ".vbs");
            file.deleteOnExit();
            FileWriter fw = new java.io.FileWriter(file);

            String vbs = "Set objFSO = CreateObject(\"Scripting.FileSystemObject\")\n"
                    + "Set colDrives = objFSO.Drives\n"
                    + "Set objDrive = colDrives.item(\"" + drive + "\")\n"
                    + "Wscript.Echo objDrive.SerialNumber";  // see note
            fw.write(vbs);
            fw.close();
            Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
            BufferedReader input
                    = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = input.readLine()) != null) {
                result += line;
            }
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result.trim();
    }
}
