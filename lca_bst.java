//LeetCode-235
public class lca_bst {
    static class node{
        int data;
        node left;
        node right;
        public node(int val){
            this.data= val;
            this.left= this.right= null;
        }    
    }
    public node lca(node root,node p,node q){
        if(root==null) return null;
        int curr=root.data;
        if(curr>p.data&&curr>q.data) return lca(root.left, p, q);
        if(curr<p.data&&curr<q.data) return lca(root.right, p, q);
        return root;
    }
}
