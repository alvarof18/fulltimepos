import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class cleinte {

	public static void main(String[] args) throws MalformedURLException, XmlRpcException, InterruptedException {
	
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
		 config.setServerURL(new URL("http://192.168.1.186:5678"));
		 XmlRpcClient client = new XmlRpcClient();
		 client.setConfig(config);
		 
		// Thread.sleep(100000000);
		// String datos = (String) client.execute("HostVersion", args);
		 
		
	
	}

}
