package No4;

import java.util.LinkedList;

/**
 * Description: <br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-20 0:14. <br/>
 * Update Date Time: <br/>
 */
public class DogCatQueueImpl implements DogCatQueue {
    private LinkedList<PetNode> dogQueue;
    private LinkedList<PetNode> catQueue;
    private int order;

    public DogCatQueueImpl() {
        this.dogQueue = new LinkedList<>();
        this.catQueue = new LinkedList<>();
        this.order = 0;
    }

    @Override
    public void add(Pet pet) {
        if (pet.getType().equals("dog")) {
            dogQueue.add(new PetNode(pet, order++));
        } else if (pet.getType().equals("cat")) {
            catQueue.add(new PetNode(pet, order++));
        } else {
            throw new RuntimeException("Error! Caused by: The pet is not a dog or cat!!");
        }
//        return this;
    }

    @Override
    public Pet poll() {
        if (!dogQueue.isEmpty() && !catQueue.isEmpty()) {
            if (dogQueue.peek().getOrder() < catQueue.peek().getOrder()) {
                return dogQueue.poll().getPet();
            } else {
                return catQueue.poll().getPet();
            }
        } else if (!dogQueue.isEmpty()) {
            return dogQueue.poll().getPet();
        } else if (!catQueue.isEmpty()) {
            return catQueue.poll().getPet();
        } else {
            throw new RuntimeException("Error! Both queues are empty!");
        }
    }

    @Override
    public Dog pollDog() {
        if (!dogQueue.isEmpty()) {
            return (Dog) dogQueue.poll().getPet();
        } else {
            throw new RuntimeException("Error! DogQueue is empty!");
        }
    }

    @Override
    public Cat pollCat() {
        if (!catQueue.isEmpty()) {
            return (Cat) catQueue.poll().getPet();
        } else {
            throw new RuntimeException("Error! CatQueue is empty!");
        }
    }

    @Override
    public boolean isEmpty() {
        return dogQueue.isEmpty() && catQueue.isEmpty();
    }

    @Override
    public boolean isDogEmpty() {
        return dogQueue.isEmpty();
    }

    @Override
    public boolean isCatEmpty() {
        return catQueue.isEmpty();
    }
}
