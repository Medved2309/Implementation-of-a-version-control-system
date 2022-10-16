public class Main {
    public static void main(String[] args) {

        long[] Sales = {1, 2, 4, 100, 10, 20, 30};
        SalesManager salesManager = new SalesManager(Sales);
        System.out.println(salesManager.max() + " Максимальные продажи"); // Максимум
        System.out.println(salesManager.min() + " Минимальные продажи"); // Минимальное



    }
}




