
package com.samanecorp.soap1Client.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.samanecorp.soap1Client.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Add_QNAME = new QName("http://service.webservice.uok.com/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://service.webservice.uok.com/", "addResponse");
    private final static QName _Minus_QNAME = new QName("http://service.webservice.uok.com/", "minus");
    private final static QName _MinusResponse_QNAME = new QName("http://service.webservice.uok.com/", "minusResponse");
    private final static QName _Save_QNAME = new QName("http://service.webservice.uok.com/", "save");
    private final static QName _SaveResponse_QNAME = new QName("http://service.webservice.uok.com/", "saveResponse");
    private final static QName _User_QNAME = new QName("http://service.webservice.uok.com/", "user");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.samanecorp.soap1Client.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Minus }
     * 
     */
    public Minus createMinus() {
        return new Minus();
    }

    /**
     * Create an instance of {@link MinusResponse }
     * 
     */
    public MinusResponse createMinusResponse() {
        return new MinusResponse();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link UserDto }
     * 
     */
    public UserDto createUserDto() {
        return new UserDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.webservice.uok.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.webservice.uok.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Minus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Minus }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.webservice.uok.com/", name = "minus")
    public JAXBElement<Minus> createMinus(Minus value) {
        return new JAXBElement<Minus>(_Minus_QNAME, Minus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MinusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.webservice.uok.com/", name = "minusResponse")
    public JAXBElement<MinusResponse> createMinusResponse(MinusResponse value) {
        return new JAXBElement<MinusResponse>(_MinusResponse_QNAME, MinusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Save }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.webservice.uok.com/", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.webservice.uok.com/", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.webservice.uok.com/", name = "user")
    public JAXBElement<UserDto> createUser(UserDto value) {
        return new JAXBElement<UserDto>(_User_QNAME, UserDto.class, null, value);
    }

}
