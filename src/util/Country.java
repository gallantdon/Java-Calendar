/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Date;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Timothy
 */
public class Country {
    private IntegerProperty countryId;
    private StringProperty country;
    private SimpleObjectProperty<Date> createDate;
    private StringProperty createBy;
    private SimpleObjectProperty<Date> lastUpdate;
    private StringProperty lastUpdatedBy;

    public Country(IntegerProperty countryId, StringProperty country, SimpleObjectProperty<Date> createDate, StringProperty createBy, SimpleObjectProperty<Date> lastUpdate, StringProperty lastUpdatedBy) {
        this.countryId = new SimpleIntegerProperty();
        this.country = new SimpleStringProperty();
        this.createDate = new SimpleObjectProperty<>();
        this.createBy = new SimpleStringProperty();
        this.lastUpdate = new SimpleObjectProperty<>();
        this.lastUpdatedBy = new SimpleStringProperty();
    }

    public IntegerProperty getCountryId() {
        return countryId;
    }

    public void setCountryId(IntegerProperty countryId) {
        this.countryId = countryId;
    }

    public StringProperty getCountry() {
        return country;
    }

    public void setCountry(StringProperty country) {
        this.country = country;
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
