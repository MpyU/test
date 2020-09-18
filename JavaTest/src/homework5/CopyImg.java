package homework5;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class CopyImg {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://pic1.win4000.com/pic/1/5c/b19b23087f.jpg");
		URLConnection conn = url.openConnection();
		InputStream is = conn.getInputStream();
		OutputStream os = new FileOutputStream("D:\\git_space\\"+System.currentTimeMillis()+".jpg");
		int len = 0;
		byte[] bys = new byte[1024];
		while((len = is.read(bys))!=-1) {
			os.write(bys, 0, len);
		}
		is.close();
		os.close();
		
	}
}
