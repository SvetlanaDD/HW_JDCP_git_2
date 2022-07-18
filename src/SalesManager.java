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

    public int min() {
        int min = this.max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int cutAverage (){
        int average = 0;
        int count = 0;
        for (int sale : sales) {
            if (sale != this.min() && sale != this.max()) {
                average += sale;
                ++count;
            }
        }
        average = average/count;
        return average;
    }
}
