public class SearchInString {
    public static void main(String[] args) {
        String name = "deepak";
        char target = 'h';
        boolean ans = search(name, target);
        System.out.println(ans);
    }
    static boolean search(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (int index = 0; index < name.length(); index++) {
            if (target == name.charAt(index)) {
                return true;
            }
        }
        return false;
    }
}
