package klasy;

public class Player {
    private int health;
    private int gold;
    private int baseDmg;
    private boolean escapeValue;
    private boolean canEscape;

    public Player() {
        health =100;
        gold =10;
        baseDmg =15;
        escapeValue = false;
        canEscape = false;

    }

    public String statViewer(){
        return "Twoje statystyki: HP = "+health+" | Złoto = "+gold+" | Atak = "+baseDmg;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getBaseDmg() {
        return baseDmg;
    }

    public void setBaseDmg(int baseDmg) {
        this.baseDmg = baseDmg;
    }

    public boolean isEscapeValue() {
        return escapeValue;
    }

    public void setEscapeValue(boolean escapeValue) {
        this.escapeValue = escapeValue;
    }

    public boolean isCanEscape() {
        return canEscape;
    }

    public void setCanEscape(boolean canEscape) {
        this.canEscape = canEscape;
    }
}
