public class Months {
    public static void main(String[] args) {
        String [] namesofMonths = {
                "Январь",
                "Февраль",
                "Март",
                "Апрель",//это массив
                "Май",
                "Июнь",
                "Июль",
                "Август",
                "Сентябрь",
                "Октябрь",
                "Ноябрь",
                "Декабрь"
        };
        String result = "";//где храним результат
        for (int i = 0; i < namesofMonths.length; i ++) { // цикл for
            result += namesofMonths[i];// к result прекрепляем новый месяц
            if (i == namesofMonths.length - 1) {  //пишем условия проверки злемента
                result += "."; // и в этом случае к переменной резал прибавим символ(.)
            } else { //есле
                result += ", "; // не последний элемент то прибавляем (, и пробел)
            }
        }
        System.out.println(result);

    }
}
