package com.example.eastsun.ipc.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by eastsun on 18-4-9.
 */

public class Person implements Parcelable {

    private String name;

    public Person(String name){
        this.name=name;
    }

    protected Person(Parcel in) {
        name=in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "mName='" + name + '\'' +
                '}';
    }
    
}
