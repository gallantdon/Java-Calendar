/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Date;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Timothy
 */
public class Customer {
     private IntegerProperty customerId;
    private StringProperty customerName;
         private IntegerProperty addressId;
    private SimpleObjectProperty<Date> createDate;
    private StringProperty createBy;
    private SimpleObjectProperty<Date> lastUpdate;
    private StringProperty lastUpdatedBy;
}
