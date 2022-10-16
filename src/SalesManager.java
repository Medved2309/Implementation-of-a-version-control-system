public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = max();
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long stat() {
        long stat = 0;
        long i = 0;
        long n = 0;
        long x = 0;
        for (long sale : sales) {
            if (min() == sale && n == 0) {
                n++;
            } else if (max() == sale && x == 0) {
                x++;
            } else {
                stat += sale;
                i++;
            }
        }
        return (stat / i);
    }
}






