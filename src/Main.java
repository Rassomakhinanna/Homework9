class Homework9 {
    public static void main(String[] args) {
        // Задание 1
        int year = 1918;
        int clientOs = 0;
        int distance = 95;
        Homework9 homework = new Homework9();
        homework.evenYearAndPrint(year);
        homework.checkPrintOS(clientOs,year);
        homework.calculateDeliveryDays(distance);
    }

    public void evenYearAndPrint(int year) {
        if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }
        // Задание 2
    public void checkPrintOS(int clientOs, int year) {
        if (clientOs == 0 && year < 2022) {
            System.out.println("Рекомендуется lite версия для IOS");
        } else if (clientOs == 0 && year == 2022) {
            System.out.println("Рекомендуется современная версия для IOS");
        } else if (clientOs == 1 && year < 2022) {
            System.out.println("Рекомендуется lite версия для Android");
        } else if (clientOs == 1 && year == 2022) {
            System.out.println("Рекомендуется соверменная версия для Android");
        } else {
            System.out.println("Приложение для вашего устройства не найдено");
        }
    }
        // Задание 3
    public int calculateDeliveryDays (int distance) {
            if (distance < 20 && distance > 0) {
                return 1;
            } else if (distance < 60 && distance >= 20) {
                return 2;
            } else if (distance < 100 && distance >= 60) {
                System.out.println("Доставка 3 дня");
                return 3;
            } else {
                throw new RuntimeException("Доставка не осуществляется");
            }
    }
}