package com.anish.day6;

public class Person {
    private static Long id = 0L;
    private String name;
    private String  Address;
    private String ContactNo;

    private static Person person = null;
     private Person(){}


    public static Person getInstance(){
         if(person==null){
             person = new Person();
         }
         id++;
         return person;
    }

//    public Person(Long id, String name, String address, String contactNo) {
//        this.id = id;
//        this.name = name;
//        Address = address;
//        ContactNo = contactNo;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String contactNo) {
        ContactNo = contactNo;
    }

    @Override
    public String toString() {
       return  "id: " + id + ",contact:" + ContactNo;
    }
}
