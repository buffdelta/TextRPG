public class Player extends GameObject {
    private PlayerClass playerClass;
    private String birthPlace;

    public Player(String name) {
        super(name);
    }

    public Player(String name, PlayerClass playerClass, String birthPlace) {
        super(name);
        this.playerClass = playerClass;
        this.birthPlace = birthPlace;
    }



    public String printInfo() {
        return super.getName() + " " + playerClass + " " + birthPlace;
    }
}
