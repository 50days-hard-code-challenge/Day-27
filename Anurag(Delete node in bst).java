class Solution {
    public int minofright(TreeNode root)
    {
        int min=root.val;
        while(root.left!=null)
        {
            min=root.left.val;
            root=root.left;
        }
        return min;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
        {
            return root;
        }
        if(root.val>key)
        {
            //set left at the root.
         root.left=deleteNode( root.left,  key);
        }
        else if(root.val<key)
        {
            //set right at the root.
         root.right=deleteNode( root.right, key);
        }
        
        else
        {//if boht left and right not null.
            if(root.left!=null && root.right!=null)
            {
                root.val=minofright(root.right);
                root.right=deleteNode( root.right,root.val);
               
            }// only right side null
            else if(root.left!=null)
            {
                 return root.left;
            }
            //if left side null
            else if(root.right!=null)
            {
                return root.right;
            }
            else
            //if both left and right null
            {
                return null;
            }
        }
       
         return root;

        
    }
}
