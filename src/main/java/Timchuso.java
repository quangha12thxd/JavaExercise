public class Timchuso {

    public static int demcs(int a) {
        int count = 0;
        while (a > 0) {
            a /= 10;
            count++;
        }
        return count;
    }

    public static boolean valid(int n) {
        int sum = 0;
        int m = demcs(n);
        int b = n;
        while (b > 0) {
            int a = b % 10;
            sum += Math.pow(a, m);
            b /= 10;
        }
        return sum == n;
    }

    public String timcso() {
        StringBuffer kq = new StringBuffer();
        for (int i = 10; i <= 99999; i++) {
            if (valid(i)) {
                kq.append(i + " ");
            }
        }
        return kq.toString().trim();
    }
}
