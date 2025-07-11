//LeetCode-98
public class validate_bst {
    class node{
        int data;
        node left,right;
        public node(int val){
            this.data= val;
            this.left=this.right=null;
        }
    }
    public boolean checker(node root,long minValue,long maxValue){
        if(root==null) return true;
        if(root.data>=maxValue||root.data<=minValue) return false;
        return checker(root.left, minValue,root.data)&&checker(root.right, root.data, maxValue);
    }
    public boolean isVaildBst(node root){
        return checker(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
