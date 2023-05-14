package org.example;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Date;
import java.util.stream.Stream;

public class Period {
    private String name;
    private String description;
    private int price;
    private Date startDate;
    private Date endDate;
    public Period (){ }
    public Period (String name, String description, int price, Date startDate, Date endDate){
        this.name = name;
        this.description=description;
        this.price=price;
        this.startDate=startDate;
        this.endDate=endDate;
    }
    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
    public String getDescription(){
        return description;
    }
    public Date getStartDate(){
        return startDate;
    }
    public Date getEndDate(){
        return endDate;
    }
    private void setName(String name){
        this.name=name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }
    public void setEndDate(Date endDate){
        this.endDate=endDate;
    }
}
