/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.Requests;

import Admin.AddTrain;
import Admin.ViewTrain;
import Server.DBConnect;
import java.awt.HeadlessException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Folio
 */
public class AddTrainRequest implements Serializable{
    private final Connection con;
    private PreparedStatement st;
    private PreparedStatement stt;
    private PreparedStatement sttt;
    private PreparedStatement stttt;
    private static Statement stmt;
    private String tnum,tname,startstn,stopstn,starttm,stoptm,days;
    private int NOSfc,NOSsc,NOSslc,farefc,faresc,fareslc,dmc;
   
    public AddTrainRequest(ViewTrain train) { 
        con = DBConnect.con;
        tnum=train.gettrainNum();
        tname=train.gettrainName();
        startstn=train.getfstation();
        stopstn=train.getlstation();
        starttm=train.getatime();
        stoptm=train.getdtime();
        days=train.getdays();
        NOSfc=train.getNosfc();
        NOSsc=train.getNossc();
        NOSslc=train.getNosslc();
        farefc=train.getfee1();
        faresc=train.getfee2();
        fareslc=train.getfee3();
        dmc=train.getdmc();
        
    }

    //Method returning arraylist of all dates in upcoming 30 days when this train will run
    
    private ArrayList<Date> getDates(String rundays){
    ArrayList<Date> dates=new ArrayList();
    int i,arr[]=new int[7];
    if(rundays.charAt(6)=='1') arr[0]=1;
    else arr[0]=0;
    for(i=0;i<6;i++)
        if(rundays.charAt(i)=='1') arr[i+1]=1;
        else arr[i+1]=0;
    
    for(i=0;i<30;i++)
    {   Date date=java.sql.Date.valueOf(java.time.LocalDate.now().plusDays(i));
         if(arr[date.getDay()]==1)
             dates.add(date);
    }
    
    for(i=0;i<dates.size();i++)
            System.out.print(dates.get(i));
            
    return dates;
    }
    //Method to query to enter data in database 
    public boolean addtrain() throws SQLException{
        System.out.println("Receiving Train details");
        System.out.println(tnum+tname+startstn+stopstn+starttm+stoptm+NOSfc+NOSsc+NOSslc+farefc+faresc+fareslc+days);
        try{
        if(!checktrainnum(tname)){
            System.out.println("after queries");
            //Inserting data in table traininfo
            st=con.prepareStatement("INSERT INTO traininfo(`trainNum`, `trainName`, `firstStation`, `lastStation`, `departureTime`, `arrivalTime`, `feeFirstClass`, `feeSecondClass`, `feeSleeperClass`, `days`,`dmc`) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            st.setString(1,tnum);
            st.setString(2,tname);
            st.setString(3,startstn);
            st.setString(4,stopstn);
            st.setString(5,starttm);
            st.setString(6,stoptm);
            st.setInt(7,farefc);
            st.setInt(8,faresc);
            st.setInt(9,fareslc);
            st.setString(10,days);
            st.setInt(11, dmc);
            st.execute();
            
            ArrayList<Date> dates=getDates(days);
            //Entering data for each date in tables firstclass,secondclass, and sleeperclass
            for(int i=0;i<dates.size();i++){
               java.util.Date utilObj = dates.get(i);
            java.sql.Date sqldate = new java.sql.Date(utilObj.getTime());
            stt=con.prepareStatement("INSERT INTO firstClass(`trainNum`, `totalseats`,`rundate`) VALUES (?,?,?)");
            stt.setString(1,tnum);
            stt.setInt(2,NOSfc);
            stt.setDate(3,sqldate);
            stt.execute();
            sttt=con.prepareStatement("INSERT INTO secondClass(`trainNum`, `totalseats`,`rundate`) VALUES (?,?,?)");
            sttt.setString(1,tnum);
            sttt.setInt(2,NOSsc);
            sttt.setDate(3,sqldate);
            sttt.execute();
            stttt=con.prepareStatement("INSERT INTO sleeperClass(`trainNum`, `totalseats`,`rundate`) VALUES (?,?,?)");
            stttt.setString(1,tnum);
            stttt.setInt(2,NOSslc);
            stttt.setDate(3,sqldate);
            stttt.execute();
            }
            System.out.println("after execution\n");
            return true;
        }
        else{
            System.out.println("Train name already exists\n");
            return false;
        }
        } catch(SQLException e)
        {
            System.out.println("Server Error"+e.getMessage());
            return false;
        }
    }
    //Method to check if this train num is already in the table
    private boolean checktrainnum(String trainnum){
        
        boolean tname_exist = false;
        
        try {
            String query = "SELECT * FROM `traininfo` WHERE `trainNum` = ?";
            //con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/mms","root","");
            st = con.prepareStatement(query);
            st.setString(1,trainnum);
            ResultSet rs = st.executeQuery();
            System.out.println("checkk\n");
        
            if(rs.next())
            {
                tname_exist = true;
                System.out.println("train name true\n");
            }
            
        } catch (HeadlessException | SQLException ex) {
            System.out.println("checkTrainname\n");
        }
        
        return tname_exist;
    }
}