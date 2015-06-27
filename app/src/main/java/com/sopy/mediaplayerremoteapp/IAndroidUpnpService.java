package com.sopy.mediaplayerremoteapp;

import org.fourthline.cling.UpnpService;
import org.fourthline.cling.UpnpServiceConfiguration;
import org.fourthline.cling.controlpoint.ControlPoint;
import org.fourthline.cling.registry.Registry;

/**
 * Created by sanae on 27/06/15.
 */
public interface IAndroidUpnpService {

    /**
     * @return The actual main instance and interface of the UPnP service.
     */
    public UpnpService get();

    /**
     * @return The configuration of the UPnP service.
     */
    public UpnpServiceConfiguration getConfiguration();

    /**
     * @return The registry of the UPnP service.
     */
    public Registry getRegistry();

    /**
     * @return The client API of the UPnP service.
     */
    public ControlPoint getControlPoint();

}
