public class StatService {
    // сумма всех продаж
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale; // cумма всех продаж
        }
        return sum;
    }

    // средняя величина продаж в месяц
    public long averageSales(long[] sales) {
        long sum = sumSales(sales); // вызывает метод суммы всех продаж
        return sumSales(sales) / sales.length;
    }

    // номер месяца, в котором был пик продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // номер месяца, с минимальными продажами
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // количество месяцев, в которых продажи были ниже среднего
    public int salesBelowAverage(long[] sales) {
        int count = 0;
        long avg = averageSales(sales);
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    // количество месяцев, в которых продажи были выше среднего
    public int salesAboveAverage(long[] sales) {
        int count = 0;
        long avg = averageSales(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }

}
