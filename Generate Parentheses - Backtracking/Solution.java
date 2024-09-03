import java.util.ArrayList;
import java.util.List;

class Solution {
	
	public static void main(String[] args) {
		int n=2;
		List<String> list = generateParenthesis(n);
		for(int i=0;i<n;i++){
			System.out.println(list.get(i));
		}
	}
    public static List<String> generateParenthesis(int n) {
        int open = 1, close = 0;
        String str = "(";
        List<String> list = new ArrayList<String>();
        recurse(open, close, str, list, n);
        return list;
    }

    static void recurse(int open, int close, String str, List<String> list, int n) {
        // if(str.length()==0){
        // str = str +"(";
        // }

        if(str.length()==n*2)
        {
                    list.add(str);
                    return;

        }
        if (open < n) {
            recurse(open+1, close, str + "(", list, n);
        }
        if (close < open) {
            recurse(open, close+1, str + ")", list, n);

        }

    }

}