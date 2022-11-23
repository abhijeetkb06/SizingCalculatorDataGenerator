package sizing.calculator.pojo;

import java.util.ArrayList;
import java.util.List;


public class Scope {
    private String id;
    private String name;
    private List<Collection> collections = new ArrayList<Collection>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Collection> getCollections() {
        return collections;
    }

    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }
}