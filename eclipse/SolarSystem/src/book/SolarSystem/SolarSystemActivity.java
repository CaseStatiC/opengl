package book.SolarSystem;

import book.SolarSystem.SolarSystemRenderer;
import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.WindowManager;

public class SolarSystemActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
     		GLSurfaceView view = new GLSurfaceView(this);
       		view.setRenderer(new SolarSystemRenderer());
       		setContentView(view);
    }
}