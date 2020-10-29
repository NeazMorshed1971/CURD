package com.ensat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import java.math.BigDecimal;

/**
 * Product entity.
 */
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer auth_user_id ;

//    @Version
//    private Integer version1;

    private String first_name;
    private String last_name;
    private String email;


    public String getName() {
        return first_name;
    }

    public void setName(String name) {
        this.first_name = name;
    }
   

//    public Integer getVersion() {
//        return version1;
//    }
//
//    public void setVersion(Integer version) {
//        this.version1 = version;
//    }

    public Integer getId() {
        return auth_user_id;
    }

    public void setId(Integer id) {
        this.auth_user_id = id;
    }

    public String getProductId() {
        return last_name;
    }

    public void setProductId(String productId) {
        this.last_name = productId;
    }

    public String getPrice() {
        return email;
    }

    public void setPrice(String price) {
        this.email = price;
    }

}
