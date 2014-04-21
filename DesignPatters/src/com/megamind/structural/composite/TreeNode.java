package com.megamind.structural.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 10:51
 * Good Life One Day
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<TreeNode>();

    public TreeNode(String t) {
        this.setName(t);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void setChildren(Vector<TreeNode> children) {
        this.children = children;
    }

    public void add(TreeNode treeNode) {
        children.add(treeNode);
    }

    public void remove(TreeNode treeNode) {
        children.remove(treeNode);
    }

    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }
}
