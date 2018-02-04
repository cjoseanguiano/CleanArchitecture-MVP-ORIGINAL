package carlos.anguiano.clean.architecture.networking;

import rx.Observable;

import carlos.anguiano.clean.architecture.model.CityListResponse;
import retrofit2.http.GET;

/**
 * Created by Carlos Anguiano on 03/02/18.
 * For more info contact: c.joseanguiano@gmail.com
 */

public interface NetworkService {

    @GET("v1/city")
    Observable<CityListResponse> getCityList();

}