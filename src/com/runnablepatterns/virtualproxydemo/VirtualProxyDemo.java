package com.runnablepatterns.virtualproxydemo;

import java.time.LocalDateTime;

import com.runnablepatterns.virtualproxypattern.EmployeeQueryProxy;
import com.runnablepatterns.virtualproxypattern.IQueryable;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class used to demonstrate Virtual Proxy Pattern
 */
public class VirtualProxyDemo {

	public static void main(String[] args) {
		try {
			// create the proxy query
			IQueryable query = new EmployeeQueryProxy();
			
			// simulate request
			System.out.println("Perform request to get the results: " + LocalDateTime.now());
			
			// get the results
			System.out.println(query.getResults());
			System.out.println();
			
			// wait for the thread
			Thread.sleep(2000);
			
			// keep waiting
			System.out.println("Keep waiting for the results: " + LocalDateTime.now());
			
			// get the results
			System.out.println(query.getResults());
			System.out.println();
			
			// wait for the thread
			Thread.sleep(3000);
			
			// keep waiting
			System.out.println("Get the expected output: " + LocalDateTime.now());
						
			// get the expected output
			System.out.println(query.getResults());
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
