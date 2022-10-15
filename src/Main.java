public class Main {
    public static void main(String[] args) {
        Boss killMonger = new Boss();
        killMonger.setHealth(600);
        killMonger.setDamage(80);
        killMonger.setDefence("Magic defence");
        System.out.println("Boss health:" + killMonger.getHealth() + " Boss damage:" + killMonger.getDamage() + "  "
        + " Defemce:" + killMonger.getDefence());

    }
}