package by.bsu.entity;

import java.util.Objects;
import java.util.Vector;

/**
 * # 15 # глубокое клонирование # Student.java
 */
public class StudentObjectTypeCloneable implements Cloneable {
    private int id = 7;
    private String name;
    private int age;
    private Vector<Byte> v = new Vector<>(); // список оценок – изменяемое поле

    public StudentObjectTypeCloneable() {

    }

    public StudentObjectTypeCloneable(int id, String name, int age, Vector<Byte> v) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.v = v;
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

    public Vector<Byte> getV() {
        return v;
    }

    public void setV(Vector<Byte> v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "StudentObjectTypeCloneable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", v=" + v +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentObjectTypeCloneable)) return false;
        StudentObjectTypeCloneable that = (StudentObjectTypeCloneable) o;
        return getId() == that.getId() &&
                age == that.age &&
                Objects.equals(name, that.name) &&
                Objects.equals(v, that.v);
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), name, age, v);
    }

    public StudentObjectTypeCloneable clone() { // метод-подставка
        StudentObjectTypeCloneable copy = null;
        try {
            copy = (StudentObjectTypeCloneable) super.clone();
            copy.v = (Vector<Byte>) v.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }
}