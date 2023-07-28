public class PermutationOfString {
    public static void main(String[] args) {
        String str= "abc";
        findPermutation(str, "");

    }

    public static void findPermutation(String str, String ans) {
        //base case
        if(str.length()==0){
            System.out.println(ans);
        }

        //recursion
        //loop for finding current element
        for(int i=0;i<str.length();i++){
            char curr= str.charAt(i);
            //abcde=> we want to delete c then we do ab+de
            String newstr= str.substring(0, i)+str.substring(i+1);
            findPermutation(newstr, ans+curr);

        }

    }
}
