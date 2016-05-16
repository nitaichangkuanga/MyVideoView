package video.jack.com.my_videoview;

import android.media.effect.Effect;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.VideoView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private VideoView vv;
    private EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vv = (VideoView) findViewById(R.id.vv);
        et = (EditText) findViewById(R.id.et);
        String path = et.getText().toString().trim();
        vv.setVideoPath(path);
        vv.start();
    }
}
