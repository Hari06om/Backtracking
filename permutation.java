public class permutation{

    public static void  findpermutation(String str , String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String NewStr = str.substring(0, i) + str.substring(i + 1);
            findpermutation(NewStr, ans + ch);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        findpermutation(str, "");
    }
}