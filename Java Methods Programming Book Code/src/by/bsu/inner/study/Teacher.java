package by.bsu.inner.study;

/**
 * # 6 # внутренний класс, объявленный внутри метода # AbstractTeacher.java
 * # TeacherCreator.java # Teacher.java # TeacherLogic.java # Runner.java
 */
public class Teacher extends AbstractTeacher {
    public Teacher(int id) {
        super(id);
    }

    /* методы */
    @Override
    public boolean excludeStudent(String name) {
        return false;
    }
}