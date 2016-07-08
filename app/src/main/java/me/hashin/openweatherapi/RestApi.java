package me.hashin.openweatherapi;

import me.hashin.openweatherapi.POJO.Model;
import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by hashin on 08/07/16.
 */
public interface RestApi {
    @GET("/data/2.5/weather?id=1277333&appid=12ab635c202c5c46037136a62443c293")
    Call<Model> getWeatherReport();
}
