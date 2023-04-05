package Adapter;

public class AudioPlayer implements MediaPlayer{


    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //by default mp3 support
        if(audioType.equalsIgnoreCase("mp3"))
        {
            System.out.println("playing mp3 filename "+ fileName);
        }

        //adding extra support
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4"))
        {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }

        else
            System.out.println("Invalid media type");


    }
}
