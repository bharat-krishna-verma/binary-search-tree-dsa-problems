//leetcode 700
public class searchinbst {
static class node{
        int data;
        node left;
        node right;
        public node(int val){
            this.data= val;
            this.left= this.right= null;
        }    
    }
    public static node solution(node root,int val){
        while(root!=null&&root.data!=val){
            root= val<root.data?root.left:root.right;
        }
        return root;
    } 
    
}