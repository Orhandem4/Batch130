package day27encapsulationabstraction;

public class Student {

    String stdId = "AC123";
    private  double gpa = 3.99;
    private  boolean poor = true;
    //Encapsulation yapilmis data'yi okuyabilir miyiz?
    //get method'lar (getter) encapsule edilmis(saklanmis) data'yi okumamıza yarar
    //get method'lar (getter) her zaman "public"
    //get method'lar (getter) return type'i variable'in data type'i ile ayni olur.
    //get method'lar (getter) isimleri get+ variable name seklinde olur.
    //get method'lar (getter) isimleri variable boolean ise "is + variable name" seklinde olur.
    //get method'lar (getter) parametre kullanmazlar
    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }


           //Encapsulation yapılmış data'larin degeri değiştirilebilir mi?
    //set method'lar(setter) encapsule edilmis data'larin degerlerini ddegistirmemize yarar,
    //set method'lar(setter) her zamana "public" olur.
    //set method'lar(setter) return type'i her zamana void olur,
    //set method'lar(setter) isimleri "set + variable name" seklinde olur
    //set method'lar(setter) variable ile ayni data type'ina parametre kullanirlar


    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }
}
