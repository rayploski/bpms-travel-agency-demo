package acme.service.soap.hotelws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-10-01T17:03:32+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "HotelWS", 
                  wsdlLocation = "file:/home/schenget/git/phase1_release/bpms-travel-agency-demo/projects/acme-data-model/WSDLS/HotelWS.wsdl",
                  targetNamespace = "http://soap.service.acme/HotelWS/") 
public class HotelWS_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.service.acme/HotelWS/", "HotelWS");
    public final static QName HotelWSImplPort = new QName("http://soap.service.acme/HotelWS/", "HotelWSImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/schenget/git/phase1_release/bpms-travel-agency-demo/projects/acme-data-model/WSDLS/HotelWS.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HotelWS_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/schenget/git/phase1_release/bpms-travel-agency-demo/projects/acme-data-model/WSDLS/HotelWS.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HotelWS_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HotelWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelWS_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HotelWS_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HotelWS_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HotelWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns HotelWS
     */
    @WebEndpoint(name = "HotelWSImplPort")
    public HotelWS getHotelWSImplPort() {
        return super.getPort(HotelWSImplPort, HotelWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelWS
     */
    @WebEndpoint(name = "HotelWSImplPort")
    public HotelWS getHotelWSImplPort(WebServiceFeature... features) {
        return super.getPort(HotelWSImplPort, HotelWS.class, features);
    }

}
