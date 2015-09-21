/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.12 */
package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * @ast node
 * @declaredat /Users/JohanMac/programmering/compilers/assignment2/minimalAST/src/jastadd/lang.ast:7
 * @production Comparison : {@link Expr} ::= <span class="component">Left:{@link Term}*</span> <span class="component">Right:{@link Term}*</span>;

 */
public class Comparison extends Expr implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Comparison() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
    children = new ASTNode[2];
    setChild(new List(), 0);
    setChild(new List(), 1);
  }
  /**
   * @declaredat ASTNode:15
   */
  public Comparison(List<Term> p0, List<Term> p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:28
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:34
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:40
   */
  public Comparison clone() throws CloneNotSupportedException {
    Comparison node = (Comparison) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:47
   */
  public Comparison copy() {
    try {
      Comparison node = (Comparison) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:66
   */
  @Deprecated
  public Comparison fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:76
   */
  public Comparison treeCopyNoTransform() {
    Comparison tree = (Comparison) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:96
   */
  public Comparison treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:103
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Left list.
   * @param list The new list node to be used as the Left list.
   * @apilevel high-level
   */
  public void setLeftList(List<Term> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Left list.
   * @return Number of children in the Left list.
   * @apilevel high-level
   */
  public int getNumLeft() {
    return getLeftList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Left list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Left list.
   * @apilevel low-level
   */
  public int getNumLeftNoTransform() {
    return getLeftListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Left list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Left list.
   * @apilevel high-level
   */
  public Term getLeft(int i) {
    return (Term) getLeftList().getChild(i);
  }
  /**
   * Check whether the Left list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasLeft() {
    return getLeftList().getNumChild() != 0;
  }
  /**
   * Append an element to the Left list.
   * @param node The element to append to the Left list.
   * @apilevel high-level
   */
  public void addLeft(Term node) {
    List<Term> list = (parent == null) ? getLeftListNoTransform() : getLeftList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addLeftNoTransform(Term node) {
    List<Term> list = getLeftListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Left list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setLeft(Term node, int i) {
    List<Term> list = getLeftList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Left list.
   * @return The node representing the Left list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Left")
  public List<Term> getLeftList() {
    List<Term> list = (List<Term>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Left list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Left list.
   * @apilevel low-level
   */
  public List<Term> getLeftListNoTransform() {
    return (List<Term>) getChildNoTransform(0);
  }
  /**
   * Retrieves the Left list.
   * @return The node representing the Left list.
   * @apilevel high-level
   */
  public List<Term> getLefts() {
    return getLeftList();
  }
  /**
   * Retrieves the Left list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Left list.
   * @apilevel low-level
   */
  public List<Term> getLeftsNoTransform() {
    return getLeftListNoTransform();
  }
  /**
   * Replaces the Right list.
   * @param list The new list node to be used as the Right list.
   * @apilevel high-level
   */
  public void setRightList(List<Term> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the Right list.
   * @return Number of children in the Right list.
   * @apilevel high-level
   */
  public int getNumRight() {
    return getRightList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Right list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Right list.
   * @apilevel low-level
   */
  public int getNumRightNoTransform() {
    return getRightListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Right list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Right list.
   * @apilevel high-level
   */
  public Term getRight(int i) {
    return (Term) getRightList().getChild(i);
  }
  /**
   * Check whether the Right list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasRight() {
    return getRightList().getNumChild() != 0;
  }
  /**
   * Append an element to the Right list.
   * @param node The element to append to the Right list.
   * @apilevel high-level
   */
  public void addRight(Term node) {
    List<Term> list = (parent == null) ? getRightListNoTransform() : getRightList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addRightNoTransform(Term node) {
    List<Term> list = getRightListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Right list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setRight(Term node, int i) {
    List<Term> list = getRightList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Right list.
   * @return The node representing the Right list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Right")
  public List<Term> getRightList() {
    List<Term> list = (List<Term>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Right list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Right list.
   * @apilevel low-level
   */
  public List<Term> getRightListNoTransform() {
    return (List<Term>) getChildNoTransform(1);
  }
  /**
   * Retrieves the Right list.
   * @return The node representing the Right list.
   * @apilevel high-level
   */
  public List<Term> getRights() {
    return getRightList();
  }
  /**
   * Retrieves the Right list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Right list.
   * @apilevel low-level
   */
  public List<Term> getRightsNoTransform() {
    return getRightListNoTransform();
  }
}
