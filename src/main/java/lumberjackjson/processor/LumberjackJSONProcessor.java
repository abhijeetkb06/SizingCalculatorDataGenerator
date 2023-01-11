package lumberjackjson.processor;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lumberjack.output.pojo.DataItem;
import lumberjack.output.pojo.Response;
import sizing.calculator.pojo.*;
import sizingcalc.input.generator.SizingCalcJSONGenerator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LumberjackJSONProcessor {

    public static void processLumberjackJSON() throws IOException {
        // Creating the ObjectMapper object
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        String home = System.getProperty("user.home");
        File json = new File(home+"/Downloads/" + "lumberjackoutput.json");
        Response response = mapper.readValue(json, Response.class);
        System.out.println("Response = " + response);

        System.out.println("response.getData() = " + response.getData().toString());

        // Generate default sizing calculator json
        Root sizingCalcJSONRoot=SizingCalcJSONGenerator.generateDefaultSizingCalcJSON();

        // Reset existing bucket info
        sizingCalcJSONRoot.getClusters().get(0).getServices().getData().setBuckets(null);

        // Dynamically buckets will be added based on buckets in a cluster
        List<Bucket> buckets = new ArrayList<>();
        int bucket_id=0;

        for (DataItem data:response.getData()) {

            if (data.getEpCouchBucket().endsWith("totals:")) {

                System.out.println("Bucket: " + data.getEpCouchBucket());
                System.out.println("Current Bucket Items: " + data.getCurrItems());
                System.out.println("Current Bucket avg_cmd_get: " + data.getAvgCmdGet());
                System.out.println("Current Bucket avg_cmd_set: " + data.getAvgCmdSet());
                System.out.println("Current Bucket avg_delete_hits: " + data.getAvgDeleteHits());
                System.out.println("Current Bucket avg_key_size: " + data.getAvgKeySize());
                System.out.println("Current Bucket avg_value_size: " + data.getAvgValueSize());

                // Populate JSON output val
                Bucket bucket = getData(data,bucket_id++);
                buckets.add(bucket);
                sizingCalcJSONRoot.getClusters().get(0).getServices().getData().setBuckets(buckets);
            }
        }
    }

    private static Bucket getData(DataItem dataItem, int bucket_id) {
//        Data data = new Data();
        String id = String.valueOf(bucket_id);
        Bucket bucket = new Bucket();
        bucket.setId(id);
        bucket.setName(dataItem.getEpCouchBucket());
        bucket.setBucket_type("Couchbase");
        bucket.setDescription("");
        bucket.setStorage_engine("Magma");
        bucket.setEviction_policy("Full");
        bucket.setValue_format("JSON/Text");
        bucket.setPurge_frequency(3);
        bucket.setNumber_replicas(1);
        bucket.setSnappy_compression(0.3);

        // Set Scopes
        List<Scope> scopes = new ArrayList<>();
        Scope scope = new Scope();
        scope.setId(id);
        scope.setName("_default");

        // Set Collection
        List<Collection> collections = new ArrayList<>();
        Collection collection = new Collection();
        collection.setId(id);
        collection.setName("_default");
        collection.setTotal_documents_keys((int)dataItem.getCurrItems());
        collection.setWorking_set(0.10);
        collection.setAvg_key_id_size((int)dataItem.getAvgKeySize());
        collection.setAvg_document_size((int)dataItem.getAvgValueSize());
        collection.setRead_ops_per_sec((int)dataItem.getAvgCmdGet());
        collection.setWrite_ops_per_sec((int)dataItem.getAvgCmdSet());
        collection.setDelete_ops_per_sec((int)dataItem.getAvgDeleteHits());
        collection.setDescription("");
        collection.setInbound_xdcr_streams(0);
        collection.setOutbound_xdcr_streams(0);
        collection.setTtl_expiration(0);
        collection.setUses_gsi(false);
        collection.setXdcr_active_active(false);
        collections.add(collection);
        scope.setCollections(collections);

        scopes.add(scope);
        bucket.setScopes(scopes);
//        buckets.add(bucket);
//        data.setBuckets(buckets);
        return bucket;
    }
}
