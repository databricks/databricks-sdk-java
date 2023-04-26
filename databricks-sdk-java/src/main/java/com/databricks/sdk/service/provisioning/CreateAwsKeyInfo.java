// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateAwsKeyInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateAwsKeyInfo {
  /** The AWS KMS key alias. */
  @JsonProperty("key_alias")
  private String keyAlias;

  /**
   * The AWS KMS key's Amazon Resource Name (ARN). Note that the key's AWS region is inferred from
   * the ARN.
   */
  @JsonProperty("key_arn")
  private String keyArn;

  /**
   * This field applies only if the `use_cases` property includes `STORAGE`. If this is set to
   * `true` or omitted, the key is also used to encrypt cluster EBS volumes. To not use this key
   * also for encrypting EBS volumes, set this to `false`.
   */
  @JsonProperty("reuse_key_for_cluster_volumes")
  private Boolean reuseKeyForClusterVolumes;

  /**
   * <p>Setter for the field <code>keyAlias</code>.</p>
   *
   * @param keyAlias a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateAwsKeyInfo} object
   */
  public CreateAwsKeyInfo setKeyAlias(String keyAlias) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.CreateAwsKeyInfo} object
   */
  public CreateAwsKeyInfo setKeyArn(String keyArn) {
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
   * <p>Setter for the field <code>reuseKeyForClusterVolumes</code>.</p>
   *
   * @param reuseKeyForClusterVolumes a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateAwsKeyInfo} object
   */
  public CreateAwsKeyInfo setReuseKeyForClusterVolumes(Boolean reuseKeyForClusterVolumes) {
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
    CreateAwsKeyInfo that = (CreateAwsKeyInfo) o;
    return Objects.equals(keyAlias, that.keyAlias)
        && Objects.equals(keyArn, that.keyArn)
        && Objects.equals(reuseKeyForClusterVolumes, that.reuseKeyForClusterVolumes);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(keyAlias, keyArn, reuseKeyForClusterVolumes);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateAwsKeyInfo.class)
        .add("keyAlias", keyAlias)
        .add("keyArn", keyArn)
        .add("reuseKeyForClusterVolumes", reuseKeyForClusterVolumes)
        .toString();
  }
}
