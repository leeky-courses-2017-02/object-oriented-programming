package murach.games;

public class NumberGame {
    int upperLimit;
    int targetNumber;
    int numTries;

    public NumberGame() {
        this(50);
    }

    public NumberGame(int upperLimit) {
        this.upperLimit = upperLimit;
        this.targetNumber = (int) (Math.random() * this.upperLimit);
        this.numTries = 1;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public int getTargetNumber() {
        return this.targetNumber;
    }

    public int getNumTries() {
        return this.numTries;
    }

    public void incrementGuessCount() {
        numTries++;
    }
}
