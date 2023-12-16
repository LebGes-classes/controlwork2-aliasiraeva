//вариант 1
public class Main {
    public static void main(String[] args) {
        Sheep dolly = new Sheep();
        Wolf adolf = new Wolf();
        dolly.setCoordinates(1.5, 3.0, 2.0);
        adolf.setCoordinates(5.0, 8.5, 5.4);
        int seconds = adolf.getKillTime(dolly);
        System.out.println("Время для убийства овечки: " + seconds + " секунд");
    }
}
