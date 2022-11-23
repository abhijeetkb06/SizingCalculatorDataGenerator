package sizing.calculator.pojo;

public class Config {
    private Integer append_only_multiplier;
    private Double bin_size_jemalloc;
    private Double couchstore_compression_ratio;
    private Double hwm;
    private Integer minimum_number_of_cores_one_bucket;
    private Double network_reserved_capacity;
    private Double os_mem_reserved;
    private Integer rebalance_throughput;

    public Integer getAppend_only_multiplier() {
        return append_only_multiplier;
    }

    public void setAppend_only_multiplier(Integer append_only_multiplier) {
        this.append_only_multiplier = append_only_multiplier;
    }

    public Double getBin_size_jemalloc() {
        return bin_size_jemalloc;
    }

    public void setBin_size_jemalloc(Double bin_size_jemalloc) {
        this.bin_size_jemalloc = bin_size_jemalloc;
    }

    public Double getCouchstore_compression_ratio() {
        return couchstore_compression_ratio;
    }

    public void setCouchstore_compression_ratio(Double couchstore_compression_ratio) {
        this.couchstore_compression_ratio = couchstore_compression_ratio;
    }

    public Double getHwm() {
        return hwm;
    }

    public void setHwm(Double hwm) {
        this.hwm = hwm;
    }

    public Integer getMinimum_number_of_cores_one_bucket() {
        return minimum_number_of_cores_one_bucket;
    }

    public void setMinimum_number_of_cores_one_bucket(Integer minimum_number_of_cores_one_bucket) {
        this.minimum_number_of_cores_one_bucket = minimum_number_of_cores_one_bucket;
    }

    public Double getNetwork_reserved_capacity() {
        return network_reserved_capacity;
    }

    public void setNetwork_reserved_capacity(Double network_reserved_capacity) {
        this.network_reserved_capacity = network_reserved_capacity;
    }

    public Double getOs_mem_reserved() {
        return os_mem_reserved;
    }

    public void setOs_mem_reserved(Double os_mem_reserved) {
        this.os_mem_reserved = os_mem_reserved;
    }

    public Integer getRebalance_throughput() {
        return rebalance_throughput;
    }

    public void setRebalance_throughput(Integer rebalance_throughput) {
        this.rebalance_throughput = rebalance_throughput;
    }
}
