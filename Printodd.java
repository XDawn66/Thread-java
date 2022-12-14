/****************************************************************************************** 
Name: Zhenyu Jiang 
Course: CS170-01 
Lab #: Lab Assignment Four
Submission Date: 10pm, Tue(11/22)
Description:  This class is used to count all the odd numbers under 101. It is extends from
the Thread class so that it has thread functionality.
*********************************************************************************************/ 	
public class Printodd extends Thread
{
	public void run()
	{
		for(int i = 1; i <100; i+=2) //starting from 1, adding 2 each time until 99 is reached
		{
			System.out.println(this.getName() + ": Count "+ i);
			Thread.yield(); //let the other thread to run
			
		}
	}
}