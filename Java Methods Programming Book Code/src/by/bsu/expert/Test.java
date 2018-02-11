package by.bsu.expert;

/**
 * # 1 # шаблон Expert # Test.java # Quest.java
 */
// информационный эксперт
public class Test {
    private int idTest;
    private String testName;
    private int questNumber;
    private long time;

    public Test(int idTest, String testName, int questNumber, long time) {
        this.idTest = idTest;
        this.testName = testName;
        this.questNumber = questNumber;
        this.time = time;
    }

    public int getIdTest() {
        return idTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public int getQuestNumber() {
        return questNumber;
    }

    public void setQuestNumber(int questNumber) {
        this.questNumber = questNumber;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Test{" +
                "idTest=" + idTest +
                ", testName='" + testName + '\'' +
                ", questNumber=" + questNumber +
                ", time=" + time +
                '}';
    }
}