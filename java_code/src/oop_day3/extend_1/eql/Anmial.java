package oop_day3.extend_1.eql;

import java.util.Objects;

public class Anmial {
    public String name = "Anmial name";
    public int age;
    public Anmial(){}
    public  Anmial(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
       Anmial other = (Anmial) o;
       if (o == null){
           return false;
       }
       if(this == o){
           return true;
       }
       if (this.name==other.name && this.age==other.age){
           return true;
       }else {
           return false;
       }
    }

}
