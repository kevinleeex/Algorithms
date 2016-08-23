package No4;

/**
 * Description: <br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-20 0:35. <br/>
 * Update Date Time: <br/>
 */
public interface DogCatQueue {
    void add(Pet pet);
    Pet poll();
    Dog pollDog();
    Cat pollCat();
    boolean isEmpty();
    boolean isDogEmpty();
    boolean isCatEmpty();
}
