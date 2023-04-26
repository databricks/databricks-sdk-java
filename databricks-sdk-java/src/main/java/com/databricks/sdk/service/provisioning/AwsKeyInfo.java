// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>AwsKeyInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>keyAlias</code>.</p>
   *
   * @param keyAlias a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.AwsKeyInfo} object
   */
  public AwsKeyInfo setKeyAlias(String keyAlias) {
    this.keyAlias = keyAlias;
    return this;
  }

  /**
   * <p>Getter for the field <code>keyAlias</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getKeyAlias() {
    return keyAlias;
  }

  /**
   * <p>Setter for the field <code>keyArn</code>.</p>
   *
   * @param keyArn a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.AwsKeyInfo} object
   */
  public AwsKeyInfo setKeyArn(String keyArn) {
    this.keyArn = keyArn;
    return this;
  }

  /**
   * <p>Getter for the field <code>keyArn</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getKeyArn() {
    return keyArn;
  }

  /**
   * <p>Setter for the field <code>keyRegion</code>.</p>
   *
   * @param keyRegion a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.AwsKeyInfo} object
   */
  public AwsKeyInfo setKeyRegion(String keyRegion) {
    this.keyRegion = keyRegion;
    return this;
  }

  /**
   * <p>Getter for the field <code>keyRegion</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getKeyRegion() {
    return keyRegion;
  }

  /**
   * <p>Setter for the field <code>reuseKeyForClusterVolumes</code>.</p>
   *
   * @param reuseKeyForClusterVolumes a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.provisioning.AwsKeyInfo} object
   */
  public AwsKeyInfo setReuseKeyForClusterVolumes(Boolean reuseKeyForClusterVolumes) {
    this.reuseKeyForClusterVolumes = reuseKeyForClusterVolumes;
    return this;
  }

  /**
   * <p>Getter for the field <code>reuseKeyForClusterVolumes</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getReuseKeyForClusterVolumes() {
    return reuseKeyForClusterVolumes;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(keyAlias, keyArn, keyRegion, reuseKeyForClusterVolumes);
  }

  /** {@inheritDoc} */
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
