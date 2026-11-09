// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Physical database size, including indexes and bloat; not a dump archive size estimate. */
@Generated
public class DatabaseSizeDetails {
  /** Size reported by pg_database_size, in bytes. Zero is a measured empty size. */
  @JsonProperty("size_bytes")
  private Long sizeBytes;

  public DatabaseSizeDetails setSizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  public Long getSizeBytes() {
    return sizeBytes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseSizeDetails that = (DatabaseSizeDetails) o;
    return Objects.equals(sizeBytes, that.sizeBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sizeBytes);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseSizeDetails.class).add("sizeBytes", sizeBytes).toString();
  }
}
