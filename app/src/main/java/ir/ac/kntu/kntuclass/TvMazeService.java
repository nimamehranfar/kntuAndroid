package ir.ac.kntu.kntuclass;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ir.ac.kntu.kntuclass.model.Show;
import ir.ac.kntu.kntuclass.model.ShowItem;

public interface TvMazeService {
  @GET("/search/shows")
  Call<List<ShowItem>> searchMovie(@Query("q") String query);

  @GET("shows/{id}")
  Call<Show> getMovieDetail(@Path("id") String id);
}
