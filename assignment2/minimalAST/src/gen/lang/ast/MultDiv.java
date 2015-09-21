/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.12 */
package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * @ast node
 * @declaredat /Users/JohanMac/programmering/compilers/assignment2/minimalAST/src/jastadd/lang.ast:14
 * @production MultDiv : {@link Term} ::= <span class="component">{@link Term}</span> <span class="component">{@link Factor}</span>;

 */
public class MultDiv extends Term implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public MultDiv() {
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
  }
  /**
   * @declaredat ASTNode:13
   */
  public MultDiv(Term p0, Factor p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:20
   */
  protected int numChildren() {
    return 2;
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
  public MultDiv clone() throws CloneNotSupportedException {
    MultDiv node = (MultDiv) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:45
   */
  public MultDiv copy() {
    try {
      MultDiv node = (MultDiv) clone();
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
  public MultDiv fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public MultDiv treeCopyNoTransform() {
    MultDiv tree = (MultDiv) copy();
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
  public MultDiv treeCopy() {
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
   * Replaces the Term child.
   * @param node The new node to replace the Term child.
   * @apilevel high-level
   */
  public void setTerm(Term node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Term child.
   * @return The current node used as the Term child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Term")
  public Term getTerm() {
    return (Term) getChild(0);
  }
  /**
   * Retrieves the Term child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Term child.
   * @apilevel low-level
   */
  public Term getTermNoTransform() {
    return (Term) getChildNoTransform(0);
  }
  /**
   * Replaces the Factor child.
   * @param node The new node to replace the Factor child.
   * @apilevel high-level
   */
  public void setFactor(Factor node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Factor child.
   * @return The current node used as the Factor child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Factor")
  public Factor getFactor() {
    return (Factor) getChild(1);
  }
  /**
   * Retrieves the Factor child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Factor child.
   * @apilevel low-level
   */
  public Factor getFactorNoTransform() {
    return (Factor) getChildNoTransform(1);
  }
}
