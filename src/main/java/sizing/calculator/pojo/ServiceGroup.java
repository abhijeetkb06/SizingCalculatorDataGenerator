package sizing.calculator.pojo;

import java.util.ArrayList;
import java.util.List;

public class ServiceGroup {
    private String id;
    private List<String> services = new ArrayList<String>();
    private Hardware hardware;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public Hardware getHardware() {
        return hardware;
    }

    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }
}