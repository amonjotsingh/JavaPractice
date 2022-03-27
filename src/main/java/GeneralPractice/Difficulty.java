package GeneralPractice;

public enum Difficulty {
    BEGINNNER(1),
    AMATEUR(2),
    HARD(3),
    PRO(4);
    final int timeToReachLevel;
    Difficulty(int timeToReachLevel){
        this.timeToReachLevel = timeToReachLevel;
    }
}
