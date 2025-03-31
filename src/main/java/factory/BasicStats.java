package factory;

public enum BasicStats {
    STRENGTH(1, 100), AGILITY(1, 100), INTELLECT(1, 50), HEALTH(50, 200);

    BasicStats(int min, int max) {
        this.min = min;
        this.max = max;
    }

    private final int min;
    private final int max;

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }
}
