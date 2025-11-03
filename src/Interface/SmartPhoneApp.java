package Interface;
interface Camera{
    void takePhoto();
}
interface MusicPlayer{
    void playMusic();
}
class SmartPhone implements Camera,MusicPlayer{
    @Override
    public void takePhoto() {
        System.out.println("By smartphone we can take pictures");
    }

    @Override
    public void playMusic() {
        System.out.println("We can play music using smartphone");
    }
}
public class SmartPhoneApp {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.playMusic();
        s.takePhoto();
    }
}
