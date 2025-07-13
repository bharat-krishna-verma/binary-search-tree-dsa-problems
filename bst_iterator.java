//LeetCode 173
import java.util.Stack;

public class bst_iterator {
    
    static class node{
        int data;
        node left;
        node right;
        public node(int val){
            this.data= val;
            this.left= this.right= null;
        }    
    }
    private Stack<node> st = new Stack<>();
    public bst_iterator(node root){
        pushAll(root);
    }
    public int next(){
        node temp = st.pop();
        pushAll(temp.right);
        return temp.data;
    }
    public boolean hasNext(){
        return !st.isEmpty();
    }
    public void pushAll(node root){
        while(root!=null){
            st.push(root);
            root= root.left;
        }
    }
}
