///interface Playable{
abstract class Playable{
    abstract void play();   //abstract method 
    abstract void pause();
    abstract void stop();
}
class MusicPlayer extends Playable{
    @Override
    public void play() {
        System.out.println("Music is playing...");
    }

    @Override
    public void pause() {
        System.out.println("Music is Paused...");
    }

    @Override
    public void stop() {
        System.out.println("Music is stopped...");
    }
}
public class TestPlayer{
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.play();
        player.pause();
        player.stop();
    }
}


    

