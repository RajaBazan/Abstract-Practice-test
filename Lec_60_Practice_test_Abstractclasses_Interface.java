package hello.com;
abstract class Pen{
 abstract void Write();
 abstract void Refill();
}
class FountainPen extends Pen{
    @Override
    void Write() {
        System.out.println("Writing with Pen");
    }

    @Override
    void Refill() {
        System.out.println("Refill the pen ink");
    }
//      Problem# 2:
    void ChangeNib(){
        System.out.println("Here we are changing the nib of pen");
    }
}
//     Problem #3
   class Monkey{
     void Jump(){
         System.out.println("Jumping...");
     }
     void Bite(){
         System.out.println("Biting...");
     }
}
interface BasicAnimal{
    void Eat();
    void Sleep();
}
class Human extends Monkey implements BasicAnimal{
    void Speak(){
        System.out.println("Hello sir!");
    }

    @Override
    public void Eat() {
        System.out.println("Here Animal eating...");
    }

    @Override
    public void Sleep() {
        System.out.println("Here animals sleeping...");
    }
}

public class Lec_60_Practice_test_Abstractclasses_Interface {
    public static void main(String[] args) {
//        Problem#1, 2:
        FountainPen pen = new FountainPen();
//        Problem#1  Object call
        System.out.println("Here the Answer of Proble#1: ");
        pen.Refill();
        pen.Write();
        //        Problem#2  Object call
        System.out.println("Here the Answer of Proble#2: ");
        pen.ChangeNib();
//        Problem#3:
        Human ha = new Human();
        System.out.println("Here the Answer of Proble#3: ");
        ha.Eat();
        ha.Sleep();
        ha.Bite();
        ha.Jump();
        ha.Speak();
//        Proble#5:
        System.out.println("Here the Answer of Proble#5: ");
        Monkey m1 = new Human();
        m1.Bite();
        m1.Jump();
        BasicAnimal ba = new Human();
        ba.Eat();
        ba.Sleep();


    }
}
