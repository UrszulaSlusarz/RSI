package com.company;

 public class Registration
 {
     private String name;
     private String surname;
     private String place;
     private String street;
     private short numberhouse;
     private float age;

     public Registration(String name, String surname, String place, String street, short numberhouse, float age)
     {
         this.name = name;
         this.surname = surname;
         this.place = place;
         this.street = street;
         this.numberhouse = numberhouse;
         this.age=age;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getSurname() {
         return surname;
     }

     public void setSurname(String surname) {
         this.surname = surname;
     }

     public String getPlace() {
         return place;
     }

     public void setPlace(String place) {
         this.place = place;
     }

     public String getStreet() {
         return street;
     }

     public void setStreet(String street) {
         this.street = street;
     }

     public short getNumberhouse() {
         return numberhouse;
     }

     public void setNumberhouse(short numberhouse) {
         this.numberhouse = numberhouse;
     }

     public float getAge() {
         return age;
     }

     public void setAge(float age) {
         this.age = age;
     }

     public void print(){
         System.out.println("Dane pacjenta: "+name+" "+surname+" "+ "zostaly wprowadzone do bazy danych.");
     }
 }
