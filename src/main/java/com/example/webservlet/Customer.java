package com.example.webservlet;

public class Customer {
    String name;
    String surName;

    String country;

    String adres;

    String product;

    String company;

    int orderData;


    int phoneNumber;

    int id;

    int financeId;

    int postCode;

    int age;

    public Customer(String name, String surName, String country, String adres,
                    String product,
                    String company, int orderData, int phoneNumber, int id,
                    int financeId, int postCode, int age) {
        this.name = name;
        this.surName = surName;
        this.country = country;
        this.adres = adres;
        this.product = product;
        this.company = company;
        this.orderData = orderData;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.financeId = financeId;
        this.postCode = postCode;
        this.age = age;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getOrderData() {
        return orderData;
    }

    public void setOrderData(int orderData) {
        this.orderData = orderData;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFinanceId() {
        return financeId;
    }

    public void setFinanceId(int financeId) {
        this.financeId = financeId;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", country='" + country + '\'' +
                ", adres='" + adres + '\'' +
                ", product='" + product + '\'' +
                ", company='" + company + '\'' +
                ", orderData=" + orderData +
                ", phoneNumber=" + phoneNumber +
                ", id=" + id +
                ", financeId=" + financeId +
                ", postCode=" + postCode +
                ", age=" + age +
                '}';
    }
}
