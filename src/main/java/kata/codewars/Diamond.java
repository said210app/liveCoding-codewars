package kata.codewars;



//https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java
public class Diamond {
    public static String print(int n) {
        if (n % 2 == 0 || n < 0) {
            return null;
        }
        StringBuilder diamond = new StringBuilder();
        int middle = n / 2;
        int pos = middle;
        int currentLine = 1;
        for (int i = 1; i <= middle; i++) {
            diamond.append(buildLine(pos,n,currentLine));
            currentLine = currentLine + 2;
            pos--;
        }
        diamond.append(buildLine(0,n,n)).append("\n");
        for (int i = middle; i >=1 ; i--) {
            currentLine = currentLine - 2;
            pos++;
            diamond.append(buildLine(pos,n,currentLine));
        }
        return diamond.toString();
    }

    private static String buildLine(int lineNumber, int length, int n) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i >= lineNumber && i < lineNumber + n) {
                line.append("*");
            } else if (i < lineNumber) {
                line.append(" ");
            } else {
                line.append("\n");
                break;
            }
        }
        return line.toString();
    }

        public static String examplePrint1(int n) {
            if (n < 0 || n % 2 == 0) return null;
            String shape = "";
            int midRow = n/2 + 1;
            for (int i = midRow; i <= n*2 - midRow; i++) {
                for (int j = 1; j <= n - Math.abs(n - i); j++) {
                    if (j <= Math.abs(n - i))
                        shape += " ";
                    else
                        shape += "*";
                }
                shape += "\n";
            }
            return shape;
        }

    public static String examplePrint2(int n) {
        if (n % 2  == 0 || n <= 0) {return null;}
        StringBuffer expected = new StringBuffer();
        for (int i = 1; i <= n; i+=2) {
            expected.append(" ".repeat((n - i) / 2) + "*".repeat(i) + "\n");
        }
        for (int i = n - 2; i >= 1; i-=2) {
            expected.append(" ".repeat((n - i) / 2) + "*".repeat(i) + "\n");
        }
        return expected.toString();
    }

}
