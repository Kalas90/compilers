/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.13 */
package lang.ast;

import java.io.PrintStream;
/**
 * @ast node
 * @declaredat /Users/Klas/School/edan65/assignment3/A3-MinTree/src/jastadd/Lang.ast:5
 * @production Leaf : {@link Node} ::= <span class="component">&lt;Number:int&gt;</span>;

 */
public class Leaf extends Node implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /Users/Klas/School/edan65/assignment3/A3-MinTree/src/jastadd/PrettyPrint.jadd:27
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind);
		out.print("Leaf " + getNumber());
		if(isMinValue()) out.println("  *** MINIMUM ***");
	}
  /**
   * @declaredat ASTNode:1
   */
  public Leaf() {
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
  }
  /**
   * @declaredat ASTNode:12
   */
  public Leaf(int p0) {
    setNumber(p0);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:18
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:24
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:30
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:36
   */
  public Leaf clone() throws CloneNotSupportedException {
    Leaf node = (Leaf) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:43
   */
  public Leaf copy() {
    try {
      Leaf node = (Leaf) clone();
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
   * @declaredat ASTNode:62
   */
  @Deprecated
  public Leaf fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:72
   */
  public Leaf treeCopyNoTransform() {
    Leaf tree = (Leaf) copy();
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
   * @declaredat ASTNode:92
   */
  public Leaf treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:99
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenint_Number == ((Leaf)node).tokenint_Number);    
  }
  /**
   * Replaces the lexeme Number.
   * @param value The new value for the lexeme Number.
   * @apilevel high-level
   */
  public void setNumber(int value) {
    tokenint_Number = value;
  }
  /**
   * @apilevel internal
   */
  protected int tokenint_Number;
  /**
   * Retrieves the value for the lexeme Number.
   * @return The value for the lexeme Number.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Number")
  public int getNumber() {
    return tokenint_Number;
  }
  /**
   * @apilevel internal
   */
  protected boolean localMin_visited = false;
  @ASTNodeAnnotation.Attribute
  public int localMin() {
    if (localMin_visited) {
      throw new RuntimeException("Circular definition of attr: localMin in class: org.jastadd.ast.AST.SynDecl");
    }
    localMin_visited = true;
    int localMin_value = getNumber();

    localMin_visited = false;
    return localMin_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean isMinValue_visited = false;
  @ASTNodeAnnotation.Attribute
  public boolean isMinValue() {
    if (isMinValue_visited) {
      throw new RuntimeException("Circular definition of attr: isMinValue in class: org.jastadd.ast.AST.SynDecl");
    }
    isMinValue_visited = true;
    boolean isMinValue_value = getNumber() == globalMin();

    isMinValue_visited = false;
    return isMinValue_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean nbrOfMinValues_visited = false;
  @ASTNodeAnnotation.Attribute
  public int nbrOfMinValues() {
    if (nbrOfMinValues_visited) {
      throw new RuntimeException("Circular definition of attr: nbrOfMinValues in class: org.jastadd.ast.AST.SynDecl");
    }
    nbrOfMinValues_visited = true;
    int nbrOfMinValues_value = isMinValue() ? 1:0;

    nbrOfMinValues_visited = false;
    return nbrOfMinValues_value;
  }
}
