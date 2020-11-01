package AlgoExpert.Easy;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearchOnGraph {

    public static class Node {
        public String name;
        public List<Node> children = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            array.add(this.name);
            for (Node child : children) {
                child.depthFirstSearch(array);
            }
            return array;
        }

        public Node addChild(String name) {
            children.add(new Node(name));
            return this;
        }
    }


}
