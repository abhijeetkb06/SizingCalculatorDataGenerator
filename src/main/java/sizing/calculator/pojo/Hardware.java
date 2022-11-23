package sizing.calculator.pojo;

public class Hardware {
    private String instance;
    private Integer cpu;
    private Integer ram;
    private String disk_type;
    private Integer disk_space;
    private Integer disk_io;
    private Integer network;

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getDisk_type() {
        return disk_type;
    }

    public void setDisk_type(String disk_type) {
        this.disk_type = disk_type;
    }

    public Integer getDisk_space() {
        return disk_space;
    }

    public void setDisk_space(Integer disk_space) {
        this.disk_space = disk_space;
    }

    public Integer getDisk_io() {
        return disk_io;
    }

    public void setDisk_io(Integer disk_io) {
        this.disk_io = disk_io;
    }

    public Integer getNetwork() {
        return network;
    }

    public void setNetwork(Integer network) {
        this.network = network;
    }
}