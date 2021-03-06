package org.example.solutions;

import org.example.problem.IProblemSolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionSortSlice implements IProblemSolver {

    @Override
    public List<Pair> isSumIn(int[] data, int sum) {

        List<Pair> pairs = new ArrayList<>();

        Arrays.sort(data);
        if (sum >= 0 ) {
            int last = data.length-1;
            for (int i = 0; i < last ; i++) {
                int position = Arrays.binarySearch(data, i+1, last+1, sum - data[i]);
                if (position >= 0){
                    pairs.add(new Pair(data[i], sum - data[i]));
                    int j = position - 1;
                    while ((j > i) && (data[j] == data[position])) {
                        pairs.add(new Pair(data[i], sum - data[i]));
                        j--;
                    }
                    j = position + 1;
                    while ((j < data.length) && (data[j] == data[position])) {
                        pairs.add(new Pair(data[i], sum - data[i]));
                        j++;
                    }
                    last = j-1;
                }
            }
        }
        else {
            int first = 0;
            for (int i = data.length-1; i > first; i--) {
                int position = Arrays.binarySearch(data, first, i-1, sum - data[i]);
                if (position >= 0) {
                    pairs.add(new Pair(data[i], sum - data[i]));
                    int j = position + 1;
                    while ((j < i) && (data[j] == data[position])) {
                        pairs.add(new Pair(data[i], sum - data[i]));
                        j++;
                    }
                    j = position - 1;
                    while ((j >= 0) && (data[j] == data[position])) {
                        pairs.add(new Pair(data[i], sum - data[i]));
                        j--;
                    }
                    first = j+1;
                }
            }
        }
        return pairs;
    }
}
