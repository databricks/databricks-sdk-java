// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreateAwsKeyInfo {
    /**
     * The AWS KMS key alias.
     */
    @JsonProperty("key_alias")
    private String keyAlias;
    
    /**
     * The AWS KMS key's Amazon Resource Name (ARN). Note that the key's AWS
     * region is inferred from the ARN.
     */
    @JsonProperty("key_arn")
    private String keyArn;
    
    /**
     * This field applies only if the `use_cases` property includes `STORAGE`.
     * If this is set to `true` or omitted, the key is also used to encrypt
     * cluster EBS volumes. To not use this key also for encrypting EBS volumes,
     * set this to `false`.
     */
    @JsonProperty("reuse_key_for_cluster_volumes")
    private Boolean reuseKeyForClusterVolumes;
    
    public CreateAwsKeyInfo setKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
        return this;
    }

    public String getKeyAlias() {
        return keyAlias;
    }
    
    public CreateAwsKeyInfo setKeyArn(String keyArn) {
        this.keyArn = keyArn;
        return this;
    }

    public String getKeyArn() {
        return keyArn;
    }
    
    public CreateAwsKeyInfo setReuseKeyForClusterVolumes(Boolean reuseKeyForClusterVolumes) {
        this.reuseKeyForClusterVolumes = reuseKeyForClusterVolumes;
        return this;
    }

    public Boolean getReuseKeyForClusterVolumes() {
        return reuseKeyForClusterVolumes;
    }
    
}
