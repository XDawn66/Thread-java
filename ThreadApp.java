/****************************************************************************************** 
Name: Zhenyu Jiang 
Course: CS170-01 
Lab #: Lab Assignment Four
Submission Date: 10pm, Tue(11/22)
Description:  This is a driver class that create two threads. Those threads will call functions 
from the Printodd and the Printeven class to count number from 1 to 100. By using the yield(),
functions will be alternated between two threads
*********************************************************************************************/ 
public class ThreadApp
{
	public static void main(String[] args)
	{
		Thread counter = new Printodd(); //creating two threads
		Thread counter2 = new Printeven();
		
		counter.start();//run those two threads
		counter2.start();
	}
}