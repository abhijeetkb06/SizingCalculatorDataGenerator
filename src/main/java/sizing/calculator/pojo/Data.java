package sizing.calculator.pojo;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Bucket> buckets = new ArrayList<Bucket>();
    private Config config;

    public List<Bucket> getBuckets() {
        return buckets;
    }

    public void setBuckets(List<Bucket> buckets) {
        this.buckets = buckets;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }
}