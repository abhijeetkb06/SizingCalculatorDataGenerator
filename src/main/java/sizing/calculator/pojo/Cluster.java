package sizing.calculator.pojo;

import java.util.ArrayList;
import java.util.List;

public class Cluster {
    private String id;
    private String name;
    private String couchbase_version;
    private Services services;
    private List<ServiceGroup> service_groups = new ArrayList<ServiceGroup>();

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

    public String getCouchbase_version() {
        return couchbase_version;
    }

    public void setCouchbase_version(String couchbase_version) {
        this.couchbase_version = couchbase_version;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public List<ServiceGroup> getService_groups() {
        return service_groups;
    }

    public void setService_groups(List<ServiceGroup> service_groups) {
        this.service_groups = service_groups;
    }
}
