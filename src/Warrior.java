
public class Warrior extends Thread {
String res1="Ak47";
String res2="M416";
String res4="AWM";
@Override
public void run()
{
	if(Thread.currentThread().getName().equals("Student1"))
	{
		Student1Acq();
	}
	else
	{
		Student2Acq();
		
	}
}

public void Student1Acq()
{
	try
	{
		synchronized(res1)
		{
			System.out.println("Student1 Acquired the resource :"+res1);
			Thread.sleep(3000);
		synchronized(res2)
		{
			System.out.println("Student1 Acquired the resource :"+res2);
			Thread.sleep(3000);
		synchronized(res4)
		{
			System.out.println("Student1 Acquired the resource :"+res4);
			Thread.sleep(3000);
		}//release res 3
		}//release res 2
		}//release res 1
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
}

public void Student2Acq()
{
	try
	{
		synchronized(res1)
		{
			System.out.println("Student2 Acquired the resource :"+res1);
			Thread.sleep(3000);
		synchronized(res2)
		{
			System.out.println("Student2 Acquired the resource :"+res2);
			Thread.sleep(3000);
		synchronized(res4)
		{
			System.out.println("Student2 Acquired the resource :"+res4);
			Thread.sleep(3000);
		
		}//release res 3
		}//release res 2
		}//release res 1
		
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
}
}
