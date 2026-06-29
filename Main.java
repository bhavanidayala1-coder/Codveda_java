public class Main
{
public static void main(String[] args)
{
BinarySearchTree tree=new BinarySearchTree();
tree.root=tree.insert(tree.root, 50);
tree.root=tree.insert(tree.root, 30);
tree.root=tree.insert(tree.root, 70);
tree.root=tree.insert(tree.root, 20);
tree.root=tree.insert(tree.root, 40);
tree.root=tree.insert(tree.root, 60);
tree.root=tree.insert(tree.root, 80);
System.out.println("Inorder Traversal:");
tree.inorder(tree.root);
System.out.println("\nPreorder Traversal:");
tree.preorder(tree.root);
System.out.println("\nPostorder Traversal:");
tree.postorder(tree.root);
}
}




