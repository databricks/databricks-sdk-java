// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ClusterLogConf {
    /**
     * destination needs to be provided. e.g. `{ "dbfs" : { "destination" :
     * "dbfs:/home/cluster_log" } }`
     */
    @JsonProperty("dbfs")
    private DbfsStorageInfo dbfs;
    
    /**
     * destination and either region or endpoint should also be provided. e.g.
     * `{ "s3": { "destination" : "s3://cluster_log_bucket/prefix", "region" :
     * "us-west-2" } }` Cluster iam role is used to access s3, please make sure
     * the cluster iam role in `instance_profile_arn` has permission to write
     * data to the s3 destination.
     */
    @JsonProperty("s3")
    private S3StorageInfo s3;
    
    public ClusterLogConf setDbfs(DbfsStorageInfo dbfs) {
        this.dbfs = dbfs;
        return this;
    }

    public DbfsStorageInfo getDbfs() {
        return dbfs;
    }
    
    public ClusterLogConf setS3(S3StorageInfo s3) {
        this.s3 = s3;
        return this;
    }

    public S3StorageInfo getS3() {
        return s3;
    }
    
}
