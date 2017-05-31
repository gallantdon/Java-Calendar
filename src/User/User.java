/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import javafx.beans.property.*;
import java.sql.Date;
import java.sql.*;
import java.sql.SQLException;
 
/**
 * Created by ONUR BASKIRT on 27.02.2016.
 */
public class User {
    //Declare Employees Table Columns
    private IntegerProperty userId;
    private StringProperty userName;
    private StringProperty password;
    private StringProperty createBy;
    private IntegerProperty active;
    private SimpleObjectProperty<Date> createDate;
    private StringProperty lastUpdatedBy;
    //Constructor
    public User() {
        this.userId = new SimpleIntegerProperty();
        this.userName = new SimpleStringProperty();
        this.password = new SimpleStringProperty();
        this.createBy = new SimpleStringProperty();
        this.active = new SimpleIntegerProperty();
        this.createDate = new SimpleObjectProperty<>();
        this.lastUpdatedBy = new SimpleStringProperty();
    }
 
    //userId
    public Integer getUserId() {
        return userId.get();
    }
 
    public void setUserId(int employeeId){
        this.userId.set(employeeId);
    }
 
    public IntegerProperty userIdProperty(){
        return userId;
    }
 
    //userName
    public String getUserName () {
        return userName.get();
    }
 
    public void setUserName(String firstName){
        this.userName.set(firstName);
    }
 
    public StringProperty userNameProperty() {
        return userName;
    }
 
    //password
    public String getpassword () {
        return password.get();
    }
 
    public void setPassword(String lastName){
        this.password.set(lastName);
    }
 
    public StringProperty passwordProperty() {
        return password;
    }
 
    //createBy
    public String getCreateBy () {
        return createBy.get();
    }
 
    public void setCreateBy (String email){
        this.createBy.set(email);
    }
 
    public StringProperty createByProperty() {
        return createBy;
    }
 
    //active
    public int getActive () {
        return active.get();
    }
 
    public void setActive (int active){
        this.active.set(active);
    }
 
    public IntegerProperty activeProperty() {
        return active;
    }
 
    //createDate
    public Object getCreateDate(){
        return createDate.get();
    }
 
    public void setCreateDate(Date hireDate){
        this.createDate.set(hireDate);
    }
 
    public SimpleObjectProperty<Date> createDateProperty(){
        return createDate;
    }
 
    //lastUpdatedBy
    public String getLastUpdatedBy () {
        return lastUpdatedBy.get();
    }
 
    public void setLastUpdatedBy (String jobId){
        this.lastUpdatedBy.set(jobId);
    }
 
    public StringProperty lastUpdatedByProperty() {
        return lastUpdatedBy;
    }
    
}
