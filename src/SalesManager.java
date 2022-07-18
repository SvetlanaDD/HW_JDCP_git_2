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
        long min = this.max();
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long cutAverage (){
        long average = 0;
        long count = 0;
        for (long sale : sales) {
            if (sale != this.min() && sale != this.max()) {
                average += sale;
                ++count;
            }
        }
        average = average/count;
        return average;
    }
}
