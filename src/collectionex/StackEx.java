package collectionex;

import java.util.Stack;

public class StackEx {
public static void main(String[] args) {
	Stack<Integer> st=new Stack<Integer>();
    st.push(10);
    st.push(30);
    st.push(90);
    System.out.println(st);
    st.pop();
    System.out.println(st);

}
}
