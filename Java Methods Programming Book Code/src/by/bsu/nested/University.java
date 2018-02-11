package by.bsu.nested;

/**
 * # 8 # класс, вложенный в интерфейс # LearningDepartment.java # University.java
 */
public interface University {
    int NUMBER_FACULTY = 20;

    void create();

    class LearningDepartment { // static по умолчанию
        public int idChief;

        public static void assignPlan(int idFaculty) {
        // реализация
        }

        public void acceptProgram() {
        // реализация
        }
    }
}