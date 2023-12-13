package com.luv2code.springboot.demosecurity.entity;

import jakarta.persistence.*;

@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;


    @Column(name="last_name")
    private String lastName;

    @Column(name="country")
    private String country;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="pin")
    private String pin;

    @Column(name="mobile")
    private String mobile;

    @Column(name="address")
    private String address;

    @Column(name="payment_method")
    private String method;

    public Address(){

    }

    public Address(String firstName, String lastName, String country, String street,String city, String state, String pin, String mobile, String address , String method){
        this.firstName=firstName;
        this.lastName=lastName;
        this.country=country;
        this.street=street;
        this.city=city;
        this.state=state;
        this.pin=pin;
        this.mobile=mobile;
        this.address=address;
        this.method=method;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country=country;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(String street){
        this.street=street;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }

    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state=state;
    }

    public String getPin(){
        return pin;
    }

    public void setPin(String pin){
        this.pin=pin;
    }

    public String getMobile(){
        return mobile;
    }

    public void setMobile(String mobile){
        this.mobile=mobile;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getMethod(){
        return method;
    }

    public void setMethod(String method){
        this.method=method;
    }

    @Override
    public String toString(){
        return "Address{"+"id="+id+",firstName='"+firstName+'\''+"lastName"+lastName+'\''+",country='"+country+'\''+",street='"+street+'\''+",city='"+city+'\''+",state='"+state+'\''+"pin"+pin+'\''+",mobile='"+mobile+'\''+"address='"+address+",method='"+method+"}";
    }

}
