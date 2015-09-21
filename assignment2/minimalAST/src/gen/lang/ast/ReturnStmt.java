/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.12 */
package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * @ast node
 * @declaredat /Users/Klas/School/edan65/assignment2/minimalAST/src/jastadd/lang.ast:25
 * @production ReturnStmt : {@link Stmt} ::= <span class="component">{@link Term}*</span>;

 */
public class ReturnStmt extends Stmt implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public ReturnStmt() {
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
    children = new ASTNode[1];
    setChild(new List(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  public ReturnStmt(List<Term> p0) {
    setChild(p0, 0);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:20
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:26
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:32
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:38
   */
  public ReturnStmt clone() throws CloneNotSupportedException {
    ReturnStmt node = (ReturnStmt) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:45
   */
  public ReturnStmt copy() {
    try {
      ReturnStmt node = (ReturnStmt) clone();
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
   * @declaredat ASTNode:64
   */
  @Deprecated
  public ReturnStmt fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public ReturnStmt treeCopyNoTransform() {
    ReturnStmt tree = (ReturnStmt) copy();
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
   * @declaredat ASTNode:94
   */
  public ReturnStmt treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:101
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Term list.
   * @param list The new list node to be used as the Term list.
   * @apilevel high-level
   */
  public void setTermList(List<Term> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Term list.
   * @return Number of children in the Term list.
   * @apilevel high-level
   */
  public int getNumTerm() {
    return getTermList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Term list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Term list.
   * @apilevel low-level
   */
  public int getNumTermNoTransform() {
    return getTermListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Term list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Term list.
   * @apilevel high-level
   */
  public Term getTerm(int i) {
    return (Term) getTermList().getChild(i);
  }
  /**
   * Check whether the Term list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasTerm() {
    return getTermList().getNumChild() != 0;
  }
  /**
   * Append an element to the Term list.
   * @param node The element to append to the Term list.
   * @apilevel high-level
   */
  public void addTerm(Term node) {
    List<Term> list = (parent == null) ? getTermListNoTransform() : getTermList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addTermNoTransform(Term node) {
    List<Term> list = getTermListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Term list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setTerm(Term node, int i) {
    List<Term> list = getTermList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Term list.
   * @return The node representing the Term list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Term")
  public List<Term> getTermList() {
    List<Term> list = (List<Term>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Term list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Term list.
   * @apilevel low-level
   */
  public List<Term> getTermListNoTransform() {
    return (List<Term>) getChildNoTransform(0);
  }
  /**
   * Retrieves the Term list.
   * @return The node representing the Term list.
   * @apilevel high-level
   */
  public List<Term> getTerms() {
    return getTermList();
  }
  /**
   * Retrieves the Term list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Term list.
   * @apilevel low-level
   */
  public List<Term> getTermsNoTransform() {
    return getTermListNoTransform();
  }
}
