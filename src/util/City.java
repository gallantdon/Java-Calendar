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
public class City {
    private IntegerProperty cityId;
    private StringProperty city;
    private IntegerProperty countryId;
    private SimpleObjectProperty<Date> createDate;
    private StringProperty createBy;
    private SimpleObjectProperty<Date> lastUpdate;
    private StringProperty lastUpdatedBy;

    public City(IntegerProperty cityId, StringProperty city, StringProperty countryId, SimpleObjectProperty<Date> createDate, StringProperty createBy, SimpleObjectProperty<Date> lastUpdate, StringProperty lastUpdatedBy) {
        this.cityId = new SimpleIntegerProperty();
        this.city = new SimpleStringProperty();
        this.countryId = new SimpleIntegerProperty();
        this.createDate = new SimpleObjectProperty<>();
        this.createBy = new SimpleStringProperty();
        this.lastUpdate = new SimpleObjectProperty<>();
        this.lastUpdatedBy = new SimpleStringProperty();
    }

    public IntegerProperty getCityId() {
        return cityId;
    }

    public void setCityId(IntegerProperty cityId) {
        this.cityId = cityId;
    }

    public StringProperty getCity() {
        return city;
    }

    public void setCity(StringProperty city) {
        this.city = city;
    }

    public IntegerProperty getCountryId() {
        return countryId;
    }

    public void setCountryId(IntegerProperty countryId) {
        this.countryId = countryId;
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
