// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Root S3 bucket information.
 */
public class RootBucketInfo {
    /**
     * The name of the S3 bucket.
     */
    @JsonProperty("bucket_name")
    private String bucketName;
    
    public RootBucketInfo setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    public String getBucketName() {
        return bucketName;
    }
    
}
