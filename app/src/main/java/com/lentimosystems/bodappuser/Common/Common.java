package com.lentimosystems.bodappuser.Common;

import com.lentimosystems.bodappuser.Remote.FCMClient;
import com.lentimosystems.bodappuser.Remote.IFCMService;

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

    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
