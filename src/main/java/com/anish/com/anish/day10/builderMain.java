package com.anish.com.anish.day10;

public class builderMain {
    public static void main(String[] args) {
        DepartmentBuilder departmentBuilder = DepartmentBuilder.builder()
                .Id(1)
                .Name("Anish")
                .EmployeeNumber(12)
                .Build();
        System.out.println(departmentBuilder);
    }
}
