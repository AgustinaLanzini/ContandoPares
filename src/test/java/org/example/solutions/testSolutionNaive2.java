package org.example.solutions;

import org.junit.Before;
import org.junit.Test;

public class testSolutionNaive2 extends testSolution{
	
	@Before
	public void setupNaive2() {
    	solver = new SolutionNaive2();
	}
	
    @Test
    public void testSolutionNaive21() {
    	testExample(solver, arr1, target1, solution1);    	
    	
    }
    
    @Test
    public void testSolutionNaive22() {
    	testExample(solver, arr2, target2, solution2);
    }
    
    @Test
    public void testSolutionNaive23() {
    	testExample(solver, arr3, target3, solution3);
    }
    
    @Test
    public void testSolutionNaive24() {
    	testExample(solver, arr4, target4, solution4);
    }
    
    @Test
    public void testSolutionNaive25() {
    	testExample(solver, arr5, target5, solution5);
    }
    
    @Test
    public void testSolutionNaive26() {
    	testExample(solver, arr6, target6, solution6);
    }
}