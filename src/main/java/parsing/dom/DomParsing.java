package parsing.dom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import parsing.model.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static parsing.model.CustomerPars.setBirthday;


public class DomParsing {
    private static final Logger LOGGER = LogManager.getLogger(DomParsing.class);
    
    private CarPars carPars = new CarPars();
    private CustomerPars customPars = new CustomerPars();
    private DiscountCardPars discountCardPars = new DiscountCardPars();
    private OrderPars orderPars = new OrderPars();
    private PaymentPars paymentPars = new PaymentPars();


    public CarPars getCarPars() {
        return carPars;
    }


    public void setCarPars(CarPars carPars) {
        this.carPars = carPars;
    }


    public CustomerPars getCustomPars() {
        return customPars;
    }


    public void setCustomPars(CustomerPars customPars) {
        this.customPars = customPars;
    }


    public DiscountCardPars getDiscountCardPars() {
        return discountCardPars;
    }


    public void setDiscountCardPars(DiscountCardPars discountCardPars) {
        this.discountCardPars = discountCardPars;
    }


    public OrderPars getOrderPars() {
        return orderPars;
    }


    public void setOrderPars(OrderPars orderPars) {
        this.orderPars = orderPars;
    }


    public PaymentPars getPaymentPars() {
        return paymentPars;
    }


    public void setPaymentPars(PaymentPars paymentPars) {
        this.paymentPars = paymentPars;
    }

    public void parse() throws ParserConfigurationException, IOException, SAXException, ParseException {
        File xmlFile = new File(System.getProperty("user.dir") + "/src/main/resources/example.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(xmlFile);
        doc.getDocumentElement().normalize();
        Element element = doc.getDocumentElement();
        OrderPars.setId(element.getAttribute("id"));
        OrderPars.setPrice(element.getElementsByTagName("price").item(0).getTextContent());
        NodeList nodeList = doc.getElementsByTagName("custom");
        PaymentPars.setCustomerPars(customPars);
        Node CustomParsNode = nodeList.item(0);
        Element element1 = (Element) CustomParsNode;
        customPars.setName(element1.getElementsByTagName("name").item(0).getTextContent());
        customPars.setCustomers_phone(element1.getElementsByTagName("customers_phone").item(0).getTextContent());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        setBirthday(sdf.parse(element1.getElementsByTagName("birthday").item(0).getTextContent()));
        PaymentPars.setCustomerPars(customPars);

        NodeList CarParsList = doc.getElementsByTagName("carPars");
        Node CarParsNode = CarParsList.item(0);
        Element CarParsElement = (Element) CarParsNode;
        carPars.setModel(CarParsElement.getElementsByTagName("model").item(0).getTextContent());
        carPars.setRegistration_number(Integer.parseInt(CarParsElement.getElementsByTagName("registration_number").item(0).getTextContent()));
        LOGGER.info(customPars);
    }
    public OrderPars takeOrderPars() {
        return orderPars;
    }

}
