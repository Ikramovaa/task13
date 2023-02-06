public class Main1 {
    public static void main(String[] args) {
        Parrot parrot=new Parrot("Parrot","Red",5);
        System.out.println(parrot.getName());

        Lion lion=new Lion("lion","Grey",10);
        System.out.println(lion.getName());

        Shark shark=new Shark("Shark","Blue",3);
        System.out.println(shark.getName());
    }
}
