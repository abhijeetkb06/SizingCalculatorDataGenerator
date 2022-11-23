package sizing.calculator.pojo;

public class Collection {
    private String id;
    private String name;
    private String description;
    private Integer total_documents_keys;
    private Double working_set;
    private Integer avg_key_id_size;
    private Integer avg_document_size;
    private Integer read_ops_per_sec;
    private Integer write_ops_per_sec;
    private Integer delete_ops_per_sec;
    private Integer ttl_expiration;
    private Integer outbound_xdcr_streams;
    private Integer inbound_xdcr_streams;
    private Boolean xdcr_active_active;
    private Boolean uses_gsi;

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

    public Integer getTotal_documents_keys() {
        return total_documents_keys;
    }

    public void setTotal_documents_keys(Integer total_documents_keys) {
        this.total_documents_keys = total_documents_keys;
    }

    public Double getWorking_set() {
        return working_set;
    }

    public void setWorking_set(Double working_set) {
        this.working_set = working_set;
    }

    public Integer getAvg_key_id_size() {
        return avg_key_id_size;
    }

    public void setAvg_key_id_size(Integer avg_key_id_size) {
        this.avg_key_id_size = avg_key_id_size;
    }

    public Integer getAvg_document_size() {
        return avg_document_size;
    }

    public void setAvg_document_size(Integer avg_document_size) {
        this.avg_document_size = avg_document_size;
    }

    public Integer getRead_ops_per_sec() {
        return read_ops_per_sec;
    }

    public void setRead_ops_per_sec(Integer read_ops_per_sec) {
        this.read_ops_per_sec = read_ops_per_sec;
    }

    public Integer getWrite_ops_per_sec() {
        return write_ops_per_sec;
    }

    public void setWrite_ops_per_sec(Integer write_ops_per_sec) {
        this.write_ops_per_sec = write_ops_per_sec;
    }

    public Integer getDelete_ops_per_sec() {
        return delete_ops_per_sec;
    }

    public void setDelete_ops_per_sec(Integer delete_ops_per_sec) {
        this.delete_ops_per_sec = delete_ops_per_sec;
    }

    public Integer getTtl_expiration() {
        return ttl_expiration;
    }

    public void setTtl_expiration(Integer ttl_expiration) {
        this.ttl_expiration = ttl_expiration;
    }

    public Integer getOutbound_xdcr_streams() {
        return outbound_xdcr_streams;
    }

    public void setOutbound_xdcr_streams(Integer outbound_xdcr_streams) {
        this.outbound_xdcr_streams = outbound_xdcr_streams;
    }

    public Integer getInbound_xdcr_streams() {
        return inbound_xdcr_streams;
    }

    public void setInbound_xdcr_streams(Integer inbound_xdcr_streams) {
        this.inbound_xdcr_streams = inbound_xdcr_streams;
    }

    public Boolean getXdcr_active_active() {
        return xdcr_active_active;
    }

    public void setXdcr_active_active(Boolean xdcr_active_active) {
        this.xdcr_active_active = xdcr_active_active;
    }

    public Boolean getUses_gsi() {
        return uses_gsi;
    }

    public void setUses_gsi(Boolean uses_gsi) {
        this.uses_gsi = uses_gsi;
    }
}