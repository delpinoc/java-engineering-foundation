
public class HealthStation {

    private int weighing;
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        if (person != null) {
            this.weighing++;
            return person.getWeight();
        }
        return -1;
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return this.weighing;
    }

}
