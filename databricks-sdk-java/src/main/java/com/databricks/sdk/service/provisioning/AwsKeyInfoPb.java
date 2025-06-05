// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AwsKeyInfoPb {
  @JsonProperty("key_alias")
  private String keyAlias;

  @JsonProperty("key_arn")
  private String keyArn;

  @JsonProperty("key_region")
  private String keyRegion;

  @JsonProperty("reuse_key_for_cluster_volumes")
  private Boolean reuseKeyForClusterVolumes;

  public AwsKeyInfoPb setKeyAlias(String keyAlias) {
    this.keyAlias = keyAlias;
    return this;
  }

  public String getKeyAlias() {
    return keyAlias;
  }

  public AwsKeyInfoPb setKeyArn(String keyArn) {
    this.keyArn = keyArn;
    return this;
  }

  public String getKeyArn() {
    return keyArn;
  }

  public AwsKeyInfoPb setKeyRegion(String keyRegion) {
    this.keyRegion = keyRegion;
    return this;
  }

  public String getKeyRegion() {
    return keyRegion;
  }

  public AwsKeyInfoPb setReuseKeyForClusterVolumes(Boolean reuseKeyForClusterVolumes) {
    this.reuseKeyForClusterVolumes = reuseKeyForClusterVolumes;
    return this;
  }

  public Boolean getReuseKeyForClusterVolumes() {
    return reuseKeyForClusterVolumes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AwsKeyInfoPb that = (AwsKeyInfoPb) o;
    return Objects.equals(keyAlias, that.keyAlias)
        && Objects.equals(keyArn, that.keyArn)
        && Objects.equals(keyRegion, that.keyRegion)
        && Objects.equals(reuseKeyForClusterVolumes, that.reuseKeyForClusterVolumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyAlias, keyArn, keyRegion, reuseKeyForClusterVolumes);
  }

  @Override
  public String toString() {
    return new ToStringer(AwsKeyInfoPb.class)
        .add("keyAlias", keyAlias)
        .add("keyArn", keyArn)
        .add("keyRegion", keyRegion)
        .add("reuseKeyForClusterVolumes", reuseKeyForClusterVolumes)
        .toString();
  }
}
