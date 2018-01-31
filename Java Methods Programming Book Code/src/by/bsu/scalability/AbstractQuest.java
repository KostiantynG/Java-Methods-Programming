package by.bsu.scalability;

/**
 * # 11 # полиморфизм # AbstractQuest.java # DragnDropQuest.java
 * # SingleChoiceQuest.java # Answer.java # QuestFactory.java # Runner.java
 */
public abstract class AbstractQuest {
    private long id;
    private String questContent;

    // конструкторы и методы
    public abstract boolean check(Answer ans);
}