public  class BinarySearchTree
{
TreeNode root;
public BinarySearchTree()
{
root=null;
}
public TreeNode insert(TreeNode root,int data)
{
if(root==null)
{
root=new TreeNode(data);
return root;
}
if(data<root.data)
root.left=insert(root.left,data);
else
if(data>root.data)
root.right=insert(root.right,data);
return root;
}
public void inorder(TreeNode root)
{
if(root !=null)
{
inorder(root.left);
System.out.print(root.data +" ");
inorder(root.right);
}
}
public void postorder(TreeNode root)
{
if(root !=null)
{
postorder(root.left);
postorder(root.right);
System.out.print(root.data + " ");
}
}
public void preorder(TreeNode root)
{
if(root !=null)
{
System.out.println(root.data +" ");
preorder(root.left);
preorder(root.right);
}
}
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
System.out.println("\nPostorder Traversal: ");
tree.postorder(tree.root);
}
}


