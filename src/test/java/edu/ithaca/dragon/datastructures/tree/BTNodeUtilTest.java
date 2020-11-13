package edu.ithaca.dragon.datastructures.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BTNodeUtilTest {

    @Test
    public void heightTest(){
        assertEquals(2, BTNodeUtil.height(SampleTrees.getTree1()));
        assertEquals(2, BTNodeUtil.height(SampleTrees.getTree2()));
        assertEquals(4, BTNodeUtil.height(SampleTrees.getTree4()));
        assertEquals(1, BTNodeUtil.height(SampleTrees.getTree1().getRight()));
        assertEquals(2, BTNodeUtil.height(SampleTrees.getTree4().getLeft()));
        assertEquals(3, BTNodeUtil.height(SampleTrees.getTree4().getRight()));

        assertEquals(-1, BTNodeUtil.height(null));
        assertEquals(0, BTNodeUtil.height(new BTNode(5)));
    }

    @Test
    public void treeGrowingVisualization() throws Exception{
        BTNode tree = SampleTrees.getTree4();
        for (int key=10; key<100; key++){
            BTNodeUtil.add(tree, key);
        }
        TreeVisualization.visualizeBinaryTree(tree, "<YOUR_USER_ID>","<YOUR_API_KEY>");
    }
    
}
