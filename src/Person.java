import java.io.Serializable;

public class Person implements Serializable {
    String name;
    int age;
    String idNumber;
    static String nationality;

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

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public static String getNationality() {
        return nationality;
    }

    public static void setNationality(String nationality) {
        Person.nationality = nationality;
    }
}
