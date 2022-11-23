package sizing.calculator.pojo;

import java.util.ArrayList;
import java.util.List;

public class Root {
    private String id;
    private String name;
    private String account;
    private String application;
    private String username;
    private String date;
    private String sizing_version;
    private List<Cluster> clusters = new ArrayList<Cluster>();

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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSizing_version() {
        return sizing_version;
    }

    public void setSizing_version(String sizing_version) {
        this.sizing_version = sizing_version;
    }

    public List<Cluster> getClusters() {
        return clusters;
    }

    public void setClusters(List<Cluster> clusters) {
        this.clusters = clusters;
    }
}