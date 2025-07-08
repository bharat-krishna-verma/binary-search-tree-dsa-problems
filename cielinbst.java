public class cielinbst {
    static class node{
        int data;
        node left;
        node right;
        public node(int val){
            this.data= val;
            this.left= this.right= null;
        }    
    }
    public static int sol(node root,int key){
        int ciel =-1;
        while(root!=null){
            if(root.data ==key){
                return key;
            }
            if(key>root.data){
                root= root.right;
            }
            else{
                ciel = root.data;
                root= root.left;
            }
        }
    return ciel;
    }
}