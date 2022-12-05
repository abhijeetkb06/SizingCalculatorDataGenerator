package lumberjack.output.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TimingsItem {

    @JsonProperty("bucket")
    private String bucket;

    @JsonProperty("stat")
    private String stat;

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("total")
    private String total;

    @JsonProperty("avg")
    private String avg;

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getAvg() {
        return avg;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }
}