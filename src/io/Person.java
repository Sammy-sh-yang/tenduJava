package io;

import java.io.Serializable;
import java.util.Arrays;

//Serializable 是簽名接口，沒啥功能，但沒有他卻不能
public class Person implements Serializable {
    //固定Serial版本爲10000 寫多少都可以
    //輸出和輸入的序列號必須使固定的，不固定永遠不會對
    static final long serialVersionUID = 10000L;
    private String name;
    private transient int age;
    private transient String gender;
    private transient String[] otherInfo;

    //後來在添加一個 property=salary -> 如果不固定 serialVersion 的話就不能用了
    private int salary;

    //Getter and Setter
    public String getName() {
        return name;
    }

    //Overwrite toString()
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    //全參構造 用快捷鍵 generator cmd + N
    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

}
