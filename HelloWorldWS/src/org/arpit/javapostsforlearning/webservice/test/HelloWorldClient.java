package org.arpit.javapostsforlearning.webservice.test;
/**
 * 
 */

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.arpit.javapostsforlearning.webservice.HelloWorld;

/**
 * @author rgupta
 * 
 */
public class HelloWorldClient {

	public static void main(String[] args) throws Exception {

		URL url = null;
		url = new URL("http://localhost:8080/HelloWorldWS/HelloWorldImpl?wsdl");
		// url = new URL("http://172.25.28.82:8080/CalypsoWebService?wsdl");
		// url = new URL("http://172.25.25.47:8080/CalypsoWebService?wsdl");

		QName qname = new QName("http://webservice.javapostsforlearning.arpit.org/", "HelloWorldImplService");

		Service service = Service.create(url, qname);

		HelloWorld helloWorld = service.getPort(HelloWorld.class);

		String str = helloWorld.sayHelloWorld("Rahul");

		System.out.println(str);
	}

}