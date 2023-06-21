package exception;

public class Person {
    private String name;
    private int age;


    @Override
    public String toString() {
        return name + " age: " + age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception{
        if (age < 0 || age > 146) {
            // 這裏要拋合適的異常名字
//            throw new Exception("輸入的年齡不合法！");
            throw new IllegalAgeException("輸入的年齡不合法！");
        }
        this.age = age;
    }
}
