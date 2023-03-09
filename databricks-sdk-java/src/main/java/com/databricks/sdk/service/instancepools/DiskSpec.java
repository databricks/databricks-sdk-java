// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class DiskSpec {
    /**
     * The number of disks launched for each instance: - This feature is only
     * enabled for supported node types. - Users can choose up to the limit of
     * the disks supported by the node type. - For node types with no OS disk,
     * at least one disk must be specified; otherwise, cluster creation will
     * fail.
     * 
     * If disks are attached, Databricks will configure Spark to use only the
     * disks for scratch storage, because heterogenously sized scratch devices
     * can lead to inefficient disk utilization. If no disks are attached,
     * Databricks will configure Spark to use instance store disks.
     * 
     * Note: If disks are specified, then the Spark configuration
     * `spark.local.dir` will be overridden.
     * 
     * Disks will be mounted at: - For AWS: `/ebs0`, `/ebs1`, and etc. - For
     * Azure: `/remote_volume0`, `/remote_volume1`, and etc.
     */
    @JsonProperty("disk_count")
    private Long diskCount;
    
    /**
     
     */
    @JsonProperty("disk_iops")
    private Long diskIops;
    
    /**
     * The size of each disk (in GiB) launched for each instance. Values must
     * fall into the supported range for a particular instance type.
     * 
     * For AWS: - General Purpose SSD: 100 - 4096 GiB - Throughput Optimized
     * HDD: 500 - 4096 GiB
     * 
     * For Azure: - Premium LRS (SSD): 1 - 1023 GiB - Standard LRS (HDD): 1-
     * 1023 GiB
     */
    @JsonProperty("disk_size")
    private Long diskSize;
    
    /**
     
     */
    @JsonProperty("disk_throughput")
    private Long diskThroughput;
    
    /**
     * The type of disks that will be launched with this cluster.
     */
    @JsonProperty("disk_type")
    private DiskType diskType;
    
    public DiskSpec setDiskCount(Long diskCount) {
        this.diskCount = diskCount;
        return this;
    }

    public Long getDiskCount() {
        return diskCount;
    }
    
    public DiskSpec setDiskIops(Long diskIops) {
        this.diskIops = diskIops;
        return this;
    }

    public Long getDiskIops() {
        return diskIops;
    }
    
    public DiskSpec setDiskSize(Long diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    public Long getDiskSize() {
        return diskSize;
    }
    
    public DiskSpec setDiskThroughput(Long diskThroughput) {
        this.diskThroughput = diskThroughput;
        return this;
    }

    public Long getDiskThroughput() {
        return diskThroughput;
    }
    
    public DiskSpec setDiskType(DiskType diskType) {
        this.diskType = diskType;
        return this;
    }

    public DiskType getDiskType() {
        return diskType;
    }
    
}
