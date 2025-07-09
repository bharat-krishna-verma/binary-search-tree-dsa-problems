public class floorinbst {
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
        int floor=-1;
        while(root!=null){
            if(root.data==key){
                return key;
            }
            if(key>root.data){
                floor= root.data;
                root= root.right;
            }
            else{
                root=root.left;
            }
        }
        return floor;
    }
}
