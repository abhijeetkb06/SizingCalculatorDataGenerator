package sizing.calculator.pojo;

import java.util.ArrayList;
import java.util.List;

public class Cluster {
    private String id;
    private String name;
    private String couchbase_version;
    private Services services;

    private String capella_credits;
    private String capella_plan;
    private String cloud_provider;
    private String cloud_region;
    private String cloud_service;
    private String infrastructure;
    private String operating_system;
    private String type;

    public String getCapella_credits() {
        return capella_credits;
    }

    public void setCapella_credits(String capella_credits) {
        this.capella_credits = capella_credits;
    }

    public String getCapella_plan() {
        return capella_plan;
    }

    public void setCapella_plan(String capella_plan) {
        this.capella_plan = capella_plan;
    }

    public String getCloud_provider() {
        return cloud_provider;
    }

    public void setCloud_provider(String cloud_provider) {
        this.cloud_provider = cloud_provider;
    }

    public String getCloud_region() {
        return cloud_region;
    }

    public void setCloud_region(String cloud_region) {
        this.cloud_region = cloud_region;
    }

    public String getCloud_service() {
        return cloud_service;
    }

    public void setCloud_service(String cloud_service) {
        this.cloud_service = cloud_service;
    }

    public String getInfrastructure() {
        return infrastructure;
    }

    public void setInfrastructure(String infrastructure) {
        this.infrastructure = infrastructure;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public void setOperating_system(String operating_system) {
        this.operating_system = operating_system;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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
