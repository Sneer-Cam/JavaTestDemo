package wjx.wiser.sneer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InformationDemo 
{

	public static void main(String[] args)
	{
		File outputfile = new File("D:\\test.txt");
		File file = new File("D:\\test.txt");
		
		writerFile01(outputfile);
		readFile01(file);
	}

	private static void writerFile01(File outputfile)
	{
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(outputfile);
			String str = "WangJiaxin";
			byte[] buff = str.getBytes();
			fos.write(buff);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (fos!=null) {
					fos.close();
					fos=null;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void readFile01(File file)
	{
		FileInputStream fis = null;
		
		try {
				fis = new FileInputStream(file);
				
				int c = -1;
				while ((c=fis.read()) !=-1) {
					System.out.print((char)c);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if (fis!=null) {
						fis.close();
						fis=null;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
						
	}

}
