package klasy;

import java.util.ArrayList;
import java.util.Scanner;

public class EventHandler {
   private int randChoice;
   private ArrayList<Event> events;



    public EventHandler() {
        events = new ArrayList<Event>();
        events.add(new Enemy());
        events.add(new Treasure());
        events.add(new Camp());
        events.add(new Escape());


    }

    public void EHandle(Player player) throws InterruptedException {
        randChoice = (int)(Math.random()*10)+1;
        if(randChoice==10){
           events.get(3).handle(player);
        }else{
            events.get(randChoice%3).handle(player);
        }



    }
    public void AStringOptions(){
        System.out.println("-----");
        System.out.println("Co chcesz zrobić?");
        System.out.println("1. Eksplorować dalej");
        System.out.println("2. Sprawdzić ekwipunek");
        System.out.println("3. Zakończyć grę");

    }
    public void AHandle(Player player) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int PlayerChoice = scanner.nextInt();

        if(PlayerChoice==1){
            EHandle(player);
        } else if (PlayerChoice==2) {
            System.out.println("Jeszcze nie działa");
        } else if (PlayerChoice==3) {
            if(player.isCanEscape()){
                System.out.println("Koniec Gry!!!");
                player.setEscapeValue(true);
            }else{
                System.out.println("Nie znalazłeś jeszcze wyjscia z lasu");
            }

        }else{
            System.out.println("Nie poprawne dane");
        }

    }
}
