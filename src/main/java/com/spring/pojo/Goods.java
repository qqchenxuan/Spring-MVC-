package com.spring.pojo;


import java.util.Date;

public class Goods {
    private Integer id;
    private String name;
    private Integer price;
    private Date createDate;
    private String remark;

    public Goods(Integer id, String name, Integer price, Date createDate, String remark) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createDate = createDate;
        this.remark = remark;
    }

    public Goods(){super();}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
