package domain.access;

public class Therapist extends Person {

    private int practiceNum;

    public void setPracticeNum(int practiceNum) {
        this.practiceNum = practiceNum;
    }

    public int getPracticeNum() {
        return practiceNum;
    }

    @Override
    public String toString() {
        return "Therapist{" +
                "practiceNum=" + practiceNum +
                ", gender='" + gender + '\'' +
                '}';
    }
}
