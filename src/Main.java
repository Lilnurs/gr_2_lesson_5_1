public class Main {
    public static void main(String[] args) {
        Boss killMonger = new Boss();
        killMonger.setHealth(600);
        killMonger.setDamage(80);
        killMonger.setDefence("Magic defence");
        System.out.println("Boss health:" + killMonger.getHealth() + " Boss damage:" + killMonger.getDamage() + "  "
                + " Defemce:" + killMonger.getDefence());


        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Герой №" + (i+1) + createHeroes () [i]);
            
        }

    }

    public static Hero[] createHeroes(){
        Hero Java = new Hero(200,50,"Fasts atacks");
        Hero Javascript = new Hero(300,30,"Revive heroes");
        Hero Python = new Hero(250,55,"Magic atack");
        Hero[] allHeroes={Java,Javascript,Python};
        return allHeroes;



    }
}