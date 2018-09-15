
package generated.biller.experts.api.wsdl.payment;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "PaymentRequest", targetNamespace = "http://www.experts-payment.com/payment")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PaymentRequest {


    /**
     * 
     * @param paymentRequest
     * @return
     *     returns generated.biller.experts.api.wsdl.payment.PaymentResponse
     */
    @WebMethod(operationName = "Payment")
    @WebResult(name = "PaymentResponse", targetNamespace = "http://www.hifreud.com/ws/demo", partName = "PaymentResponse")
    public PaymentResponse payment(
            @WebParam(name = "PaymentRequest", targetNamespace = "http://www.hifreud.com/ws/demo", partName = "PaymentRequest")
                    PaymentRequest_Type paymentRequest);

}
