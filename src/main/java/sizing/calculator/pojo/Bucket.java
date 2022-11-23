package sizing.calculator.pojo;

import java.util.ArrayList;
import java.util.List;

public class Bucket {
    private String id;
    private String name;
    private String description;
    private String bucket_type;
    private String storage_engine;
    private String eviction_policy;
    private String value_format;
    private Integer purge_frequency;
    private Integer number_replicas;
    private Double snappy_compression;
    private List<Scope> scopes = new ArrayList<Scope>();

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBucket_type() {
        return bucket_type;
    }

    public void setBucket_type(String bucket_type) {
        this.bucket_type = bucket_type;
    }

    public String getStorage_engine() {
        return storage_engine;
    }

    public void setStorage_engine(String storage_engine) {
        this.storage_engine = storage_engine;
    }

    public String getEviction_policy() {
        return eviction_policy;
    }

    public void setEviction_policy(String eviction_policy) {
        this.eviction_policy = eviction_policy;
    }

    public String getValue_format() {
        return value_format;
    }

    public void setValue_format(String value_format) {
        this.value_format = value_format;
    }

    public Integer getPurge_frequency() {
        return purge_frequency;
    }

    public void setPurge_frequency(Integer purge_frequency) {
        this.purge_frequency = purge_frequency;
    }

    public Integer getNumber_replicas() {
        return number_replicas;
    }

    public void setNumber_replicas(Integer number_replicas) {
        this.number_replicas = number_replicas;
    }

    public Double getSnappy_compression() {
        return snappy_compression;
    }

    public void setSnappy_compression(Double snappy_compression) {
        this.snappy_compression = snappy_compression;
    }

    public List<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(List<Scope> scopes) {
        this.scopes = scopes;
    }
}