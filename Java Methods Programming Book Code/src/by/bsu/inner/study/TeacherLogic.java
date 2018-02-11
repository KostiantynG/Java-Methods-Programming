package by.bsu.inner.study;

/**
 * # 6 # внутренний класс, объявленный внутри метода # AbstractTeacher.java
 * # TeacherCreator.java # Teacher.java # TeacherLogic.java # Runner.java
 */
public class TeacherLogic {
    public void excludeProcess(int rectorId, String nameStudent) {
        AbstractTeacher teacher = TeacherCreator.createTeacher(rectorId);
        System.out.println("Студент: " + nameStudent
                + " отчислен:" + teacher.excludeStudent(nameStudent));
    }
}