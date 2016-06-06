
package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "countryHttpPost", targetNamespace = "http://www.webserviceX.NET")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CountryHttpPost {


    /**
     * Get country name by country code
     * 
     * @param countryCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCountryByCountryCode")
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getCountryByCountryCode(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "CountryCode")
        String countryCode);

    /**
     * Get International Dialing Code by country name 
     * 
     * @param countryName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetISD")
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getISD(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "CountryName")
        String countryName);

    /**
     * Get all countries with ISO code
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCountries")
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getCountries();

    /**
     * Get currency by currency name 
     * 
     * @param currencyName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCurrencyCodeByCurrencyName")
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getCurrencyCodeByCurrencyName(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "CurrencyName")
        String currencyName);

    /**
     * Get countries by country name 
     * 
     * @param countryName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetISOCountryCodeByCountyName")
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getISOCountryCodeByCountyName(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "CountryName")
        String countryName);

    /**
     * Get all currencycode for each country 
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCurrencyCode")
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getCurrencyCode();

    /**
     * Get country by currency code
     * 
     * @param currencyCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCountryByCurrencyCode")
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getCountryByCurrencyCode(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "CurrencyCode")
        String currencyCode);

    /**
     * Get all currency,currency code for all countries 
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCurrencies")
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getCurrencies();

    /**
     * Get currency by country name 
     * 
     * @param countryName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCurrencyByCountry")
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getCurrencyByCountry(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "CountryName")
        String countryName);

    /**
     * Get greenwich mean time(GMT) by country name 
     * 
     * @param countryName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetGMTbyCountry")
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    public String getGMTbyCountry(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "CountryName")
        String countryName);

}
