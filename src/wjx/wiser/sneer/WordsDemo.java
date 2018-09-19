package wjx.wiser.sneer;

public class WordsDemo 
{

	public static void main(String[] args) 
	{
		Thread tamin = new Thread(new words());
		tamin.start();
		System.out.println("线程开始");
	}

}
class words implements Runnable{
	
	public void run(){
		char[] x = new char[26];
		
		try {
			for (int i = 0; i < x.length; i++) {
				x[i] = (char) (97 + i);
				System.out.println(x[i]);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("线程结束");
	}
}

