package by.bsu.inner.study;

/**
 * # 6 # внутренний класс, объявленный внутри метода # AbstractTeacher.java
 * # TeacherCreator.java # Teacher.java # TeacherLogic.java # Runner.java
 */
public class Runner {
    public static void main(String[] args) {
        TeacherLogic tl = new TeacherLogic();
        tl.excludeProcess(777, "Олейников");
        tl.excludeProcess(6, "Олейников");
    }
}