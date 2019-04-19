package com.example.srivastavas.uber.Common;

import com.example.srivastavas.uber.Remote.IGoogleApi;
import com.example.srivastavas.uber.Remote.RetrofitClient;

public class Common
{
    public static final String baseUrl = "https://maps.googleapis.com";
    public static IGoogleApi getGoogleAPI()
    {
        return RetrofitClient.getClient(baseUrl).create(IGoogleApi.class);
    }
}
