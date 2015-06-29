package com.sopy.mediaplayerremoteapp;

import org.fourthline.cling.UpnpService;
import org.fourthline.cling.UpnpServiceConfiguration;
import org.fourthline.cling.controlpoint.ControlPoint;
import org.fourthline.cling.registry.Registry;

/**
 * Created by sanae on 29/06/15.
 */
interface IAndroidUpnpService {
    /**
     * @return The actual main instance and interface of the UPnP service.
     */
    UpnpService get();

    /**
     * @return The configuration of the UPnP service.
     */
    UpnpServiceConfiguration getConfiguration();

    /**
     * @return The registry of the UPnP service.
     */
    Registry getRegistry();

    /**
     * @return The client API of the UPnP service.
     */
    ControlPoint getControlPoint();

}
