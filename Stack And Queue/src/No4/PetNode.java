package No4;

/**
 * Description: A node to store the pet info.<br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-20 0:28. <br/>
 * Update Date Time: <br/>
 */
public class PetNode {
    private Pet pet;
    private int order;

    public PetNode(Pet pet, int order) {
        this.pet = pet;
        this.order = order;
    }

    public Pet getPet() {
        return pet;
    }

    public int getOrder() {
        return order;
    }
}
