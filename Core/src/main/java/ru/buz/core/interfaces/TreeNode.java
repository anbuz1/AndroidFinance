package ru.buz.core.interfaces;

import java.util.List;

public interface TreeNode {

    String getName();

    long getId();

    boolean add(TreeNode child);

    boolean remove(long idChild);

    List<TreeNode> getChildren();

    TreeNode getChild(long idChild);

    TreeNode getParent();

    void setParent(TreeNode parent);
}
