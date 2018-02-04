package carlos.anguiano.clean.architecture;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.File;

import carlos.anguiano.clean.architecture.deps.DaggerDeps;
import carlos.anguiano.clean.architecture.deps.Deps;
import carlos.anguiano.clean.architecture.networking.NetworkModule;

/**
 * Created by Carlos Anguiano on 03/02/18.
 * For more info contact: c.joseanguiano@gmail.com
 */

public class BaseApp extends AppCompatActivity {

    Deps deps;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        File cacheFile = new File(getCacheDir(), "response");
        deps = DaggerDeps.builder().networkModule(new NetworkModule(cacheFile)).build();
    }
    public Deps getDeps() {
        return deps;
    }
}
