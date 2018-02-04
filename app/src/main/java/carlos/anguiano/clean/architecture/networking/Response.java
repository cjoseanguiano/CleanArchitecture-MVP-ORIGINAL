package carlos.anguiano.clean.architecture.networking;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Carlos Anguiano on 03/02/18.
 * For more info contact: c.joseanguiano@gmail.com
 */

class Response {
    @SerializedName("status")
    public String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @SuppressWarnings({"unused", "used by Retrofit"})
    public Response() {
    }

    public Response(String status) {
        this.status = status;
    }
}

