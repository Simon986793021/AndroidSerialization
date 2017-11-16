package com.wind.androidserialization;

import android.os.Parcel;
import android.os.Parcelable;

/**
 *
 * @author zhangcong
 * @date 2017/11/16
 */

public class Person implements Parcelable {
    private String name;
    private int age;
    public Person()
    {}
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    // 系统自动添加，给createFromParcel里面用
    protected Person(Parcel in) {
        name=in.readString();
        age=in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        //将数据序列化到Parcel对象中
        dest.writeString(name);
        dest.writeInt(age);
    }

    @Override
    public int describeContents() {
        //只针对一些特殊的需要描述信息的对象,需要返回1,其他情况返回0就可以
        return 0;
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            // 反序列化，读取数据
            return new Person(in);
        }
        //供反序列化本类数组时调用的
        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
