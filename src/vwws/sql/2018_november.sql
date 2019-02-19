/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Ronescape
 * Created: Nov 30, 2018
 */


drop schema if exists db_vwws_reading;
create schema db_vwws_reading;
use db_vwws_reading;


drop table if exists meter_readers;
create table meter_readers(
id int auto_increment primary key
,meter_reader_no varchar(255)
,fname varchar(255)
,mi varchar(255)
,lname varchar(255)
,bday date
,city varchar(255)
,city_id varchar(255)
,barangay varchar(255)
,barangay_id varchar(255)
,purok varchar(255)
,purok_id varchar(255)
,address varchar(255)
,date_added datetime
,date_updated datetime
,added_by_id varchar(255)
,update_by_id varchar(255)
,status int
,user_name varchar(255)
,password varchar(255)
);
