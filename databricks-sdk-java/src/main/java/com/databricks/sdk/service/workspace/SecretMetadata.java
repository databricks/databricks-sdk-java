// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>SecretMetadata class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SecretMetadata {
  /** A unique name to identify the secret. */
  @JsonProperty("key")
  private String key;

  /** The last updated timestamp (in milliseconds) for the secret. */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /**
   * <p>Setter for the field <code>key</code>.</p>
   *
   * @param key a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.SecretMetadata} object
   */
  public SecretMetadata setKey(String key) {
    this.key = key;
    return this;
  }

  /**
   * <p>Getter for the field <code>key</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getKey() {
    return key;
  }

  /**
   * <p>Setter for the field <code>lastUpdatedTimestamp</code>.</p>
   *
   * @param lastUpdatedTimestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.workspace.SecretMetadata} object
   */
  public SecretMetadata setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastUpdatedTimestamp</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SecretMetadata that = (SecretMetadata) o;
    return Objects.equals(key, that.key)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(key, lastUpdatedTimestamp);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SecretMetadata.class)
        .add("key", key)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .toString();
  }
}
