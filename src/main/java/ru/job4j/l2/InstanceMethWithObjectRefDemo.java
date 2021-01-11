package ru.job4j.l2;

public class InstanceMethWithObjectRefDemo {
    /**
     * Метод, возвращающий количество экземпляров объекта,
     * найденных по критериям, задаваемым параметром
     * функционального интерфейс MyFunc
     */
    static <Т, T> int counter(T[] vals, MyFunc<T> f, Т v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++)
            if (f.func(vals[i], (T) v))
                count++;
        return count;
    }


    public static void main(String args[]) {
        int count;
        //создать массив объектов типа HighTemp
        HighTemp[] weekDayHighs = {new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91),
                new HighTemp(84), new HighTemp(83)};
        //Использовать метод counter() вместе с массивами объектов
        // типа HighTemp. Обратите внимание на то , что ссЬ1Лка на метод
        // экземпляра sameTemp() передается в качестве второго параметра
        count = counter(weekDayHighs, HighTemp::sameTemp,
                new HighTemp(89));
        System.out.println(
                "Дней , когда максимальная температура бЬ1Ла 89: " + count);

        //А теперь создать и использовать вместе с данным
        // методом еще один массив объектов типа HighTemp
        HighTemp[]weekDayHighs2 = {new HighTemp(32), new HighTemp(12),
                new HighTemp(24), new HighTemp(19),
                new HighTemp(18), new HighTemp(12),
                new HighTemp(-1), new HighTemp(13)};
        count = counter(weekDayHighs2, HighTemp::sameTemp,
        new HighTemp(12));
        System.out.println(
                "Дней, когда максималь ная температура была 12 : " + count);

        // А теперь воспользоваться методом lessThanтemp( ) , чтобы
        // выяснить , сколькодней температура была меньше заданной
        count = counter ( weekDayHighs, HighTemp::lessThanтemp ,
                new HighTemp (89));
        System.out.println (
                "Дней , когда максимальная температура была меньше 89 : " + count );
        count = counter ( weekDayHighs2 , HighTemp::lessThanтemp ,
                new HighTemp(19));
        System.out.println ("Дней , когда максимальная температура была меньше 19: "+ count ) ;
    }
}
