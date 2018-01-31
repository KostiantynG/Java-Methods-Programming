package by.bsu.scalability;

/**
 * # 11 # полиморфизм # AbstractQuest.java # DragnDropQuest.java
 * # SingleChoiceQuest.java # Answer.java # QuestFactory.java # Runner.java
 */
public class DragnDropQuest extends AbstractQuest {
    // поля, конструкторы и методы
    @Override
    public boolean check(Answer ans) {
        System.out.println("Drag'n'Drop quest");
        // проверка корректности ответа (true или false)
        return true; // stub
    }
}