package com.lentimosystems.bodappuser.Common;

import com.lentimosystems.bodappuser.Remote.FCMClient;
import com.lentimosystems.bodappuser.Remote.GoogleMapsAPI;
import com.lentimosystems.bodappuser.Remote.IFCMService;
import com.lentimosystems.bodappuser.Remote.IGoogleAPI;

/**
 * Created by LICIO on 1/14/2018.
 */

public class Common {
    public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_rider_tbl = "RidersInformation";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";

    public static final String fcmURL = "https://fcm.googleapis.com";
    public static final String googleApiUrl = "https://maps.googleapis.com";

    private static double base_fare = 2.55;
    private static double time_rate = 0.35;
    private static double distance_rate = 1.75;

    public static double getPrice(double km, int min)
    {
        return (base_fare+(time_rate*min)+(distance_rate*km));
    }

    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
    public static IGoogleAPI getGoogleService()
    {
        return GoogleMapsAPI.getClient(googleApiUrl).create(IGoogleAPI.class);
    }
}
