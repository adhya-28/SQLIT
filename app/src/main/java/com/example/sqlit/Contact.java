package com.example.sqlit;

public class Contact {
    int _id;
    String _name;
    String _phone_number;
   private String _course;
    public Contact(){}
    public Contact(int _id,String _name,String _phone_number,String _course){
        this._id=_id;
        this._name=_name;
        this._phone_number=_phone_number;
        this._course=_course;
    }
    public Contact(String name, String _phone_number,String course){
        this._name = name;
        this._phone_number = _phone_number;
        this._course=course;
    }

    public int getID(){
        return this._id;
    }

    public void setID(int id){
        this._id = id;
    }

    public String getName(){
        return this._name;
    }

    public void setName(String name){
        this._name = name;
    }

    public String getPhoneNumber(){
        return this._phone_number;
    }

    public void setPhoneNumber(String phone_number){
        this._phone_number = phone_number;
    }

    public String get_course() {
        return _course;
    }

    public void set_course(String _course) {
        this._course = _course;
    }
}

