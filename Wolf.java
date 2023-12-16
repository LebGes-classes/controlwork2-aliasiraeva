public class Wolf extends Animal {
    private double d = 4.0;
    public Wolf() {
        super(20.0);
    }
    public void attack(Sheep sheep) {
        double r = super.getDistance(sheep);
        double damage = (super.getHealth() / super.getFullHealth()) * d / (r * r);
        if (sheep.getHealth() > damage) {
            sheep.setHealth(sheep.getHealth() - damage);
        } else {
            sheep.setHealth(0.0);
        }
    }
    public int getKillTime(Sheep sheep) {
        int seconds = 0;
        while (sheep.getHealth() > 0) {
            attack(sheep);
            seconds++;
        }
        return seconds;
    }
}
