package by.bsu.expert;

import java.util.Queue;

/**
 * # 3 # шаблон Creator # RequestQuestById.java
 */
public class BuildTest {
    private int idQuest;
    private int idTest;

    public void buildTest(Queue<Quest> q) {
        q.add(makeQuest(idQuest, idTest));
// реализация
    }

    private Quest makeQuest(int idQuest, int idTest) {

        return new Quest(idQuest, idTest);
    }

    public static void main(String[] args) {
        Test test = new Test(1,"First",1,2200L);
        Quest questFirst = new Quest(1, test.getIdTest());
        Quest questTwo = new Quest(2,test.getIdTest());

    }
}