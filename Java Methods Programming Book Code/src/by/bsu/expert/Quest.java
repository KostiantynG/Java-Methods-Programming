package by.bsu.expert;

/**
 * # 1 # шаблон Expert # Test.java # Quest.java
 */
// информационный эксперт
public class Quest {
    private int idQuest;
    private int idTest;

    public Quest(int idQuest, int idTest) {
        this.idQuest = idQuest;
        this.idTest = idTest;
    }

    public int getIdTest() {
        return idTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }

    public int getIdQuest() {
        return idQuest;
    }

    public void setIdQuest(int idQuest) {
        this.idQuest = idQuest;
    }

    @Override
    public String toString() {
        return "Quest{" +
                "idQuest=" + idQuest +
                ", idTest=" + idTest +
                '}';
    }
}