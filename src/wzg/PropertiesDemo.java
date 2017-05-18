package wzg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws Exception {
		//创建一个Properties对象
		Properties p=new Properties();
		//以键值对的方式存储数据
		p.setProperty("username", "wzg");
		p.setProperty("password", "123456");
		//创建文件输出流对象
		OutputStream fos = new FileOutputStream("resource/db.properties");
		//把Properties对象保存到文件中
		p.store(fos, "db");
		//创建文件输入流对象，
		InputStream f = new FileInputStream("resource/db.properties");
		//从properties中加载数据
		p.load(f);
		//关闭流
		f.close();
		fos.close();
		System.out.println(p);
		System.out.println("帐号："+p.getProperty("username"));
		System.out.println("密码："+p.getProperty("password"));
	}
}
