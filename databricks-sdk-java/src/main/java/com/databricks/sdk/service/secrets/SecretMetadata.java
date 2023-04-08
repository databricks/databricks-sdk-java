// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class SecretMetadata {
  /** A unique name to identify the secret. */
  @JsonProperty("key")
  private String key;

  /** The last updated timestamp (in milliseconds) for the secret. */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  public SecretMetadata setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SecretMetadata setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SecretMetadata that = (SecretMetadata) o;
    return Objects.equals(key, that.key)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, lastUpdatedTimestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(SecretMetadata.class)
        .add("key", key)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .toString();
  }
}
