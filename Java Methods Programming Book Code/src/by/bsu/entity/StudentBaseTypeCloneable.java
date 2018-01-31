package by.bsu.entity;

import java.util.Objects;

/**
 * # 13 # класс, поддерживающий клонирование # Student.java
 * если в нём используются поля базового типа
 */
public class StudentBaseTypeCloneable implements Cloneable { /* включение интерфейса */
    private int id = 71;
    private String name;
    private int age;

    public StudentBaseTypeCloneable(){

    }

    public StudentBaseTypeCloneable(int id, String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentBaseTypeCloneable)) return false;
        StudentBaseTypeCloneable that = (StudentBaseTypeCloneable) o;
        return getId() == that.getId() &&
                age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), name, age);
    }


    @Override
    public String toString() {
        return "StudentBaseTypeCloneable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public Object clone() throws CloneNotSupportedException { // переопределение
        return super.clone(); // вызов базового метода
    }
}