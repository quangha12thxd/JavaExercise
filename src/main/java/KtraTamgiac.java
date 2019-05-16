public class KtraTamgiac {

    public String ktratgiac(double a, double b, double c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double x = (a + b + c) / 2;
            double s = Math.sqrt(x * (x - a) * (x - b) * (x - c));
            if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
                return String.format("Tam giac vuong. Dien tich: %.2f. Chu vi: %.2f", s, 2 * x);
            } else {
                if ((a == b) || (b == c) || (a == c)) {
                    return String.format("Tam giac can. Dien tich: %.2f. Chu vi: %.2f", s, 2 * x);
                } else {
                    return String.format("Tam giac thuong. Dien tich: %.2f. Chu vi: %.2f", s, 2 * x);
                }
            }
        } else {
            return "Tam giac khong ton tai!!!";
        }
    }
}
