package lumberjack.output.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataItem {

    @JsonProperty("vb_replica_perc_mem_resident")
    private long vbReplicaPercMemResident;

    @JsonProperty("ep_max_size")
    private long epMaxSize;

    @JsonProperty("vb_replica_itm_memory")
    private long vbReplicaItmMemory;

    @JsonProperty("avg_value_size")
    private Object avgValueSize;

    @JsonProperty("ep_replica_datatype_snappy,json")
    private long epReplicaDatatypeSnappyJson;

    @JsonProperty("ep_mem_low_wat")
    private long epMemLowWat;

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("ep_meta_data_memory")
    private long epMetaDataMemory;

    @JsonProperty("stat_reset")
    private String statReset;

    @JsonProperty("vb_replica_ops_delete")
    private long vbReplicaOpsDelete;

    @JsonProperty("total_metadata_memory")
    private long totalMetadataMemory;

    @JsonProperty("vb_replica_meta_data_memory")
    private long vbReplicaMetaDataMemory;

    @JsonProperty("ep_mem_low_wat_percent")
    private Object epMemLowWatPercent;

    @JsonProperty("avg_cmd_set")
    private Object avgCmdSet;

    @JsonProperty("avg_key_size")
    private Object avgKeySize;

    @JsonProperty("ep_active_datatype_json")
    private long epActiveDatatypeJson;

    @JsonProperty("ep_value_size")
    private long epValueSize;

    @JsonProperty("get_misses")
    private long getMisses;

    @JsonProperty("avg_cmd_get")
    private Object avgCmdGet;

    @JsonProperty("vb_active_perc_mem_resident")
    private long vbActivePercMemResident;

    @JsonProperty("memory_utilization_percent")
    private Object memoryUtilizationPercent;

    @JsonProperty("resident_ratio")
    private long residentRatio;

    @JsonProperty("vb_active_itm_memory_uncompressed")
    private long vbActiveItmMemoryUncompressed;

    @JsonProperty("delete_misses")
    private long deleteMisses;

    @JsonProperty("vb_replica_itm_memory_uncompressed")
    private long vbReplicaItmMemoryUncompressed;

    @JsonProperty("vb_replica_curr_items")
    private long vbReplicaCurrItems;

    @JsonProperty("ep_kv_size")
    private long epKvSize;

    @JsonProperty("mem_used")
    private long memUsed;

    @JsonProperty("curr_items_tot")
    private long currItemsTot;

    @JsonProperty("get_hits")
    private long getHits;

    @JsonProperty("delete_hits")
    private long deleteHits;

    @JsonProperty("curr_connections")
    private long currConnections;

    @JsonProperty("ep_replica_datatype_snappy")
    private long epReplicaDatatypeSnappy;

    @JsonProperty("compression_ratio")
    private long compressionRatio;

    @JsonProperty("ep_couch_bucket")
    private String epCouchBucket;

    @JsonProperty("ep_bg_fetched")
    private long epBgFetched;

    @JsonProperty("ep_mem_high_wat")
    private long epMemHighWat;

    @JsonProperty("ep_active_datatype_snappy,json")
    private long epActiveDatatypeSnappyJson;

    @JsonProperty("vb_active_ops_delete")
    private long vbActiveOpsDelete;

    @JsonProperty("ep_active_datatype_snappy")
    private long epActiveDatatypeSnappy;

    @JsonProperty("ep_bg_meta_fetched")
    private long epBgMetaFetched;

    @JsonProperty("ep_replica_datatype_raw")
    private long epReplicaDatatypeRaw;

    @JsonProperty("cmd_get")
    private long cmdGet;

    @JsonProperty("curr_items")
    private long currItems;

    @JsonProperty("vb_active_itm_memory")
    private long vbActiveItmMemory;

    @JsonProperty("cmd_set")
    private long cmdSet;

    @JsonProperty("ep_active_datatype_raw")
    private long epActiveDatatypeRaw;

    @JsonProperty("ep_mem_high_wat_percent")
    private Object epMemHighWatPercent;

    @JsonProperty("ep_replica_datatype_json")
    private long epReplicaDatatypeJson;

    @JsonProperty("uptime")
    private long uptime;

    @JsonProperty("ep_bucket_type")
    private String epBucketType;

    @JsonProperty("vb_active_curr_items")
    private long vbActiveCurrItems;

    @JsonProperty("ep_num_non_resident")
    private long epNumNonResident;

    @JsonProperty("metadata_utilization_percent")
    private long metadataUtilizationPercent;

    @JsonProperty("avg_delete_hits")
    private long avgDeleteHits;

    @JsonProperty("vb_active_meta_data_memory")
    private long vbActiveMetaDataMemory;

    public long getVbReplicaPercMemResident() {
        return vbReplicaPercMemResident;
    }

    public void setVbReplicaPercMemResident(long vbReplicaPercMemResident) {
        this.vbReplicaPercMemResident = vbReplicaPercMemResident;
    }

    public long getEpMaxSize() {
        return epMaxSize;
    }

    public void setEpMaxSize(long epMaxSize) {
        this.epMaxSize = epMaxSize;
    }

    public long getVbReplicaItmMemory() {
        return vbReplicaItmMemory;
    }

    public void setVbReplicaItmMemory(long vbReplicaItmMemory) {
        this.vbReplicaItmMemory = vbReplicaItmMemory;
    }

    public Object getAvgValueSize() {
        return avgValueSize;
    }

    public void setAvgValueSize(Object avgValueSize) {
        this.avgValueSize = avgValueSize;
    }

    public long getEpReplicaDatatypeSnappyJson() {
        return epReplicaDatatypeSnappyJson;
    }

    public void setEpReplicaDatatypeSnappyJson(long epReplicaDatatypeSnappyJson) {
        this.epReplicaDatatypeSnappyJson = epReplicaDatatypeSnappyJson;
    }

    public long getEpMemLowWat() {
        return epMemLowWat;
    }

    public void setEpMemLowWat(long epMemLowWat) {
        this.epMemLowWat = epMemLowWat;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public long getEpMetaDataMemory() {
        return epMetaDataMemory;
    }

    public void setEpMetaDataMemory(long epMetaDataMemory) {
        this.epMetaDataMemory = epMetaDataMemory;
    }

    public String getStatReset() {
        return statReset;
    }

    public void setStatReset(String statReset) {
        this.statReset = statReset;
    }

    public long getVbReplicaOpsDelete() {
        return vbReplicaOpsDelete;
    }

    public void setVbReplicaOpsDelete(long vbReplicaOpsDelete) {
        this.vbReplicaOpsDelete = vbReplicaOpsDelete;
    }

    public long getTotalMetadataMemory() {
        return totalMetadataMemory;
    }

    public void setTotalMetadataMemory(long totalMetadataMemory) {
        this.totalMetadataMemory = totalMetadataMemory;
    }

    public long getVbReplicaMetaDataMemory() {
        return vbReplicaMetaDataMemory;
    }

    public void setVbReplicaMetaDataMemory(long vbReplicaMetaDataMemory) {
        this.vbReplicaMetaDataMemory = vbReplicaMetaDataMemory;
    }

    public Object getEpMemLowWatPercent() {
        return epMemLowWatPercent;
    }

    public void setEpMemLowWatPercent(Object epMemLowWatPercent) {
        this.epMemLowWatPercent = epMemLowWatPercent;
    }

    public Object getAvgCmdSet() {
        return avgCmdSet;
    }

    public void setAvgCmdSet(Object avgCmdSet) {
        this.avgCmdSet = avgCmdSet;
    }

    public Object getAvgKeySize() {
        return avgKeySize;
    }

    public void setAvgKeySize(Object avgKeySize) {
        this.avgKeySize = avgKeySize;
    }

    public long getEpActiveDatatypeJson() {
        return epActiveDatatypeJson;
    }

    public void setEpActiveDatatypeJson(long epActiveDatatypeJson) {
        this.epActiveDatatypeJson = epActiveDatatypeJson;
    }

    public long getEpValueSize() {
        return epValueSize;
    }

    public void setEpValueSize(long epValueSize) {
        this.epValueSize = epValueSize;
    }

    public long getGetMisses() {
        return getMisses;
    }

    public void setGetMisses(long getMisses) {
        this.getMisses = getMisses;
    }

    public Object getAvgCmdGet() {
        return avgCmdGet;
    }

    public void setAvgCmdGet(Object avgCmdGet) {
        this.avgCmdGet = avgCmdGet;
    }

    public long getVbActivePercMemResident() {
        return vbActivePercMemResident;
    }

    public void setVbActivePercMemResident(long vbActivePercMemResident) {
        this.vbActivePercMemResident = vbActivePercMemResident;
    }

    public Object getMemoryUtilizationPercent() {
        return memoryUtilizationPercent;
    }

    public void setMemoryUtilizationPercent(Object memoryUtilizationPercent) {
        this.memoryUtilizationPercent = memoryUtilizationPercent;
    }

    public long getResidentRatio() {
        return residentRatio;
    }

    public void setResidentRatio(long residentRatio) {
        this.residentRatio = residentRatio;
    }

    public long getVbActiveItmMemoryUncompressed() {
        return vbActiveItmMemoryUncompressed;
    }

    public void setVbActiveItmMemoryUncompressed(long vbActiveItmMemoryUncompressed) {
        this.vbActiveItmMemoryUncompressed = vbActiveItmMemoryUncompressed;
    }

    public long getDeleteMisses() {
        return deleteMisses;
    }

    public void setDeleteMisses(long deleteMisses) {
        this.deleteMisses = deleteMisses;
    }

    public long getVbReplicaItmMemoryUncompressed() {
        return vbReplicaItmMemoryUncompressed;
    }

    public void setVbReplicaItmMemoryUncompressed(long vbReplicaItmMemoryUncompressed) {
        this.vbReplicaItmMemoryUncompressed = vbReplicaItmMemoryUncompressed;
    }

    public long getVbReplicaCurrItems() {
        return vbReplicaCurrItems;
    }

    public void setVbReplicaCurrItems(long vbReplicaCurrItems) {
        this.vbReplicaCurrItems = vbReplicaCurrItems;
    }

    public long getEpKvSize() {
        return epKvSize;
    }

    public void setEpKvSize(long epKvSize) {
        this.epKvSize = epKvSize;
    }

    public long getMemUsed() {
        return memUsed;
    }

    public void setMemUsed(long memUsed) {
        this.memUsed = memUsed;
    }

    public long getCurrItemsTot() {
        return currItemsTot;
    }

    public void setCurrItemsTot(long currItemsTot) {
        this.currItemsTot = currItemsTot;
    }

    public long getGetHits() {
        return getHits;
    }

    public void setGetHits(long getHits) {
        this.getHits = getHits;
    }

    public long getDeleteHits() {
        return deleteHits;
    }

    public void setDeleteHits(long deleteHits) {
        this.deleteHits = deleteHits;
    }

    public long getCurrConnections() {
        return currConnections;
    }

    public void setCurrConnections(long currConnections) {
        this.currConnections = currConnections;
    }

    public long getEpReplicaDatatypeSnappy() {
        return epReplicaDatatypeSnappy;
    }

    public void setEpReplicaDatatypeSnappy(long epReplicaDatatypeSnappy) {
        this.epReplicaDatatypeSnappy = epReplicaDatatypeSnappy;
    }

    public long getCompressionRatio() {
        return compressionRatio;
    }

    public void setCompressionRatio(long compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    public String getEpCouchBucket() {
        return epCouchBucket;
    }

    public void setEpCouchBucket(String epCouchBucket) {
        this.epCouchBucket = epCouchBucket;
    }

    public long getEpBgFetched() {
        return epBgFetched;
    }

    public void setEpBgFetched(long epBgFetched) {
        this.epBgFetched = epBgFetched;
    }

    public long getEpMemHighWat() {
        return epMemHighWat;
    }

    public void setEpMemHighWat(long epMemHighWat) {
        this.epMemHighWat = epMemHighWat;
    }

    public long getEpActiveDatatypeSnappyJson() {
        return epActiveDatatypeSnappyJson;
    }

    public void setEpActiveDatatypeSnappyJson(long epActiveDatatypeSnappyJson) {
        this.epActiveDatatypeSnappyJson = epActiveDatatypeSnappyJson;
    }

    public long getVbActiveOpsDelete() {
        return vbActiveOpsDelete;
    }

    public void setVbActiveOpsDelete(long vbActiveOpsDelete) {
        this.vbActiveOpsDelete = vbActiveOpsDelete;
    }

    public long getEpActiveDatatypeSnappy() {
        return epActiveDatatypeSnappy;
    }

    public void setEpActiveDatatypeSnappy(long epActiveDatatypeSnappy) {
        this.epActiveDatatypeSnappy = epActiveDatatypeSnappy;
    }

    public long getEpBgMetaFetched() {
        return epBgMetaFetched;
    }

    public void setEpBgMetaFetched(long epBgMetaFetched) {
        this.epBgMetaFetched = epBgMetaFetched;
    }

    public long getEpReplicaDatatypeRaw() {
        return epReplicaDatatypeRaw;
    }

    public void setEpReplicaDatatypeRaw(long epReplicaDatatypeRaw) {
        this.epReplicaDatatypeRaw = epReplicaDatatypeRaw;
    }

    public long getCmdGet() {
        return cmdGet;
    }

    public void setCmdGet(long cmdGet) {
        this.cmdGet = cmdGet;
    }

    public long getCurrItems() {
        return currItems;
    }

    public void setCurrItems(long currItems) {
        this.currItems = currItems;
    }

    public long getVbActiveItmMemory() {
        return vbActiveItmMemory;
    }

    public void setVbActiveItmMemory(long vbActiveItmMemory) {
        this.vbActiveItmMemory = vbActiveItmMemory;
    }

    public long getCmdSet() {
        return cmdSet;
    }

    public void setCmdSet(long cmdSet) {
        this.cmdSet = cmdSet;
    }

    public long getEpActiveDatatypeRaw() {
        return epActiveDatatypeRaw;
    }

    public void setEpActiveDatatypeRaw(long epActiveDatatypeRaw) {
        this.epActiveDatatypeRaw = epActiveDatatypeRaw;
    }

    public Object getEpMemHighWatPercent() {
        return epMemHighWatPercent;
    }

    public void setEpMemHighWatPercent(Object epMemHighWatPercent) {
        this.epMemHighWatPercent = epMemHighWatPercent;
    }

    public long getEpReplicaDatatypeJson() {
        return epReplicaDatatypeJson;
    }

    public void setEpReplicaDatatypeJson(long epReplicaDatatypeJson) {
        this.epReplicaDatatypeJson = epReplicaDatatypeJson;
    }

    public long getUptime() {
        return uptime;
    }

    public void setUptime(long uptime) {
        this.uptime = uptime;
    }

    public String getEpBucketType() {
        return epBucketType;
    }

    public void setEpBucketType(String epBucketType) {
        this.epBucketType = epBucketType;
    }

    public long getVbActiveCurrItems() {
        return vbActiveCurrItems;
    }

    public void setVbActiveCurrItems(long vbActiveCurrItems) {
        this.vbActiveCurrItems = vbActiveCurrItems;
    }

    public long getEpNumNonResident() {
        return epNumNonResident;
    }

    public void setEpNumNonResident(long epNumNonResident) {
        this.epNumNonResident = epNumNonResident;
    }

    public long getMetadataUtilizationPercent() {
        return metadataUtilizationPercent;
    }

    public void setMetadataUtilizationPercent(long metadataUtilizationPercent) {
        this.metadataUtilizationPercent = metadataUtilizationPercent;
    }

    public long getAvgDeleteHits() {
        return avgDeleteHits;
    }

    public void setAvgDeleteHits(long avgDeleteHits) {
        this.avgDeleteHits = avgDeleteHits;
    }

    public long getVbActiveMetaDataMemory() {
        return vbActiveMetaDataMemory;
    }

    public void setVbActiveMetaDataMemory(long vbActiveMetaDataMemory) {
        this.vbActiveMetaDataMemory = vbActiveMetaDataMemory;
    }
}