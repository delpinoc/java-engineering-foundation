
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        String printOutput = "The collection " + this.name;
        if (this.elements.isEmpty()) {
            printOutput += " is empty.";
            return printOutput;
        }
        
        if (this.elements.size() == 1) {
            printOutput += " has " + this.elements.size() + " element:";
        }
        
        if (this.elements.size() >= 2) {
            printOutput += " has " + this.elements.size() + " elements:";
        }
        
        String printElements = "";
        for (String element: this.elements) {
            printElements += "\n" + element;
        }
        
        printOutput += printElements;
            
        return printOutput;
    }
    
}
