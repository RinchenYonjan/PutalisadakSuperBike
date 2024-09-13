/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.putalisadaksuperbike.model;

/**
 *
 * @author yonza
 */
public class BikeModel {
    
    private int serial_number;
    private String name;
    private String company;
    private String country;
    private String topspeed;
    private String fuelcapacity;
    private String mileage;
    
    //creating constructor
    public BikeModel(int serial_number, String name, String company, String country, String topspeed, String fuelcapacity, String mileage){
            
        this.serial_number = serial_number;
        this.name = name;
        this.company = company;
        this.country = country;
        this.topspeed = topspeed;
        this.fuelcapacity = fuelcapacity;
        this.mileage = mileage;
    }
    
    
    public int getserial_number(){
        return serial_number;
    }
    public String getname(){
        return name;
    }
    public String getcompany(){
        return company;
    }
    public String getcountry(){
        return country;
    }
    public String gettopspeed(){
        return topspeed;
    }
    public String getfuelcapacity(){
        return fuelcapacity;
    }
    public String getmileage(){
        return mileage;
    }
    
    
    public void setserial_number(int serial_number){
        this.serial_number = serial_number;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setcompany(String company){
        this.company = company;
    }
    public void setcountry(String country){
        this.country = country;
    }
    public void settopspeed(String topspeed){
        this.topspeed = topspeed;
    }
    public void setfuelcapacity(String fuelcapacity){
        this.fuelcapacity = fuelcapacity;
    }
    public void setmileage(String mileage){
        this.mileage = mileage;
    }
}