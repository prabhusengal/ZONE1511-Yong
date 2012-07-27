
package com.tsp.zone;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b20 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ZoneManager", targetNamespace = "http://zone.tsp.com", wsdlLocation = "http://localhost:8080/ZoneManager/ZoneManagerBean?wsdl")
public class ZoneManager
    extends Service
{

    private final static URL ZONEMANAGER_WSDL_LOCATION;
    private final static WebServiceException ZONEMANAGER_EXCEPTION;
    private final static QName ZONEMANAGER_QNAME = new QName("http://zone.tsp.com", "ZoneManager");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ZoneManager/ZoneManagerBean?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ZONEMANAGER_WSDL_LOCATION = url;
        ZONEMANAGER_EXCEPTION = e;
    }

    public ZoneManager() {
        super(__getWsdlLocation(), ZONEMANAGER_QNAME);
    }



    public ZoneManager(URL wsdlLocation) {
        super(wsdlLocation, ZONEMANAGER_QNAME);
    }

   
    public ZoneManager(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }


    /**
     * 
     * @return
     *     returns ZoneManagerPortType
     */
    @WebEndpoint(name = "ZoneManagerPort")
    public ZoneManagerPortType getZoneManagerPort() {
        return super.getPort(new QName("http://zone.tsp.com", "ZoneManagerPort"), ZoneManagerPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZoneManagerPortType
     */
    @WebEndpoint(name = "ZoneManagerPort")
    public ZoneManagerPortType getZoneManagerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://zone.tsp.com", "ZoneManagerPort"), ZoneManagerPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ZONEMANAGER_EXCEPTION!= null) {
            throw ZONEMANAGER_EXCEPTION;
        }
        return ZONEMANAGER_WSDL_LOCATION;
    }

}