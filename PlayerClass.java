public abstract class PlayerClass {
    private int hp;
    private int armor;
    private int dex;
    private int intel;

    PlayerClass(int hp, int armor, int dex, int intel) {
        this.hp = hp;
        this.armor = armor;
        this.dex = dex;
        this.intel = intel;

    }

    public int getHp(){
        return hp;
    }

}
