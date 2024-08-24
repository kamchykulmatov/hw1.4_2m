//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] commands = {"Sit", "Run"};
        Shelter shelter = new Shelter("Peace", "Lenina 1");

        final Dog dog = new Dog("Rex", "Pitbul", commands, shelter,
                ColorEnum.BROWN);

        Dog dog2 = new Dog("Layka", "Senbernar", shelter, ColorEnum.GREY);


        System.out.println(dog);
        dog.makeVoice();
        dog.makeVoice("Гив гив");
        dog.makeVoice("Гув гув");
        System.out.println("----------------");
        System.out.println(dog2);
    }
}