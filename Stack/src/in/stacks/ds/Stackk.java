package in.stacks.ds;

import java.util.Stack;

public class Stackk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack<>();
		st.push("shiank");
		st.push("shiv");
		st.push("shiva");
		st.push("shivam");
		int arr[] = {1,2,3,4};
		System.out.println(st);
		String str =st.pop();
		System.out.println(str);
		System.out.println(st);
		
		System.out.println(st.peek());
		System.out.println(st.isEmpty());

	}

}
