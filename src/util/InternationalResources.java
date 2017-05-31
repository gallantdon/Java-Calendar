/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

/**
 *
 * @author Timothy
 */
public class InternationalResources {
    private static ResourceBundle getResources() {
     Locale currentLocale = Locale.getDefault();
     ResourceBundle rb = ResourceBundle.getBundle("java/resources/Lang", currentLocale);
     return rb;
//     Set<String> keys = rb.keySet();
//      keys.stream().map(k -> k + " " + rb.getString(k))
//             .forEach(System.out::println);
//     System.out.println(rb.getString("hello"));
//     System.out.println(rb.getString("open"));
   }
   public static String getString(String key) {
     ResourceBundle rb = getResources();
     String str = rb.getString(key);
     return str;
//     Set<String> keys = rb.keySet();
//      keys.stream().map(k -> k + " " + rb.getString(k))
//             .forEach(System.out::println);
//     System.out.println(rb.getString("hello"));
//     System.out.println(rb.getString("open"));
   }
}
