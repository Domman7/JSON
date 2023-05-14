package org.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.*;
import java.util.stream.Stream;

public class Guest {
    private int ID;
    private int passNumber;
    private String name, surname, patronymic;
    private Date birthday;
    private String birthPlace;
    private int passportNumber;
    private Date passportIssueDate;
    private int divisionCode;
    private TreeMap<Date, Period> visitedPlaces;

    public Guest(){}
    public Guest (int ID, int passNumber, String name, String surname, String patronymic,
                       Date birthday, String birthPlace, int passportNumber, Date passportIssueDate,
                  int divisionCode, TreeMap<Date, Period> visitedPlaces){
        this.ID = ID;
        this.passNumber=passNumber;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.birthPlace=birthPlace;
        this.passportNumber=passportNumber;
        this.passportIssueDate=passportIssueDate;
        this.divisionCode=divisionCode;
        this.visitedPlaces = visitedPlaces;
    }
    public int getID(){
        return ID;
    }
    public int getPassNumber(){
        return passNumber;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public Date getBirthday(){
        return birthday;
    }
    public String getBirthPlace(){
        return birthPlace;
    }
    public int getPassportNumber(){
        return  passportNumber;
    }
    public Date getPassportIssueDate(){
        return passportIssueDate;
    }
    public int getDivisionCode(){
        return divisionCode;
    }
    public TreeMap getVisitedPlaces(){
        return visitedPlaces;
    }

    public void setID(int ID){
        this.ID = ID;
    }
    public void setPassNumber(int passNumber){
        this.passNumber=passNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }
    public void setBirthday(Date birthday){
        this.birthday=birthday;
    }
    public void setBirthPlace(String birthPlace){
        this.birthPlace=birthPlace;
    }
    public void setPassportNumber(int passportNumber){
        this.passportNumber=passportNumber;
    }
    public void setPassportIssueDate(Date passportIssueDate){
        this.passportIssueDate=passportIssueDate;
    }
    public void setDivisionCode(int divisionCode){
        this.divisionCode=divisionCode;
    }
    public void addVisitedPlaces(Date date, Period places){
        visitedPlaces.put(date, places);
    }

    @Override
    public String toString() {
        return "Guests{" +
                "id='" + ID + '\'' +
                "passNumber='" + passNumber + '\'' +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic=" + patronymic + '\'' +
                ", birthday=" + birthday + '\'' +
                ", birthdayPlace=" + birthPlace + '\'' +
                ", passportNumber=" + passportNumber + '\'' +
                ", passportIssueDate=" + passportIssueDate + '\'' +
                ", divisionCode=" + divisionCode + '\'' +
                ", visitedPlaces=" + visitedPlaces.keySet() + '\'' +
                '}';
    }
}
