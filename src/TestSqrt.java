import java.math.BigDecimal;

public class TestSqrt {
    public static void main(String[] args) {
        int num = 111111;
        long a = System.currentTimeMillis();
        System.out.println(sqrtMathod(num) + "=====a");
        System.err.println(System.currentTimeMillis() - a + "=====a");

        long b = System.currentTimeMillis();
        System.out.println(Math.sqrt(4) + "=====b");
        System.err.println(System.currentTimeMillis() - b + "=====b");

        long c = System.currentTimeMillis();
        System.out.println(sqrt(4, 1e-12) + "=====c");
        System.err.println(System.currentTimeMillis() - c + "=====c");
    }


    public static double sqrtMathod(int num) {
        double sqrtNum = -1;
        boolean isFindSqrt = false;


// get int sqrt num
        double tempSqrt = 0;
        if (num > 0) {
            if (num == 1) {
                return 1;
            } else {
                for (int j = 0; j <= num / 2 + 1; j++) {
                    if (j * j == num) {
                        sqrtNum = j;
                        isFindSqrt = true;
                        break;
                    }
                    if (j * j > num) {
                        tempSqrt = j - 1;
                        break;
                    }
                }
            }
        }


        if (!isFindSqrt) {
            sqrtNum = recuFindSqrt(num, tempSqrt, isFindSqrt, 1);
        }


        return sqrtNum;
    }


    private static double recuFindSqrt(int num, double sqrtValue, boolean isFindSqrt, double ac) {
        ac = ac * 10;
        double tempSqrt = 0;
        for (int i = 0; i < 10; i++) {
            tempSqrt = sqrtValue + i / ac;
            if (tempSqrt * tempSqrt == num) {
                isFindSqrt = true;
                sqrtValue = tempSqrt;
            } else if (tempSqrt * tempSqrt > num) {
                tempSqrt = add(sqrtValue, (i - 1) / ac);
                sqrtValue = tempSqrt;
                break;
            }
        }


        Double temp = new Double(tempSqrt);
        if (temp.toString().length() <= 16 && !isFindSqrt) {
            sqrtValue = recuFindSqrt(num, tempSqrt, isFindSqrt, ac);
        }


        return sqrtValue;
    }


    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    public static double sqrt(double t, Double precise) {
        double low = 0, high = t, middle, squre,
                prec = precise != null ? precise : 1e-7;
        if (t < 0) {
            throw new RuntimeException("Negetive number cannot have a sqrt root.");
        }

        while (high - low > prec) {
            middle = (low + high) / 2;
            squre = middle * middle;

            if (squre > t) {
                high = middle;
            } else {
                low = middle;
            }
        }
        return (low + high) / 2;
    }
}