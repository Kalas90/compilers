/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.12 */
package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * @ast node
 * @declaredat /Users/Klas/School/edan65/assignment2/minimalAST/src/jastadd/lang.ast:4
 * @production FunctionDec : {@link ProgramComponent} ::= <span class="component">First:{@link IdDecl}</span> <span class="component">Rest:{@link IdDecl}*</span> <span class="component">{@link Stmt}</span>;

 */
public class FunctionDec extends ProgramComponent implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public FunctionDec() {
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
    children = new ASTNode[3];
    setChild(new List(), 1);
  }
  /**
   * @declaredat ASTNode:14
   */
  public FunctionDec(IdDecl p0, List<IdDecl> p1, Stmt p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 3;
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
  public FunctionDec clone() throws CloneNotSupportedException {
    FunctionDec node = (FunctionDec) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:47
   */
  public FunctionDec copy() {
    try {
      FunctionDec node = (FunctionDec) clone();
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
  public FunctionDec fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:76
   */
  public FunctionDec treeCopyNoTransform() {
    FunctionDec tree = (FunctionDec) copy();
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
  public FunctionDec treeCopy() {
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
   * Replaces the First child.
   * @param node The new node to replace the First child.
   * @apilevel high-level
   */
  public void setFirst(IdDecl node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the First child.
   * @return The current node used as the First child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="First")
  public IdDecl getFirst() {
    return (IdDecl) getChild(0);
  }
  /**
   * Retrieves the First child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the First child.
   * @apilevel low-level
   */
  public IdDecl getFirstNoTransform() {
    return (IdDecl) getChildNoTransform(0);
  }
  /**
   * Replaces the Rest list.
   * @param list The new list node to be used as the Rest list.
   * @apilevel high-level
   */
  public void setRestList(List<IdDecl> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the Rest list.
   * @return Number of children in the Rest list.
   * @apilevel high-level
   */
  public int getNumRest() {
    return getRestList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Rest list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Rest list.
   * @apilevel low-level
   */
  public int getNumRestNoTransform() {
    return getRestListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Rest list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Rest list.
   * @apilevel high-level
   */
  public IdDecl getRest(int i) {
    return (IdDecl) getRestList().getChild(i);
  }
  /**
   * Check whether the Rest list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasRest() {
    return getRestList().getNumChild() != 0;
  }
  /**
   * Append an element to the Rest list.
   * @param node The element to append to the Rest list.
   * @apilevel high-level
   */
  public void addRest(IdDecl node) {
    List<IdDecl> list = (parent == null) ? getRestListNoTransform() : getRestList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addRestNoTransform(IdDecl node) {
    List<IdDecl> list = getRestListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Rest list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setRest(IdDecl node, int i) {
    List<IdDecl> list = getRestList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Rest list.
   * @return The node representing the Rest list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Rest")
  public List<IdDecl> getRestList() {
    List<IdDecl> list = (List<IdDecl>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Rest list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Rest list.
   * @apilevel low-level
   */
  public List<IdDecl> getRestListNoTransform() {
    return (List<IdDecl>) getChildNoTransform(1);
  }
  /**
   * Retrieves the Rest list.
   * @return The node representing the Rest list.
   * @apilevel high-level
   */
  public List<IdDecl> getRests() {
    return getRestList();
  }
  /**
   * Retrieves the Rest list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Rest list.
   * @apilevel low-level
   */
  public List<IdDecl> getRestsNoTransform() {
    return getRestListNoTransform();
  }
  /**
   * Replaces the Stmt child.
   * @param node The new node to replace the Stmt child.
   * @apilevel high-level
   */
  public void setStmt(Stmt node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the Stmt child.
   * @return The current node used as the Stmt child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Stmt")
  public Stmt getStmt() {
    return (Stmt) getChild(2);
  }
  /**
   * Retrieves the Stmt child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Stmt child.
   * @apilevel low-level
   */
  public Stmt getStmtNoTransform() {
    return (Stmt) getChildNoTransform(2);
  }
}
