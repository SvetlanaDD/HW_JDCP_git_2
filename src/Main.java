public class Main {
    public static void main (String [] args){
        long [] sales = {3, 5, 7, 1, 8, 2, 1};
        SalesManager example = new SalesManager(sales);
        System.out.println("Максимальные продажи - " + example.max());
        System.out.println("Обрезанное среднее продаж - " + example.cutAverage());
    }
}