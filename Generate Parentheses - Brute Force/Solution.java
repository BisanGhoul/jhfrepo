import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		int n=2;
		List<String> list = generateParenthesis(n);
		for(int i=0;i<list.size();i++){
			System.out.println(i+" "+list.get(i));
		}
	}
	public static List<String> generateParenthesis(int n) {
		String str = "";
		List<String> list = new ArrayList<String>();
		recurse(str, list, n);
		return list;
	}
	static void recurse( String str, List<String> list, int n) {
		if(str.length()==n*2)
		{	if(isValid(str)){
			list.add(str);}
			return;
		}
		recurse( str + "(", list, n);
		recurse(str + ")", list, n);
	}
	 public static boolean isValid(String str) {
	        Stack<Character> s = new Stack<Character>();
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch == '(' || (ch == '[')||(ch == '{'))
	                s.push(ch);
	            if (ch == ')')
	                if (s.isEmpty() || s.pop() != '(')
	                    return false;
	            if (ch == ']')
	                if (s.isEmpty() || s.pop() != '[')
	                    return false;
	            if (ch == '}')
	                if (s.isEmpty() || s.pop() != '{')
	                    return false;
	        }
	        return s.empty();
	    }

}