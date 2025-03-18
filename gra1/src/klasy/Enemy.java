package klasy;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Enemy extends Event{
    private String[] enemyNames = {"Wilk","Goblin","Bandyta"};
    private int dmg;
    private int health;
    private String enemyName;
    private int gold;

    public Enemy() {
        super.name = "Wróg";
    }

    @Override
    public void handle(Player player) throws InterruptedException {
        super.handle(player);
        enemyName = enemyNames[(int)(Math.random()*2)];
        health = (int)(Math.random()*31)+20;
        dmg = (int)(Math.random()*11)+5;
        gold = (int)(Math.random()*11)+10;
        System.out.println("Atakuje cie "+enemyName);
        System.out.println(enemyName+": HP = "+health+", atak = "+dmg);

        while (health>0){


        if(!Ahandle(player)){
            break;
        }
        }
        TimeUnit.SECONDS.sleep(1);
    }
    public boolean Ahandle(Player player) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Co robisz?");
        System.out.println("1.Atakuj");
        System.out.println("2.Uciekaj");
        int odp = scanner.nextInt();
        if(odp == 1){
            int pDMG = (int)((Math.random()*(player.getBaseDmg() - (player.getBaseDmg()/2)))+ player.getBaseDmg()/2);
            health -=pDMG;
            System.out.println();
            System.out.println("Zadałas "+pDMG+" obrażeń! "+enemyName+" ma teraz "+health+" HP");
            if(health<=0){
                System.out.println("Zabiłeś "+enemyName);
                player.setGold(player.getGold()+gold);
                System.out.println("Zyskujesz " +gold+" złota");
                return false;
            }
        } else if (odp==2) {
            if((int)(Math.random()*2)==1){
                System.out.println("Uciekłeś");
                return false;
            }
            System.out.println("Nie udało sie uciec");
        }
            int eDMG = (int)((Math.random()*(dmg- ((double) dmg /2)))+ (double) dmg /2);
            player.setHealth(player.getHealth()-eDMG);
        System.out.println(enemyName+" atakuje! Otrzymujesz "+eDMG+" obrażeń. Masz teraz "+player.getHealth()+" HP.");
        if(player.getHealth()<=0){
            System.out.println("Umierasz");
            TimeUnit.SECONDS.sleep(1);
            System.exit(0);
        }

        return true;
    }
}
