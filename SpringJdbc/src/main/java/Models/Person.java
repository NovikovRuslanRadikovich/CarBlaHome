package Models;

/**
 * Created by розалия on 19.03.2017.
 */
public class Person {
     int id;
     String country;
     String name;
     String surname;
     public Person(int id,String country,String name,String surname){
         this.id = id;
         this.country = country;
         this.name = name;
         this.surname = surname;
     }
     public int getId(){return id;}
     public void setId(int id){this.id = id;}
     public String getName(){return name;}
     public void setName(String name){
         this.name = name;
     }
     public String getSurname(){
         return surname;
     }
     public void setSurname(String surname){
         this.surname = surname;
     }
     public String getCountry(){
         return country;
     }
     public void setCountry(String country){
         this.country = country;
     }

}