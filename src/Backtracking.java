public class Backtracking {
    int n = 3;  // Length of binary strings
    StringBuilder curString = new StringBuilder();

    void genString(int pos) {
        if (pos > n) {
            System.out.println(curString.toString());
            return;
        }
        for (char i = '0'; i <= '1'; i++) {
            curString.append(i);
            genString(pos + 1);
            curString.deleteCharAt(curString.length() - 1);
        }
    }

    public static void main(String[] args) {
        Backtracking test = new Backtracking();
        test.genString(1);
    }
}
