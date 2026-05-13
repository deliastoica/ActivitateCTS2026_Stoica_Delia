package ro.ase.clase;

public class AdapterVideo extends VideoStandard{
    private VideoLive videoLive;

    public AdapterVideo(VideoLive videoLive) {
        this.videoLive = videoLive;
    }

    @Override
    public void reda() {
        videoLive.reda();
    }
}
