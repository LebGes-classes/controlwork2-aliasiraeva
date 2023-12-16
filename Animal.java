public abstract class Animal {
    private double fullHealth;
    private double health;
    private double x = 0.0;
    private double y = 0.0;
    private double z = 0.0;
    public Animal(double fullHealth) {
        this.fullHealth = fullHealth;
        this.health = fullHealth;
    }
    public void setCoordinates(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getFullHealth() {
        return fullHealth;
    }
    public double getHealth() {
        return health;
    }
    public void setHealth(double health) {
        this.health = health;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public double getDistance(Animal otherAnimal) {
        return Math.sqrt((otherAnimal.getX() - x) * (otherAnimal.getX() - x)
                + (otherAnimal.getY() - y) * (otherAnimal.getY() - y)
                + (otherAnimal.getZ() - z) * (otherAnimal.getZ() - z));
    }
}

