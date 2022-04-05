
enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    final int constant;

    DangerLevel(int constant) {
        this.constant = constant;
    }

    int getLevel() {
        return constant;
    }
}