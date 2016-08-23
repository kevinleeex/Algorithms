package No4;

/**
 * Description: <br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-20 0:57. <br/>
 * Update Date Time: <br/>
 */
public class Test4 {
    public static void main(String[] args) {
        DogCatQueue dogCatQueue = new DogCatQueueImpl();
        Pet dog = new Dog();
        Pet cat = new Cat();
        dogCatQueue.add(dog);
        dogCatQueue.add(cat);
        dogCatQueue.add(cat);
        dogCatQueue.add(dog);
        System.out.println(dogCatQueue.pollCat().getType());//cat
        System.out.println(dogCatQueue.poll().getType());//dog
        System.out.println(dogCatQueue.pollDog().getType());//dog
        System.out.println(dogCatQueue.poll().getType());//cat
    }
}
