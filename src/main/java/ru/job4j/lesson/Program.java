package ru.job4j.lesson;

public class Program {

    public static void fire(Object sender) {
        System.out.println("Пожар !!!");
    }

    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        // подписка на событие
        //sw.consumer = lamp; // ссылка на обьект Lamp в классе выключатель(узнает про обьект лампы)
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        String messages = "Пожар !!"; //захват переменных
        sw.addElectricityListener(new ElectricityConsumer() {
                                      public void electricityOn(Object sender) {
                                          System.out.println(messages);
                                      }
                                  }
        );

        // sw.addElectricityListener(sender -> System.out.println("Пожар") );
        // sw.addElectricityListener(s -> Program.fire(s));
        sw.addElectricityListener(Program::fire);
        sw.SwitcherOn();
    }
}
