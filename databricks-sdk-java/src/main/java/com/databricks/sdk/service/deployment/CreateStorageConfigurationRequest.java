// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateStorageConfigurationRequest {
    /**
     * Root S3 bucket information.
     */
    @JsonProperty("root_bucket_info")
    private RootBucketInfo rootBucketInfo;
    
    /**
     * The human-readable name of the storage configuration.
     */
    @JsonProperty("storage_configuration_name")
    private String storageConfigurationName;
    
    public CreateStorageConfigurationRequest setRootBucketInfo(RootBucketInfo rootBucketInfo) {
        this.rootBucketInfo = rootBucketInfo;
        return this;
    }

    public RootBucketInfo getRootBucketInfo() {
        return rootBucketInfo;
    }
    
    public CreateStorageConfigurationRequest setStorageConfigurationName(String storageConfigurationName) {
        this.storageConfigurationName = storageConfigurationName;
        return this;
    }

    public String getStorageConfigurationName() {
        return storageConfigurationName;
    }
    
}
