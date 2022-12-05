package lumberjack.output.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientsItem {

    @JsonProperty("bucket")
    private String bucket;

    @JsonProperty("node")
    private String node;

    @JsonProperty("internal")
    private boolean internal;

    @JsonProperty("bucket_index")
    private long bucketIndex;

    @JsonProperty("agent_name")
    private String agentName;

    @JsonProperty("client_address")
    private String clientAddress;

    @JsonProperty("connections")
    private long connections;

    @JsonProperty("username")
    private String username;

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public boolean isInternal() {
        return internal;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public long getBucketIndex() {
        return bucketIndex;
    }

    public void setBucketIndex(long bucketIndex) {
        this.bucketIndex = bucketIndex;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public long getConnections() {
        return connections;
    }

    public void setConnections(long connections) {
        this.connections = connections;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}