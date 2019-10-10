package com.runnablepatterns.virtualproxypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Interface used to expose the methods that can be used by virtual clients.
 */
public interface IQueryable {

	/**
	 * Get the query results
	 * @return Query results
	 */
	public String getResults();
}
