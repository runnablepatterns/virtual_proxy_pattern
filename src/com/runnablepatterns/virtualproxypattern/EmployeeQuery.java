package com.runnablepatterns.virtualproxypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that returns the real query results 
 */
public class EmployeeQuery implements IQueryable{

	@Override
	public String getResults() {
		StringBuilder results = new StringBuilder();
		
		results.append("Employee ID\tEmployee Name\tEmployee Address\n");
		results.append("1\t\tCarlos M\tSan Jose\n");
		results.append("2\t\tJohn B\t\tHeredia\n");
		results.append("3\t\tPeter S\t\tAlajuela\n");
		
		// get the actual results
		return results.toString();
	}

}
