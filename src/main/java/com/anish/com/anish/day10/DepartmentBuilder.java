package com.anish.com.anish.day10;

public class DepartmentBuilder {

    private int id;
    private String name;
    private  Integer employeeNumber;

    public  static Department builder(){
        return new Department();
    }


    public DepartmentBuilder(int id, String name, Integer employeeNumber) {
        this.id = id;
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public static  class  Department{
        private int id;
        private String name;
        private  Integer employeeNumber;

        public int getId() {
            return id;
        }

        public Department Id(int id) {
            this.id = id;
            return  this;
        }

        public String getName() {
            return name;
        }

        public Department Name(String name) {
            this.name = name;
            return  this;
        }

        public Integer getEmployeeNumber() {
            return employeeNumber;
        }

        public Department EmployeeNumber(Integer employeeNumber) {
            this.employeeNumber = employeeNumber;
            return  this;
        }
        public DepartmentBuilder Build(){
            return new DepartmentBuilder(id, name, employeeNumber);
        }
    }

}

