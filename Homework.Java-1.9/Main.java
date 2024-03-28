public class Main {
    public static void main(String[] args) {

        Robot myRobot = new Robot("Safi", "Made in 2024");

        myRobot.deplasareInainte();
        myRobot.deplasareInapoi();
        myRobot.intoarcereDreapta();
        myRobot.intoarcereStanga();
        myRobot.ridicareObiect();
        myRobot.lasareObiect();

        myRobot.start();
        myRobot.stop();
    }
}
