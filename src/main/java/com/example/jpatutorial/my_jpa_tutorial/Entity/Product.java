package com.example.jpatutorial.my_jpa_tutorial.Entity;

import com.sun.xml.internal.ws.spi.db.DatabindingException;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Product{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;
    private String description;
    private BigDecimal price;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updateAt;

    public Product() {
    }

    public Product(String description, BigDecimal price, Date createdAt, Date updateAt) {
        this.description=description;
        this.price=price;
        this.createdAt=createdAt;
        this.updateAt=updateAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price=price;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt=createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt=updateAt;
    }


}
