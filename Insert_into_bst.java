public class Insert_into_bst {
    static class node{
        int data;
        node left;
        node right;
        public node(int val){
            this.data= val;
            this.left= this.right= null;
        }    
    }
    public static node insert(node root,int n){
        if(root==null) return new node(n);
        node curr= root;
        while(true){
            if(curr.data<n){
                if(curr.right!=null) curr= curr.right;
                else{
                    curr.right= new node(n);
                    break;
                }
            }
            else{
                if(curr.left!=null) curr= curr.left;
                else{
                    curr.left= new node(n);
                    break;
                }
            }
        }
        return root;
    }
}
