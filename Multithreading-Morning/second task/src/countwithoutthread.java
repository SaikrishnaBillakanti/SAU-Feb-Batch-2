import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 

public class countwithoutthread 
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
public static void main(String[] args) 
{ 
	int c=0;
	List l=readFileInList("C:\\Users\\B.SAI RAM\\eclipse-workspace\\second task-Multithreading\\sample.java");
	Iterator<String> itr=l.iterator(); 
	while (itr.hasNext()) 
	{
	 c++;
	 String s=itr.next();
	 System.out.println(s);
	}
	System.out.println(c);
	} 
} 
