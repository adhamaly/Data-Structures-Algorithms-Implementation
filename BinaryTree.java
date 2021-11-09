import java.util.Currency;
import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {

    class TreeNode{

        int value;

        TreeNode leftChild ;
        TreeNode rightChild ;

        public TreeNode(int v){
            this.value = v;
            leftChild = rightChild = null;

        }

        public boolean isLeaf(){
            return leftChild == null && rightChild == null;
        }
    }

    // Binary Tree Object Methods and Attributes...

    private TreeNode root = null;

   
    BinaryTree()
    {
    }
    //
    public TreeNode getTreeRoot(){
        return root;
    }

    public TreeNode Traverse(TreeNode curTreeNode,int v){

        if(curTreeNode == null){
            // create new node and it's return once when pointer points to next(left or child) of leaf 
            // or create node if root is equal to null 
            return new TreeNode(v);

        }
        if(v < curTreeNode.value){
            // currentNode.left will point to new inserted Node in left
            curTreeNode.leftChild = Traverse(curTreeNode.leftChild, v);
        }
        else if(v > curTreeNode.value){
             // currentNode.right will point to new inserted Node in left
            curTreeNode.rightChild = Traverse(curTreeNode.rightChild, v);
        }
        else{
            // value is already exist
            return curTreeNode;

        }
        return curTreeNode;


        


    }

    public void insert(int v){
        root = Traverse(root, v);
    }

    public void PreOrderTraversePrint(TreeNode curTreeNode){

        if(curTreeNode != null){
            System.out.print(curTreeNode.value+" ");
            PreOrderTraversePrint(curTreeNode.leftChild);
            PreOrderTraversePrint(curTreeNode.rightChild);
        }


    }
    public void InOrderTraversePrint(TreeNode curTreeNode){

        if(curTreeNode != null){
            
            InOrderTraversePrint(curTreeNode.leftChild);
            System.out.print(curTreeNode.value+" ");
            InOrderTraversePrint(curTreeNode.rightChild);
        }


    }
    public void PostOrderTraversePrint(TreeNode curTreeNode){

        if(curTreeNode != null){
            
            PostOrderTraversePrint(curTreeNode.leftChild);
            PostOrderTraversePrint(curTreeNode.rightChild);
            System.out.print(curTreeNode.value+" ");

        }


    }
    public void levelOrderTraverse(){

        // check root 
        if(this.getTreeRoot() == null){
            return;
        }

        // create queue that hold the node of each subTree 
        // we start by root
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(this.getTreeRoot());

        while(! nodes.isEmpty()){
         
            TreeNode node = nodes.remove();
            System.out.print(node.value+" ");

            if(node.leftChild !=null){
                nodes.add(node.leftChild);
            }
            if(node.rightChild !=null){
                nodes.add(node.rightChild);
            }


        }


    }
    
    
}
