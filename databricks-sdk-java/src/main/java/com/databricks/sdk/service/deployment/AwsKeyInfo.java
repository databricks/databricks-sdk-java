// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class AwsKeyInfo {
  /** The AWS KMS key alias. */
  @JsonProperty("key_alias")
  private String keyAlias;

  /** The AWS KMS key's Amazon Resource Name (ARN). */
  @JsonProperty("key_arn")
  private String keyArn;

  /** The AWS KMS key region. */
  @JsonProperty("key_region")
  private String keyRegion;

  /**
   * This field applies only if the `use_cases` property includes `STORAGE`. If this is set to
   * `true` or omitted, the key is also used to encrypt cluster EBS volumes. If you do not want to
   * use this key for encrypting EBS volumes, set to `false`.
   */
  @JsonProperty("reuse_key_for_cluster_volumes")
  private Boolean reuseKeyForClusterVolumes;

  public AwsKeyInfo setKeyAlias(String keyAlias) {
    this.keyAlias = keyAlias;
    return this;
  }

  public String getKeyAlias() {
    return keyAlias;
  }

  public AwsKeyInfo setKeyArn(String keyArn) {
    this.keyArn = keyArn;
    return this;
  }

  public String getKeyArn() {
    return keyArn;
  }

  public AwsKeyInfo setKeyRegion(String keyRegion) {
    this.keyRegion = keyRegion;
    return this;
  }

  public String getKeyRegion() {
    return keyRegion;
  }

  public AwsKeyInfo setReuseKeyForClusterVolumes(Boolean reuseKeyForClusterVolumes) {
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
    AwsKeyInfo that = (AwsKeyInfo) o;
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
    return new ToStringer(AwsKeyInfo.class)
        .add("keyAlias", keyAlias)
        .add("keyArn", keyArn)
        .add("keyRegion", keyRegion)
        .add("reuseKeyForClusterVolumes", reuseKeyForClusterVolumes)
        .toString();
  }
}
