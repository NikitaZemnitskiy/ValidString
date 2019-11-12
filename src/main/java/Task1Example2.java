public class Task1Example2 {
    public static boolean validString(String str) {
        String last = str;
        while (str.length() != 0){
            str = str.replace("()","");
            str = str.replace("{}","");
            str = str.replace("[]","");
            if (str == last){
                return false;
            }
            last = str;
        }
        return true;
    }
}
