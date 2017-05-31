/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Meeting;
import javafx.beans.property.*;
import java.sql.Date;
import java.sql.*;
import java.sql.SQLException;
/**
 *
 * @author Timothy
 */
public class Meeting {
     private IntegerProperty appointmentId;
    private IntegerProperty customerId;
    private StringProperty title;
    private StringProperty description;
    private StringProperty location;
    private StringProperty contact;
    private StringProperty url;
    private SimpleObjectProperty<Date> start;
    private SimpleObjectProperty<Date> end;
    private SimpleObjectProperty<Date> createDate;
    private StringProperty createdBy;
    private SimpleObjectProperty<Date> lastUpdate;
    private StringProperty lastUpdateBy;

    public Meeting() {
        this.appointmentId = appointmentId;
        this.customerId = customerId;
        this.title = title;
        this.description = description;
        this.location = location;
        this.contact = contact;
        this.url = url;
        this.start = start;
        this.end = end;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.lastUpdate = lastUpdate;
        this.lastUpdateBy = lastUpdateBy;
    }
    
    public IntegerProperty getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(IntegerProperty appointmentId) {
        this.appointmentId = appointmentId;
    }

    public IntegerProperty getCustomerId() {
        return customerId;
    }

    public void setCustomerId(IntegerProperty customerId) {
        this.customerId = customerId;
    }

    public StringProperty getTitle() {
        return title;
    }

    public void setTitle(StringProperty title) {
        this.title = title;
    }

    public StringProperty getDescription() {
        return description;
    }

    public void setDescription(StringProperty description) {
        this.description = description;
    }

    public StringProperty getLocation() {
        return location;
    }

    public void setLocation(StringProperty location) {
        this.location = location;
    }

    public StringProperty getContact() {
        return contact;
    }

    public void setContact(StringProperty contact) {
        this.contact = contact;
    }

    public StringProperty getUrl() {
        return url;
    }

    public void setUrl(StringProperty url) {
        this.url = url;
    }

    public SimpleObjectProperty<Date> getStart() {
        return start;
    }

    public void setStart(SimpleObjectProperty<Date> start) {
        this.start = start;
    }

    public SimpleObjectProperty<Date> getEnd() {
        return end;
    }

    public void setEnd(SimpleObjectProperty<Date> end) {
        this.end = end;
    }

    public SimpleObjectProperty<Date> getCreateDate() {
        return createDate;
    }

    public void setCreateDate(SimpleObjectProperty<Date> createDate) {
        this.createDate = createDate;
    }

    public StringProperty getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(StringProperty createdBy) {
        this.createdBy = createdBy;
    }

    public SimpleObjectProperty<Date> getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(SimpleObjectProperty<Date> lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public StringProperty getLastUpdateBy() {
        return lastUpdateBy;
    }

    //Declare Employees Table Columns
    public void setLastUpdateBy(StringProperty lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }
   
 
    }

