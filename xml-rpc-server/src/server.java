import java.io.IOException;

import org.apache.xmlrpc.*;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.WebServer;

public class server {
	
	public static void main (String [] args){
	
		  System.out.println("Attempting to start XML-RPC Server...");
		    WebServer webServer = new WebServer(8080);
		    XmlRpcServer xmlRpcServer = webServer.getXmlRpcServer();
		    
		    PropertyHandlerMapping phm = new PropertyHandlerMapping();
	          /* Load handler definitions from a property file.
	           * The property file might look like:
	           *   Calculator=org.apache.xmlrpc.demo.Calculator
	           *   org.apache.xmlrpc.demo.proxy.Adder=org.apache.xmlrpc.demo.proxy.AdderImpl
	           */
	          try {
				phm.load(Thread.currentThread().getContextClassLoader(),
				           "MyHandlers.properties");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (XmlRpcException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

	          /* You may also provide the handler classes directly,
	           * like this:
	           * phm.addHandler("Calculator",
	           *     org.apache.xmlrpc.demo.Calculator.class);
	           * phm.addHandler(org.apache.xmlrpc.demo.proxy.Adder.class.getName(),
	           *     org.apache.xmlrpc.demo.proxy.AdderImpl.class);
	           */
	          xmlRpcServer.setHandlerMapping(phm);
	        
	          XmlRpcServerConfigImpl serverConfig =
	              (XmlRpcServerConfigImpl) xmlRpcServer.getConfig();
	          serverConfig.setEnabledForExtensions(true);
	          serverConfig.setContentLengthOptional(false);

	          try {
				webServer.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
	}
	

}
