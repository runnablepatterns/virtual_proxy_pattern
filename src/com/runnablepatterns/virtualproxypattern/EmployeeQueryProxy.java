package com.runnablepatterns.virtualproxypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that returns temporal results while the real object EmployeeQuery finish loading 
 */
public class EmployeeQueryProxy implements IQueryable{

	/**
	 * Variable to store the real object
	 */
	private EmployeeQuery realQuery;
	
	/**
	 * Variable to simulate the query
	 */
	private Thread retrieval;
	
	/**
	 * flag used to control instance creation
	 */
	private boolean retrieving = false;
	
	@Override
	public String getResults() {
		// if we have the instance of the real object
		if(realQuery != null) {
			return realQuery.getResults();
		}
		// if we are going to retrieve the object
		else if(!retrieving){
			// change the flag
			retrieving = true;
			
			// create a new thread to simulate the query retrieval
			retrieval = new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(3000);
						// create the instance
						realQuery = new EmployeeQuery();
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			});
			
			// start the thread
			retrieval.start();
		}
		
		// display temporal message
		return "Loading results. Please wait.";
	}

}
