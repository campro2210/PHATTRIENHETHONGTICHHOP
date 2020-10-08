package lab3;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnection {
	public static void main(String[] args) {
		URL u;
		URLConnection uc;
		try {
			u = new URL("http://iuh.edu.vn");
			uc = u.openConnection();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}