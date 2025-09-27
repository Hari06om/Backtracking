public class subset {

    // Recursive function to print all subsets of the given string
    public static void findSubsets(String str, int index, String current) {
        if (index == str.length()) {
            if(current.length() == 0){
                System.out.println("Empty subset");
                return;
            }else{

                System.out.println(current);
            }
                return;
        }

        // Include the current character
        findSubsets(str, index + 1, current + str.charAt(index));
        // Exclude the current character
        findSubsets(str, index + 1, current);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, 0, "");
    }
}
