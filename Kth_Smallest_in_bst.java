//LeetCode 230
import java.util.ArrayList;

public class Kth_Smallest_in_bst {
    class node{
        int data;
        node left,right;
        public node(int val){
            this.data= val;
            this.left=this.right=null;
        }
    }
    public void inorder(node root,int k,ArrayList<Integer> arr){
        if(root==null||arr.size()==k) return;
        if(arr.size()==k) return;
        inorder(root.left, k, arr);
        arr.add(root.data);
        if(arr.size()==k) return;
        inorder(root.right, k, arr);
    }
    public int sol(node root,int k){
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, k, arr);
        return arr.get(k-1);
    }
}
