
package cz.codingmonkeys.smartclub.integration.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.bsc.g6.components.tibco.integration.io.smartclub package. 
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

	private final static QName _TransientException_QNAME = new QName("http://www.tbc.ge/EAI/Service/Base/v1", "TransientException");
	private final static QName _ApplicationException_QNAME = new QName("http://www.tbc.ge/EAI/Service/Base/v1", "ApplicationException");
	private final static QName _MaintenanceException_QNAME = new QName("http://www.tbc.ge/EAI/Service/Base/v1", "MaintenanceException");
	private final static QName _SystemException_QNAME = new QName("http://www.tbc.ge/EAI/Service/Base/v1", "SystemException");
	private final static QName _BaseException_QNAME = new QName("http://www.tbc.ge/EAI/Service/Base/v1", "BaseException");
	private final static QName _BaseExceptionObj_QNAME = new QName("http://www.tbc.ge/EAI/Service/Base/v1", "obj");
	private final static QName _BaseExceptionStackTrace_QNAME = new QName("http://www.tbc.ge/EAI/Service/Base/v1", "stackTrace");
	private final static QName _BaseExceptionMessage_QNAME = new QName("http://www.tbc.ge/EAI/Service/Base/v1", "message");
	private final static QName _BaseExceptionSystem_QNAME = new QName("http://www.tbc.ge/EAI/Service/Base/v1", "system");
	private final static QName _BaseExceptionSource_QNAME = new QName("http://www.tbc.ge/EAI/Service/Base/v1", "source");
	private final static QName _DefaultResponseDecription_QNAME = new QName("http://www.tbc.ge/EAI/Service/Base/v1", "decription");
	private final static QName _BaseCommandUserDN_QNAME = new QName("http://www.tbc.ge/EAI/Service/Base/v1", "userDN");
	private final static QName _MessageTimestamp_QNAME = new QName("http://www.tbc.ge/EAI/Service/Base/v1", "timestamp");
	private final static QName _BaseEventCorrelationId_QNAME = new QName("http://www.tbc.ge/EAI/Service/Base/v1", "correlationId");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.bsc.g6.components.tibco.integration.io.smartclub
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link SystemException }
	 * 
	 */
	public SystemException createSystemException() {
		return new SystemException();
	}

	/**
	 * Create an instance of {@link MaintenanceException }
	 * 
	 */
	public MaintenanceException createMaintenanceException() {
		return new MaintenanceException();
	}

	/**
	 * Create an instance of {@link BaseException }
	 * 
	 */
	public BaseException createBaseException() {
		return new BaseException();
	}

	/**
	 * Create an instance of {@link TransientException }
	 * 
	 */
	public TransientException createTransientException() {
		return new TransientException();
	}

	/**
	 * Create an instance of {@link ApplicationException }
	 * 
	 */
	public ApplicationException createApplicationException() {
		return new ApplicationException();
	}

	/**
	 * Create an instance of {@link SmartClubFinancialProfile }
	 * 
	 */
	public SmartClubFinancialProfile createSmartClubFinancialProfile() {
		return new SmartClubFinancialProfile();
	}

	/**
	 * Create an instance of {@link GetSmartClubInfoRequest }
	 * 
	 */
	public GetSmartClubInfoRequest createGetSmartClubInfoRequest() {
		return new GetSmartClubInfoRequest();
	}

	/**
	 * Create an instance of {@link GetSmartClubInfoResponse }
	 * 
	 */
	public GetSmartClubInfoResponse createGetSmartClubInfoResponse() {
		return new GetSmartClubInfoResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TransientException }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.tbc.ge/EAI/Service/Base/v1", name = "TransientException")
	public JAXBElement<TransientException> createTransientException(TransientException value) {
		return new JAXBElement<TransientException>(_TransientException_QNAME, TransientException.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationException }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.tbc.ge/EAI/Service/Base/v1", name = "ApplicationException")
	public JAXBElement<ApplicationException> createApplicationException(ApplicationException value) {
		return new JAXBElement<ApplicationException>(_ApplicationException_QNAME, ApplicationException.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceException }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.tbc.ge/EAI/Service/Base/v1", name = "MaintenanceException")
	public JAXBElement<MaintenanceException> createMaintenanceException(MaintenanceException value) {
		return new JAXBElement<MaintenanceException>(_MaintenanceException_QNAME, MaintenanceException.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SystemException }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.tbc.ge/EAI/Service/Base/v1", name = "SystemException")
	public JAXBElement<SystemException> createSystemException(SystemException value) {
		return new JAXBElement<SystemException>(_SystemException_QNAME, SystemException.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link BaseException }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.tbc.ge/EAI/Service/Base/v1", name = "BaseException")
	public JAXBElement<BaseException> createBaseException(BaseException value) {
		return new JAXBElement<BaseException>(_BaseException_QNAME, BaseException.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.tbc.ge/EAI/Service/Base/v1", name = "obj", scope = BaseException.class)
	public JAXBElement<String> createBaseExceptionObj(String value) {
		return new JAXBElement<String>(_BaseExceptionObj_QNAME, String.class, BaseException.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.tbc.ge/EAI/Service/Base/v1", name = "stackTrace", scope = BaseException.class)
	public JAXBElement<String> createBaseExceptionStackTrace(String value) {
		return new JAXBElement<String>(_BaseExceptionStackTrace_QNAME, String.class, BaseException.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.tbc.ge/EAI/Service/Base/v1", name = "message", scope = BaseException.class)
	public JAXBElement<String> createBaseExceptionMessage(String value) {
		return new JAXBElement<String>(_BaseExceptionMessage_QNAME, String.class, BaseException.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.tbc.ge/EAI/Service/Base/v1", name = "system", scope = BaseException.class)
	public JAXBElement<String> createBaseExceptionSystem(String value) {
		return new JAXBElement<String>(_BaseExceptionSystem_QNAME, String.class, BaseException.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.tbc.ge/EAI/Service/Base/v1", name = "source", scope = BaseException.class)
	public JAXBElement<String> createBaseExceptionSource(String value) {
		return new JAXBElement<String>(_BaseExceptionSource_QNAME, String.class, BaseException.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.tbc.ge/EAI/Service/Base/v1", name = "userDN", scope = BaseCommand.class)
	public JAXBElement<String> createBaseCommandUserDN(String value) {
		return new JAXBElement<String>(_BaseCommandUserDN_QNAME, String.class, BaseCommand.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.tbc.ge/EAI/Service/Base/v1", name = "userDN", scope = BaseRequest.class)
	public JAXBElement<String> createBaseRequestUserDN(String value) {
		return new JAXBElement<String>(_BaseCommandUserDN_QNAME, String.class, BaseRequest.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.tbc.ge/EAI/Service/Base/v1", name = "timestamp", scope = Message.class)
	public JAXBElement<XMLGregorianCalendar> createMessageTimestamp(XMLGregorianCalendar value) {
		return new JAXBElement<XMLGregorianCalendar>(_MessageTimestamp_QNAME, XMLGregorianCalendar.class, Message.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.tbc.ge/EAI/Service/Base/v1", name = "correlationId", scope = BaseEvent.class)
	public JAXBElement<String> createBaseEventCorrelationId(String value) {
		return new JAXBElement<String>(_BaseEventCorrelationId_QNAME, String.class, BaseEvent.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.tbc.ge/EAI/Service/Base/v1", name = "correlationId", scope = BaseResponse.class)
	public JAXBElement<String> createBaseResponseCorrelationId(String value) {
		return new JAXBElement<String>(_BaseEventCorrelationId_QNAME, String.class, BaseResponse.class, value);
	}

}
