package lumberjack.output.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IndexesItem {

    @JsonProperty("avg_drain_rate")
    private long avgDrainRate;

    @JsonProperty("num_rows_scanned")
    private long numRowsScanned;

    @JsonProperty("key_size_stats_since")
    private String keySizeStatsSince;

    @JsonProperty("num_rows_scanned_aggr")
    private long numRowsScannedAggr;

    @JsonProperty("avg_scan_latency")
    private long avgScanLatency;

    @JsonProperty("docid_count")
    private long docidCount;

    @JsonProperty("num_completed_requests_aggr")
    private long numCompletedRequestsAggr;

    @JsonProperty("raw_data_size")
    private long rawDataSize;

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("avg_scan_request_latency")
    private long avgScanRequestLatency;

    @JsonProperty("num_docs_processed")
    private long numDocsProcessed;

    @JsonProperty("num_docs_indexed")
    private long numDocsIndexed;

    @JsonProperty("avg_array_length")
    private long avgArrayLength;

    @JsonProperty("data_size")
    private long dataSize;

    @JsonProperty("indexName")
    private String indexName;

    @JsonProperty("hosts")
    private String hosts;

    @JsonProperty("arrkey_size_distribution")
    private String arrkeySizeDistribution;

    @JsonProperty("num_rows_returned_range")
    private long numRowsReturnedRange;

    @JsonProperty("log_space_on_disk")
    private long logSpaceOnDisk;

    @JsonProperty("memory_used")
    private long memoryUsed;

    @JsonProperty("collection")
    private String collection;

    @JsonProperty("key_size_distribution")
    private String keySizeDistribution;

    @JsonProperty("avg_item_size")
    private long avgItemSize;

    @JsonProperty("bucket")
    private String bucket;

    @JsonProperty("last_known_scan_time")
    private String lastKnownScanTime;

    @JsonProperty("num_docs_queued")
    private long numDocsQueued;

    @JsonProperty("avg_scan_rate")
    private long avgScanRate;

    @JsonProperty("replicaId")
    private long replicaId;

    @JsonProperty("num_docs_pending")
    private long numDocsPending;

    @JsonProperty("secExprs")
    private String secExprs;

    @JsonProperty("lastScanTime")
    private String lastScanTime;

    @JsonProperty("partitioned")
    private boolean partitioned;

    @JsonProperty("numPartition")
    private long numPartition;

    @JsonProperty("recs_in_mem")
    private long recsInMem;

    @JsonProperty("partitionMap")
    private String partitionMap;

    @JsonProperty("cache_misses")
    private long cacheMisses;

    @JsonProperty("build_progress")
    private long buildProgress;

    @JsonProperty("scope")
    private String scope;

    @JsonProperty("definition")
    private String definition;

    @JsonProperty("where")
    private Object where;

    @JsonProperty("num_rows_returned")
    private long numRowsReturned;

    @JsonProperty("num_completed_requests")
    private long numCompletedRequests;

    @JsonProperty("recs_on_disk")
    private long recsOnDisk;

    @JsonProperty("partitionId")
    private long partitionId;

    @JsonProperty("data_size_on_disk")
    private long dataSizeOnDisk;

    @JsonProperty("disk_size")
    private long diskSize;

    @JsonProperty("cache_hits")
    private long cacheHits;

    @JsonProperty("num_rows_scanned_range")
    private long numRowsScannedRange;

    @JsonProperty("indexType")
    private String indexType;

    @JsonProperty("items_count")
    private long itemsCount;

    @JsonProperty("cache_hit_percent")
    private long cacheHitPercent;

    @JsonProperty("resident_percent")
    private long residentPercent;

    @JsonProperty("avg_mutation_rate")
    private long avgMutationRate;

    @JsonProperty("num_rows_returned_aggr")
    private long numRowsReturnedAggr;

    @JsonProperty("num_completed_requests_range")
    private long numCompletedRequestsRange;

    public long getAvgDrainRate() {
        return avgDrainRate;
    }

    public void setAvgDrainRate(long avgDrainRate) {
        this.avgDrainRate = avgDrainRate;
    }

    public long getNumRowsScanned() {
        return numRowsScanned;
    }

    public void setNumRowsScanned(long numRowsScanned) {
        this.numRowsScanned = numRowsScanned;
    }

    public String getKeySizeStatsSince() {
        return keySizeStatsSince;
    }

    public void setKeySizeStatsSince(String keySizeStatsSince) {
        this.keySizeStatsSince = keySizeStatsSince;
    }

    public long getNumRowsScannedAggr() {
        return numRowsScannedAggr;
    }

    public void setNumRowsScannedAggr(long numRowsScannedAggr) {
        this.numRowsScannedAggr = numRowsScannedAggr;
    }

    public long getAvgScanLatency() {
        return avgScanLatency;
    }

    public void setAvgScanLatency(long avgScanLatency) {
        this.avgScanLatency = avgScanLatency;
    }

    public long getDocidCount() {
        return docidCount;
    }

    public void setDocidCount(long docidCount) {
        this.docidCount = docidCount;
    }

    public long getNumCompletedRequestsAggr() {
        return numCompletedRequestsAggr;
    }

    public void setNumCompletedRequestsAggr(long numCompletedRequestsAggr) {
        this.numCompletedRequestsAggr = numCompletedRequestsAggr;
    }

    public long getRawDataSize() {
        return rawDataSize;
    }

    public void setRawDataSize(long rawDataSize) {
        this.rawDataSize = rawDataSize;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public long getAvgScanRequestLatency() {
        return avgScanRequestLatency;
    }

    public void setAvgScanRequestLatency(long avgScanRequestLatency) {
        this.avgScanRequestLatency = avgScanRequestLatency;
    }

    public long getNumDocsProcessed() {
        return numDocsProcessed;
    }

    public void setNumDocsProcessed(long numDocsProcessed) {
        this.numDocsProcessed = numDocsProcessed;
    }

    public long getNumDocsIndexed() {
        return numDocsIndexed;
    }

    public void setNumDocsIndexed(long numDocsIndexed) {
        this.numDocsIndexed = numDocsIndexed;
    }

    public long getAvgArrayLength() {
        return avgArrayLength;
    }

    public void setAvgArrayLength(long avgArrayLength) {
        this.avgArrayLength = avgArrayLength;
    }

    public long getDataSize() {
        return dataSize;
    }

    public void setDataSize(long dataSize) {
        this.dataSize = dataSize;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public String getArrkeySizeDistribution() {
        return arrkeySizeDistribution;
    }

    public void setArrkeySizeDistribution(String arrkeySizeDistribution) {
        this.arrkeySizeDistribution = arrkeySizeDistribution;
    }

    public long getNumRowsReturnedRange() {
        return numRowsReturnedRange;
    }

    public void setNumRowsReturnedRange(long numRowsReturnedRange) {
        this.numRowsReturnedRange = numRowsReturnedRange;
    }

    public long getLogSpaceOnDisk() {
        return logSpaceOnDisk;
    }

    public void setLogSpaceOnDisk(long logSpaceOnDisk) {
        this.logSpaceOnDisk = logSpaceOnDisk;
    }

    public long getMemoryUsed() {
        return memoryUsed;
    }

    public void setMemoryUsed(long memoryUsed) {
        this.memoryUsed = memoryUsed;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getKeySizeDistribution() {
        return keySizeDistribution;
    }

    public void setKeySizeDistribution(String keySizeDistribution) {
        this.keySizeDistribution = keySizeDistribution;
    }

    public long getAvgItemSize() {
        return avgItemSize;
    }

    public void setAvgItemSize(long avgItemSize) {
        this.avgItemSize = avgItemSize;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getLastKnownScanTime() {
        return lastKnownScanTime;
    }

    public void setLastKnownScanTime(String lastKnownScanTime) {
        this.lastKnownScanTime = lastKnownScanTime;
    }

    public long getNumDocsQueued() {
        return numDocsQueued;
    }

    public void setNumDocsQueued(long numDocsQueued) {
        this.numDocsQueued = numDocsQueued;
    }

    public long getAvgScanRate() {
        return avgScanRate;
    }

    public void setAvgScanRate(long avgScanRate) {
        this.avgScanRate = avgScanRate;
    }

    public long getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(long replicaId) {
        this.replicaId = replicaId;
    }

    public long getNumDocsPending() {
        return numDocsPending;
    }

    public void setNumDocsPending(long numDocsPending) {
        this.numDocsPending = numDocsPending;
    }

    public String getSecExprs() {
        return secExprs;
    }

    public void setSecExprs(String secExprs) {
        this.secExprs = secExprs;
    }

    public String getLastScanTime() {
        return lastScanTime;
    }

    public void setLastScanTime(String lastScanTime) {
        this.lastScanTime = lastScanTime;
    }

    public boolean isPartitioned() {
        return partitioned;
    }

    public void setPartitioned(boolean partitioned) {
        this.partitioned = partitioned;
    }

    public long getNumPartition() {
        return numPartition;
    }

    public void setNumPartition(long numPartition) {
        this.numPartition = numPartition;
    }

    public long getRecsInMem() {
        return recsInMem;
    }

    public void setRecsInMem(long recsInMem) {
        this.recsInMem = recsInMem;
    }

    public String getPartitionMap() {
        return partitionMap;
    }

    public void setPartitionMap(String partitionMap) {
        this.partitionMap = partitionMap;
    }

    public long getCacheMisses() {
        return cacheMisses;
    }

    public void setCacheMisses(long cacheMisses) {
        this.cacheMisses = cacheMisses;
    }

    public long getBuildProgress() {
        return buildProgress;
    }

    public void setBuildProgress(long buildProgress) {
        this.buildProgress = buildProgress;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Object getWhere() {
        return where;
    }

    public void setWhere(Object where) {
        this.where = where;
    }

    public long getNumRowsReturned() {
        return numRowsReturned;
    }

    public void setNumRowsReturned(long numRowsReturned) {
        this.numRowsReturned = numRowsReturned;
    }

    public long getNumCompletedRequests() {
        return numCompletedRequests;
    }

    public void setNumCompletedRequests(long numCompletedRequests) {
        this.numCompletedRequests = numCompletedRequests;
    }

    public long getRecsOnDisk() {
        return recsOnDisk;
    }

    public void setRecsOnDisk(long recsOnDisk) {
        this.recsOnDisk = recsOnDisk;
    }

    public long getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(long partitionId) {
        this.partitionId = partitionId;
    }

    public long getDataSizeOnDisk() {
        return dataSizeOnDisk;
    }

    public void setDataSizeOnDisk(long dataSizeOnDisk) {
        this.dataSizeOnDisk = dataSizeOnDisk;
    }

    public long getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(long diskSize) {
        this.diskSize = diskSize;
    }

    public long getCacheHits() {
        return cacheHits;
    }

    public void setCacheHits(long cacheHits) {
        this.cacheHits = cacheHits;
    }

    public long getNumRowsScannedRange() {
        return numRowsScannedRange;
    }

    public void setNumRowsScannedRange(long numRowsScannedRange) {
        this.numRowsScannedRange = numRowsScannedRange;
    }

    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    public long getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(long itemsCount) {
        this.itemsCount = itemsCount;
    }

    public long getCacheHitPercent() {
        return cacheHitPercent;
    }

    public void setCacheHitPercent(long cacheHitPercent) {
        this.cacheHitPercent = cacheHitPercent;
    }

    public long getResidentPercent() {
        return residentPercent;
    }

    public void setResidentPercent(long residentPercent) {
        this.residentPercent = residentPercent;
    }

    public long getAvgMutationRate() {
        return avgMutationRate;
    }

    public void setAvgMutationRate(long avgMutationRate) {
        this.avgMutationRate = avgMutationRate;
    }

    public long getNumRowsReturnedAggr() {
        return numRowsReturnedAggr;
    }

    public void setNumRowsReturnedAggr(long numRowsReturnedAggr) {
        this.numRowsReturnedAggr = numRowsReturnedAggr;
    }

    public long getNumCompletedRequestsRange() {
        return numCompletedRequestsRange;
    }

    public void setNumCompletedRequestsRange(long numCompletedRequestsRange) {
        this.numCompletedRequestsRange = numCompletedRequestsRange;
    }
}