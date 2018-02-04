package carlos.anguiano.clean.architecture.deps;

import javax.inject.Singleton;

import carlos.anguiano.clean.architecture.home.HomeActivity;
import carlos.anguiano.clean.architecture.networking.NetworkModule;
import dagger.Component;

/**
 * Created by Carlos Anguiano on 03/02/18.
 * For more info contact: c.joseanguiano@gmail.com
 */

@Singleton
@Component(modules = {NetworkModule.class})
public interface Deps {
    void inject(HomeActivity homeActivity);
}