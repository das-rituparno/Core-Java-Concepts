package org.example.OOPs.Encapsulation;

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Ritu");
        s1.setRollNo(10);
        s1.setAddress("Kandi, Murshidabad");

        System.out.println("Student name is : " + s1.getName());
        System.out.println("Student roll no is : " + s1.getRollNo());
        System.out.println("Student address is : " + s1.getAddress());
    }
}
