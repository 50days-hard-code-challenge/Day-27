class Tree
{
    int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1+Math.max(leftHeight,rightHeight);
        
    }
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	// Your code here
	 if(root == null){
	     return true;
	 }
	 // find the height of left & right Subtree
	 int leftHeight = height(root.left);
	 int rightHeight = height(root.right);
	 
	 // check the conditon
	 if(Math.abs(leftHeight-rightHeight)>1){
	     return false;
	 }
	 
	 // left subtree & righSubtree should be balance 
	 boolean isLeftBalanced = isBalanced(root.left);
	 boolean isRightBalanced = isBalanced(root.right);
	 return (isLeftBalanced && isRightBalanced);
	 
    }
