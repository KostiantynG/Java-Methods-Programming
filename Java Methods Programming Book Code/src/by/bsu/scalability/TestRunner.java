package by.bsu.scalability;

/**
 * # 11 # полиморфизм # AbstractQuest.java # DragnDropQuest.java
 * # SingleChoiceQuest.java # Answer.java # QuestFactory.java # Runner.java
 */
public class TestRunner {
    public static void main(String[] args) {
        TestAction bt = new TestAction();
        AbstractQuest[] test = bt.generateTest(5, 2); // 5 вопросов 2-х видов
        // здесь должен быть код процесса прохождения теста …
        bt.checkTest(test); // проверка теста
    }
}