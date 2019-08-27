package tree;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangke
 * @version 1.0
 * @className TreeBuilder
 * @description 递归算法构造JSON树形结构
 * @date 2019/8/5 11:15 AM
 **/


public class TreeBuilder {

    List<Node> nodes = new ArrayList<Node>();

    public TreeBuilder(List<Node> nodes) {
        super();
        this.nodes= nodes;

    }

    public static void main(String[] args) {

        List<Node>nodes = new ArrayList<Node>();
        Node p1 = new Node("01", "","01", "");
        Node p6 = new Node("02", "","02", "");
        Node p7 = new Node("0201", "02","0201", "");
        Node p2 = new Node("0101", "01","0101", "");
        Node p3 = new Node("0102", "01","0102", "");
        Node p4 = new Node("010101", "0101","010101", "");
        Node p5 = new Node("010102", "0101","010102", "");
        Node p8 = new Node("03", "","03", "");

        nodes.add(p1);
        nodes.add(p2);
        nodes.add(p3);
        nodes.add(p4);
        nodes.add(p5);
        nodes.add(p6);
        nodes.add(p7);
        nodes.add(p8);

        TreeBuilder treeBuilder = new TreeBuilder(nodes);
        System.out.println(treeBuilder.buildJSONTree());
    }

    /**
     * 构建JSON树形结构
     * @return
     */

    public String buildJSONTree() {
        List<Node> nodeTree = buildTree();
        Object json = JSONArray.toJSON(nodeTree);
        return json.toString();

    }
    /**
     * 构建树形结构
     * @return
     */

    public List<Node> buildTree() {
        List<Node> treeNodes = new ArrayList<Node>();
        List<Node>rootNodes = getRootNodes();
        for (Node rootNode : rootNodes) {
            buildChildNodes(rootNode);
            treeNodes.add(rootNode);
        }
        return treeNodes;
    }

    /**
     * 获取集合中所有的根节点
     * @return
     */

    public List<Node> getRootNodes() {
        List<Node>rootNodes = new ArrayList<Node>();
        for (Node n : nodes){
            if (rootNode(n)) {
                rootNodes.add(n);
            }
        }
        return rootNodes;
    }

    /**
     * 判断是否为根节点，如果当前node 的父 pid 遍历找不到，就是根节点
     * @param node 要判断的节点
     * @return
     */

    public boolean rootNode(Node node) {
        boolean isRootNode = true;
        for (Node n : nodes){
            if (node.getPid().equals(n.getId())) {
                isRootNode= false;
                break;
            }
        }
        return isRootNode;

    }

    /**
     * 递归子节点，获取根节点下的所有子节点
     * @param node
     */

    public void buildChildNodes(Node node) {
        List<Node> children = getChildNodes(node);
        if (!children.isEmpty()) {
            for(Node child : children) {
                buildChildNodes(child);
            }
            node.setMenus(children);
        }
    }

    /**
     * 获取父节点下所有的子节点
     * @param nodes
     * @param pnode
     * @return
     */

    public List<Node> getChildNodes(Node pnode) {
        List<Node>childNodes = new ArrayList<Node>();
        for (Node n : nodes){
            if (pnode.getId().equals(n.getPid())) {
                childNodes.add(n);
            }
        }
        return childNodes;
    }
}