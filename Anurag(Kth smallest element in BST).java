class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack <TreeNode> st=new Stack<TreeNode>();
        TreeNode node=root;
        int count=1;
        int ans=0;
        while(count <= k)
        {
            if(node!=null)
            {
                st.push(node);
                node=node.left;
            }
            else           
             {
                node=st.pop();
                ans=node.val;
                count++;
                node=node.right;
             }
           
        }
        
       return ans;
    }
}
