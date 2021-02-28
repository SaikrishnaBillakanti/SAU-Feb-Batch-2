import java.util.*;

public class Producertask
{
	
    LinkedList<Integer>queue=new LinkedList<>(); 
    int n=5; 
    public void produce() throws InterruptedException 
    { 
        int value=4; 
        while (true)
        { 
            synchronized (this) 
            { 
                while (queue.size()==n) 
                    wait(); 
                System.out.println("Producer produced-" + value); 
                queue.add(value++); 
                notify(); 
                Thread.sleep(2000); 
            } 
        } 
    } 

    
    public void consume() throws InterruptedException 
    { 
        while (true) 
        { 
            synchronized (this) 
            {  
                while (queue.size()==0) 
                    wait();   
                int val = queue.removeFirst(); 
                System.out.println("Consumer consumed-" + val); 
                notify(); 
                Thread.sleep(2000); 
            } 
        } 
    } 
}

class Threadexample
{ 
    public static void main(String[] args) throws InterruptedException 
    {  
        Producertask pt=new Producertask();   
        pt.queue.add(1);
        pt.queue.add(2);
        pt.queue.add(3);       
        Thread t1 = new Thread(new Runnable()
        { 
            @Override
            public void run() 
            { 
                try
                { 
                    pt.produce(); 
                } 
                catch (InterruptedException e)
                 { 
                    e.printStackTrace(); 
                } 
            } 
        }); 
   
        Thread t2 = new Thread(new Runnable()
        { 
            @Override
            public void run() 
            { 
                try 
                { 
                    pt.consume(); 
                } 
                catch (InterruptedException e) { 
                    e.printStackTrace(); 
                } 
            } 
        });        
        t1.start(); 
        t2.start(); 
        t1.join(); 
        t2.join(); 
    } 
}
