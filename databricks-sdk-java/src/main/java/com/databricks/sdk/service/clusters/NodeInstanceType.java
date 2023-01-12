// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class NodeInstanceType {
    /**
     
     */
    @JsonProperty("instance_type_id")
    private String instanceTypeId;
    
    /**
     
     */
    @JsonProperty("local_disk_size_gb")
    private Long localDiskSizeGb;
    
    /**
     
     */
    @JsonProperty("local_disks")
    private Long localDisks;
    
    /**
     
     */
    @JsonProperty("local_nvme_disk_size_gb")
    private Long localNvmeDiskSizeGb;
    
    /**
     
     */
    @JsonProperty("local_nvme_disks")
    private Long localNvmeDisks;
    
    public NodeInstanceType setInstanceTypeId(String instanceTypeId) {
        this.instanceTypeId = instanceTypeId;
        return this;
    }

    public String getInstanceTypeId() {
        return instanceTypeId;
    }
    
    public NodeInstanceType setLocalDiskSizeGb(Long localDiskSizeGb) {
        this.localDiskSizeGb = localDiskSizeGb;
        return this;
    }

    public Long getLocalDiskSizeGb() {
        return localDiskSizeGb;
    }
    
    public NodeInstanceType setLocalDisks(Long localDisks) {
        this.localDisks = localDisks;
        return this;
    }

    public Long getLocalDisks() {
        return localDisks;
    }
    
    public NodeInstanceType setLocalNvmeDiskSizeGb(Long localNvmeDiskSizeGb) {
        this.localNvmeDiskSizeGb = localNvmeDiskSizeGb;
        return this;
    }

    public Long getLocalNvmeDiskSizeGb() {
        return localNvmeDiskSizeGb;
    }
    
    public NodeInstanceType setLocalNvmeDisks(Long localNvmeDisks) {
        this.localNvmeDisks = localNvmeDisks;
        return this;
    }

    public Long getLocalNvmeDisks() {
        return localNvmeDisks;
    }
    
}
