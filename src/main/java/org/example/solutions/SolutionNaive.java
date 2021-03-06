package org.example.solutions;

import java.util.ArrayList;
import java.util.List;

import org.example.problem.IProblemSolver;

public class SolutionNaive implements IProblemSolver{

    @Override
	public List<Pair> isSumIn(int[] data, int sum) {
		
		List<Pair> pairs = new ArrayList<>();
		
        for (int i = 0; i < data.length; i++) 
            for (int j = i + 1; j < data.length; j++) 
                if ((data[i] + data[j]) == sum) 
                    pairs.add(new Pair(data[i],data[j])); 
        
		return pairs;
	}

}
