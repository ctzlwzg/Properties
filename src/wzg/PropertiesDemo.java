package wzg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws Exception {
		//����һ��Properties����
		Properties p=new Properties();
		//�Լ�ֵ�Եķ�ʽ�洢����
		p.setProperty("username", "wzg");
		p.setProperty("password", "123456");
		//�����ļ����������
		OutputStream fos = new FileOutputStream("resource/db.properties");
		//��Properties���󱣴浽�ļ���
		p.store(fos, "db");
		//�����ļ�����������
		InputStream f = new FileInputStream("resource/db.properties");
		//��properties�м�������
		p.load(f);
		//�ر���
		f.close();
		fos.close();
		System.out.println(p);
		System.out.println("�ʺţ�"+p.getProperty("username"));
		System.out.println("���룺"+p.getProperty("password"));
	}
}
