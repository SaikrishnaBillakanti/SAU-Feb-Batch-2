import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class countwiththread
{
public static void main(String[] args) 
{ 
	 long start = System.currentTimeMillis();   
	 Thread thread1 = new Thread(new oneThread());
	  thread1.start();
	  long end = System.currentTimeMillis();
	  System.out.println((end - start) + " ms");
}

}
class oneThread implements Runnable
{
	public static List<String> readFileInList(String fileName) 
	{ 

		List<String> lines = Collections.emptyList(); 
		try
		{ 
		lines=Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
		} 

		catch (IOException e) 
		{  
		 e.printStackTrace(); 
		} 
		return lines; 
	}

	@Override
	public void run()
	{
		int c=0;
		List l=readFileInList("C:\\Users\\B.SAI RAM\\eclipse-workspace\\second task-Multithreading\\sample.java");
		Iterator<String> itr=l.iterator(); 
		while (itr.hasNext()) 
		{
		 c++;
		 itr.next();
		// System.out.println(s);
		}
		System.out.println(c);	
	}

	

}
 