/****************************************************************************************** 
Name: Zhenyu Jiang 
Course: CS170-01 
Lab #: Lab Assignment Four
Submission Date: 10pm, Tue(11/22)
Description:  This class is used to count all the even numbers under 101. It is extends from
the Thread class so that it has thread functionality.
*********************************************************************************************/ 
public class Printeven extends Thread
{
	public void run()
	{
		for(int i = 2; i <=100; i+=2) //starting from 0, adding 2 each time until 100 is reached
		{ 
			System.out.println(this.getName() + ": Count "+ i); //print the current index
			//Thread.yield();  //let the other thread to run
			Thread.yield();
		}
	}
}