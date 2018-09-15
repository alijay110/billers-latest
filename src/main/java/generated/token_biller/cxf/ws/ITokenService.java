package generated.token_biller.cxf.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-08-16T17:54:11.656+03:00
 * Generated source version: 3.2.5
 *
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "ITokenService")
@XmlSeeAlso({com.microsoft.schemas._2003._10.serialization.ObjectFactory.class, ObjectFactory.class})
public interface ITokenService {

    @WebMethod(operationName = "ValidateToken", action = "http://tempuri.org/ITokenService/ValidateToken")
    @Action(input = "http://tempuri.org/ITokenService/ValidateToken", output = "http://tempuri.org/ITokenService/ValidateTokenResponse")
    @RequestWrapper(localName = "ValidateToken", targetNamespace = "http://tempuri.org/", className = "generated.token_biller.cxf.ws.ValidateToken")
    @ResponseWrapper(localName = "ValidateTokenResponse", targetNamespace = "http://tempuri.org/", className = "generated.token_biller.cxf.ws.ValidateTokenResponse")
    @WebResult(name = "ValidateTokenResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean validateToken(
        @WebParam(name = "customerCode", targetNamespace = "http://tempuri.org/")
        java.lang.Integer customerCode,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        java.lang.String password,
        @WebParam(name = "token", targetNamespace = "http://tempuri.org/")
        java.lang.String token
    );

    @WebMethod(operationName = "Authenticate", action = "http://tempuri.org/ITokenService/Authenticate")
    @Action(input = "http://tempuri.org/ITokenService/Authenticate", output = "http://tempuri.org/ITokenService/AuthenticateResponse")
    @RequestWrapper(localName = "Authenticate", targetNamespace = "http://tempuri.org/", className = "generated.token_biller.cxf.ws.Authenticate")
    @ResponseWrapper(localName = "AuthenticateResponse", targetNamespace = "http://tempuri.org/", className = "generated.token_biller.cxf.ws.AuthenticateResponse")
    @WebResult(name = "AuthenticateResult", targetNamespace = "http://tempuri.org/")
    public generated.token_biller.cxf.ws.AuthenticateResponse.AuthenticateResult authenticate(
        @WebParam(name = "guid", targetNamespace = "http://tempuri.org/")
        java.lang.String guid,
        @WebParam(name = "customerCode", targetNamespace = "http://tempuri.org/")
        java.lang.Integer customerCode,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        java.lang.String password
    );
}
