package lumberjack.output.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Response {

    @JsonProperty("clients")
    private List<ClientsItem> clients;

    @JsonProperty("data")
    private List<DataItem> data;

    @JsonProperty("indexes")
    private List<IndexesItem> indexes;

    @JsonProperty("fts")
    private List<Object> fts;

    @JsonProperty("collections")
    private List<Object> collections;

    @JsonProperty("fts_slow_queries")
    private List<Object> ftsSlowQueries;

    @JsonProperty("timings")
    private List<TimingsItem> timings;

    public List<ClientsItem> getClients() {
        return clients;
    }

    public void setClients(List<ClientsItem> clients) {
        this.clients = clients;
    }

    public List<DataItem> getData() {
        return data;
    }

    public void setData(List<DataItem> data) {
        this.data = data;
    }

    public List<IndexesItem> getIndexes() {
        return indexes;
    }

    public void setIndexes(List<IndexesItem> indexes) {
        this.indexes = indexes;
    }

    public List<Object> getFts() {
        return fts;
    }

    public void setFts(List<Object> fts) {
        this.fts = fts;
    }

    public List<Object> getCollections() {
        return collections;
    }

    public void setCollections(List<Object> collections) {
        this.collections = collections;
    }

    public List<Object> getFtsSlowQueries() {
        return ftsSlowQueries;
    }

    public void setFtsSlowQueries(List<Object> ftsSlowQueries) {
        this.ftsSlowQueries = ftsSlowQueries;
    }

    public List<TimingsItem> getTimings() {
        return timings;
    }

    public void setTimings(List<TimingsItem> timings) {
        this.timings = timings;
    }
}