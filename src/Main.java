public class Main {
    public static void main(String[] args) {

        int[] Sales = {1, 2, 4, 100, 10, 20, 30};
        SalesManager salesManager = new SalesManager(Sales);
        System.out.println(salesManager.max()); // Максимум
        System.out.println(salesManager.min()); // Минимальное
        System.out.println(salesManager.stat()); // стат



    }
}




