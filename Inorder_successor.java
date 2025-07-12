public class Inorder_successor {
    static class node{
        int data;
        node left;
        node right;
        public node(int val){
            this.data= val;
            this.left= this.right= null;
        }    
    }
    public static int sol(node root,node x){
        node succossor= null;
        while(root!=null){
            if(x.data>=root.data){
                root= root.right;
            }
            else{
                succossor= root;
                root= root.left;
            }
        }
        return (succossor!=null) ? succossor.data:-1;
    }
    
}
