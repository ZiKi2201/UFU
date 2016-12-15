package wildbakery.ufu.Interfaces;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import wildbakery.ufu.Model.Job.JobsModel;
import wildbakery.ufu.Model.News.NewsModel;
import wildbakery.ufu.Model.Stock.StockModel;

import static wildbakery.ufu.Constants.HTTP.BASE_URL;


/**
 * Created by DIKII PEKAR on 01.12.2016.
 */

public interface APIservice {

    @GET("v1/jobs.json")
    Call<List<JobsModel>> getAllJob();

    @GET("v1/news.json")
    Call<List<NewsModel>> getAllNews();

    @GET("v1/events.json")
    Call<List<StockModel>> getAllStock();



}