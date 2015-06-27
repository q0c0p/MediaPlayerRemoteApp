package com.sopy.mediaplayerremoteapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import org.fourthline.cling.android.AndroidUpnpServiceConfiguration;
import org.fourthline.cling.android.AndroidUpnpServiceImpl;

public class MyUpnpServiceImpl extends AndroidUpnpServiceImpl {

    protected MyUpnpServiceImpl() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
