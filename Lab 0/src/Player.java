
public class Player {
    //class fields
    private int level;
    private int health;
    private String name;
    //default constructor
    public Player(){
        this.health = 10;
        this.level=1;
        this.name =  "Juan del Pueblo";
    }
    //Constructor
    public Player(int level, int health, String name){
        this.health = level;
        this.level= health;
        this.name =  name;
    }
    //Getter & Setters
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}