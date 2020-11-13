package edu.ithaca.dragon.datastructures.tree;

import bridges.benchmark.BinaryTreeHeightBenchmark;
import bridges.connect.Bridges;

public class BinaryTreeHeightAnalysisMain {
    
    public static void main(String[] args) throws Exception {
        Bridges bridges = new Bridges(3, "tdragon", "29315085544");
        bridges.setTitle("Binary Tree height growth");

        int numDataPoints = 1000;
        int numActionsPerDataPoint = 10;
        BinaryTreeHeightBenchmark addItemsBenchmark = new BinaryTreeHeightBenchmark(numDataPoints, numActionsPerDataPoint);
        bridges.setDataStructure(addItemsBenchmark.getViewableModel());
        bridges.visualize();
    }
}
