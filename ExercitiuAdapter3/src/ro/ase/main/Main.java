package ro.ase.main;

import ro.ase.clase.AdapterVideo;
import ro.ase.clase.VideoLive;
import ro.ase.clase.VideoStandard;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void proceseazaVideo(VideoStandard videoStandard)
    {
        videoStandard.reda();
    }
    public static void main(String[] args) {
    VideoStandard videoStandard=new VideoStandard();
        VideoLive videoLive=new VideoLive();
        proceseazaVideo(videoStandard);
        AdapterVideo adapterVideo=new AdapterVideo(videoLive);
        proceseazaVideo(adapterVideo);
    }
}