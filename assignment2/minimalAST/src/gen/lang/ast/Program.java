/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.12 */
package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * @ast node
 * @declaredat /Users/JohanMac/programmering/compilers/assignment2/minimalAST/src/jastadd/lang.ast:1
 * @production Program : {@link ASTNode} ::= <span class="component">{@link ProgramComponent}*</span>;

 */
public class Program extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Program() {
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
  public Program(List<ProgramComponent> p0) {
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
  public Program clone() throws CloneNotSupportedException {
    Program node = (Program) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:45
   */
  public Program copy() {
    try {
      Program node = (Program) clone();
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
  public Program fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public Program treeCopyNoTransform() {
    Program tree = (Program) copy();
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
  public Program treeCopy() {
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
   * Replaces the ProgramComponent list.
   * @param list The new list node to be used as the ProgramComponent list.
   * @apilevel high-level
   */
  public void setProgramComponentList(List<ProgramComponent> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the ProgramComponent list.
   * @return Number of children in the ProgramComponent list.
   * @apilevel high-level
   */
  public int getNumProgramComponent() {
    return getProgramComponentList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ProgramComponent list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ProgramComponent list.
   * @apilevel low-level
   */
  public int getNumProgramComponentNoTransform() {
    return getProgramComponentListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ProgramComponent list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ProgramComponent list.
   * @apilevel high-level
   */
  public ProgramComponent getProgramComponent(int i) {
    return (ProgramComponent) getProgramComponentList().getChild(i);
  }
  /**
   * Check whether the ProgramComponent list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasProgramComponent() {
    return getProgramComponentList().getNumChild() != 0;
  }
  /**
   * Append an element to the ProgramComponent list.
   * @param node The element to append to the ProgramComponent list.
   * @apilevel high-level
   */
  public void addProgramComponent(ProgramComponent node) {
    List<ProgramComponent> list = (parent == null) ? getProgramComponentListNoTransform() : getProgramComponentList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addProgramComponentNoTransform(ProgramComponent node) {
    List<ProgramComponent> list = getProgramComponentListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ProgramComponent list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setProgramComponent(ProgramComponent node, int i) {
    List<ProgramComponent> list = getProgramComponentList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ProgramComponent list.
   * @return The node representing the ProgramComponent list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ProgramComponent")
  public List<ProgramComponent> getProgramComponentList() {
    List<ProgramComponent> list = (List<ProgramComponent>) getChild(0);
    return list;
  }
  /**
   * Retrieves the ProgramComponent list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ProgramComponent list.
   * @apilevel low-level
   */
  public List<ProgramComponent> getProgramComponentListNoTransform() {
    return (List<ProgramComponent>) getChildNoTransform(0);
  }
  /**
   * Retrieves the ProgramComponent list.
   * @return The node representing the ProgramComponent list.
   * @apilevel high-level
   */
  public List<ProgramComponent> getProgramComponents() {
    return getProgramComponentList();
  }
  /**
   * Retrieves the ProgramComponent list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ProgramComponent list.
   * @apilevel low-level
   */
  public List<ProgramComponent> getProgramComponentsNoTransform() {
    return getProgramComponentListNoTransform();
  }
}
