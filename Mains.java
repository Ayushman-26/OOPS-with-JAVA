class Player {
    protected String name;
    protected int age;
    protected String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }

    public void play() {
        System.out.println(name + " is playing.");
    }

    public void train() {
        System.out.println(name + " is training.");
    }
}

// Subclass: Cricket_Player
class Cricket_Player extends Player {
    public Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing a cricket match as a " + position + ".");
    }

    @Override
    public void train() {
        System.out.println(name + " is training in batting and bowling.");
    }
}

// Subclass: Football_Player
class Football_Player extends Player {
    public Football_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing a football match as a " + position + ".");
    }

    @Override
    public void train() {
        System.out.println(name + " is training in dribbling and passing.");
    }
}

// Subclass: Hockey_Player
class Hockey_Player extends Player {
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing a hockey match as a " + position + ".");
    }

    @Override
    public void train() {
        System.out.println(name + " is training in stick handling and defense.");
    }
}

public class Mains {
    public static void main(String[] args) {
        
        Cricket_Player cricketPlayer = new Cricket_Player("Virat Kohli", 34, "Batsman");
        Football_Player footballPlayer = new Football_Player("Lionel Messi", 36, "Forward");
        Hockey_Player hockeyPlayer = new Hockey_Player("Manpreet Singh", 31, "Midfielder");

        System.out.println("=== Cricket Player ===");
        cricketPlayer.displayDetails();
        cricketPlayer.play();
        cricketPlayer.train();

        System.out.println("\n=== Football Player ===");
        footballPlayer.displayDetails();
        footballPlayer.play();
        footballPlayer.train();

        System.out.println("\n=== Hockey Player ===");
        hockeyPlayer.displayDetails();
        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}
