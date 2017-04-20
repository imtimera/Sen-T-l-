package fr.compagny.sentele;

import android.net.Uri;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Live extends AppCompatActivity {

    private static final java.lang.String LOG_TAG ="LOG" ;
    MediaSessionCompat mMediaSession;
    PlaybackStateCompat.Builder mStateBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);
        mMediaSession = new MediaSessionCompat(this, LOG_TAG);

        // Enable callbacks from MediaButtons and TransportControls
        mMediaSession.setFlags(
                MediaSessionCompat.FLAG_HANDLES_MEDIA_BUTTONS |
                        MediaSessionCompat.FLAG_HANDLES_TRANSPORT_CONTROLS);

        // Do not let MediaButtons restart the player when the app is not visible
        mMediaSession.setMediaButtonReceiver(null);

        // Set an initial PlaybackState with ACTION_PLAY, so media buttons can start the player
        mStateBuilder = new PlaybackStateCompat.Builder()
                .setActions(
                        PlaybackStateCompat.ACTION_PLAY |
                                PlaybackStateCompat.ACTION_PLAY_PAUSE);
        //mMediaSession.setState(mStateBuilder.build());

        // MySessionCallback has methods that handle callbacks from a media controller
        //mMediaSession.setCallback(new MySessionCallback());

        // Create a MediaControllerCompat
        MediaControllerCompat mediaController =
                new MediaControllerCompat(this, mMediaSession);

        MediaControllerCompat.setMediaController(this, mediaController);
    }

        /*video=(VideoView)findViewById(R.id.videoView);
        MediaController mc = new MediaController(Live.this);
        mc.setAnchorView(video);
        mc.setMediaPlayer(video);
        Uri uri = Uri.parse("http://www.arte.tv/guide/fr/direct");
        video.setMediaController(mc);
        video.setVideoURI(uri);
        video.start();
*/
}
