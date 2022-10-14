public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {
        int min = max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }


    public int stat() {
        int stat = 0;
        int i = 0;
        int n = 0;
        int x = 0;
        for (int sale : sales) {
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






