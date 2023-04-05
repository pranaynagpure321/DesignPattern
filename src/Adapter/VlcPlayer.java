package Adapter;

public class VlcPlayer implements  AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println(" Plying on vlc media player" +fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
