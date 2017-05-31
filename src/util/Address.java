/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import javafx.beans.property.*;
import java.sql.Date;

/**
 *
 * @author Timothy
 */
public class Address {
    private IntegerProperty addressId;
    private StringProperty address;
    private StringProperty address2;
    private IntegerProperty cityId;
    private IntegerProperty postalCode;
    private IntegerProperty phone;
    private SimpleObjectProperty<Date> createDate;
    private StringProperty createBy;
    private SimpleObjectProperty<Date> lastUpdate;
    private StringProperty lastUpdatedBy;
    public Address() {
        this.addressId = new SimpleIntegerProperty();
        this.address = new SimpleStringProperty();
        this.address2 = new SimpleStringProperty();
        this.cityId = new SimpleIntegerProperty();
        this.postalCode = new SimpleIntegerProperty();
        this.phone = new SimpleIntegerProperty();
        this.createDate = new SimpleObjectProperty<>();
        this.createBy = new SimpleStringProperty();
        this.lastUpdate = new SimpleObjectProperty<>();
        this.lastUpdatedBy = new SimpleStringProperty();
    }

    public IntegerProperty getAddressId() {
        return addressId;
    }

    public void setAddressId(IntegerProperty addressId) {
        this.addressId = addressId;
    }

    public StringProperty getAddress() {
        return address;
    }

    public void setAddress(StringProperty address) {
        this.address = address;
    }

    public StringProperty getAddress2() {
        return address2;
    }

    public void setAddress2(StringProperty address2) {
        this.address2 = address2;
    }

    public IntegerProperty getCityId() {
        return cityId;
    }

    public void setCityId(IntegerProperty cityId) {
        this.cityId = cityId;
    }

    public IntegerProperty getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(IntegerProperty postalCode) {
        this.postalCode = postalCode;
    }

    public IntegerProperty getPhone() {
        return phone;
    }

    public void setPhone(IntegerProperty phone) {
        this.phone = phone;
    }

    public SimpleObjectProperty<Date> getCreateDate() {
        return createDate;
    }

    public void setCreateDate(SimpleObjectProperty<Date> createDate) {
        this.createDate = createDate;
    }

    public StringProperty getCreateBy() {
        return createBy;
    }

    public void setCreateBy(StringProperty createBy) {
        this.createBy = createBy;
    }

    public SimpleObjectProperty<Date> getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(SimpleObjectProperty<Date> lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public StringProperty getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(StringProperty lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
    
}
