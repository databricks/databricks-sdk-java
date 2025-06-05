// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SecretMetadataPb {
  @JsonProperty("key")
  private String key;

  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  public SecretMetadataPb setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SecretMetadataPb setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
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
    SecretMetadataPb that = (SecretMetadataPb) o;
    return Objects.equals(key, that.key)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, lastUpdatedTimestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(SecretMetadataPb.class)
        .add("key", key)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .toString();
  }
}
