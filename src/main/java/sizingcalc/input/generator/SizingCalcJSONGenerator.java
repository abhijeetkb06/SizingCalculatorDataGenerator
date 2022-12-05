package sizingcalc.input.generator;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import sizing.calculator.pojo.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@author -Abhijeet
public class SizingCalcJSONGenerator {

    public static void generateSizingCalcJSON() throws JsonProcessingException {
        // Creating the ObjectMapper object
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        //Create sizing calculator object
        Root root = getRoot();

        // Populate services details
        Services services = new Services();
        Data data = getData();

        Config config = getConfig();
        data.setConfig(config);
        services.setData(data);

        // Populate Cluster details
        List<Cluster> myClusters = new ArrayList<>();
        Cluster cluster = new Cluster();
        cluster.setId("b21b271b-0643-4ca1-92bc-da73c7dd65dc");
        cluster.setName("Sample_Cluster");
        cluster.setCouchbase_version("7.1");

        // Set Services
        cluster.setServices(services);

        // Set Service Groups
        List<ServiceGroup> serviceGroups = new ArrayList<>();
        ServiceGroup serviceGroup = new ServiceGroup();
        serviceGroup.setId("aba680f1-17ea-44cb-965f-f14d8f8865fd");
        List<String> serviceGrpServices = new ArrayList<>();
        serviceGrpServices.add("data");
        serviceGroup.setServices(serviceGrpServices);

        // Set Hardware
        Hardware hardware = getHardware();
        serviceGroup.setHardware(hardware);
        serviceGroups.add(serviceGroup);

        cluster.setService_groups(serviceGroups);
        myClusters.add(cluster);

        //Set root at the end
        root.setClusters(myClusters);

        // Converting the Object to JSONString
        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);
        System.out.println(jsonString);
    }

    private static Hardware getHardware() {
        Hardware hardware = new Hardware();
        hardware.setInstance("Custom");
        hardware.setCpu(4);
        hardware.setRam(32);
        hardware.setDisk_type("EBS");
        hardware.setDisk_space(100);
        hardware.setDisk_io(10000);
        hardware.setNetwork(5);
        return hardware;
    }

    private static Config getConfig() {
        Config config = new Config();
        config.setAppend_only_multiplier(3);
        config.setBin_size_jemalloc(0.25);
        config.setCouchstore_compression_ratio(0.3);
        config.setHwm(0.85);
        config.setMinimum_number_of_cores_one_bucket(4);
        config.setNetwork_reserved_capacity(0.5);
        config.setOs_mem_reserved(0.2);
        config.setRebalance_throughput(450);
        return config;
    }

    private static Data getData() {
        Data data = new Data();
        List<Bucket> buckets = new ArrayList<>();
        Bucket bucket = new Bucket();
        bucket.setId("0");
        bucket.setName("bucket_name");
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
        scope.setId("0");
        scope.setName("_default");

        // Set Collection
        List<Collection> collections = new ArrayList<>();
        Collection collection = new Collection();
        collection.setId("0");
        collection.setName("_default");
        collection.setTotal_documents_keys(100000);
        collection.setWorking_set(0.05);
        collection.setAvg_key_id_size(58);
        collection.setAvg_document_size(10000);
        collection.setRead_ops_per_sec(100);
        collection.setWrite_ops_per_sec(50);
        collection.setDelete_ops_per_sec(10);
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
        buckets.add(bucket);
        data.setBuckets(buckets);
        return data;
    }

    private static Root getRoot() {
        Root root = new Root();
        root.setId("e9a804bb-8025-4c66-9397-9a0a84783c71");
        root.setName("PrePopulatedSizing");
        root.setSizing_version("1");
        root.setAccount("CustomerAccountName");
        root.setUsername("Abhijeet");
        root.setApplication("");
        root.setDate(new SimpleDateFormat("MM-dd-yyyy").format(new Date()));
        return root;
    }
}

