// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>DbfsStorageInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DbfsStorageInfo {
  /** dbfs destination, e.g. `dbfs:/my/path` */
  @JsonProperty("destination")
  private String destination;

  /**
   * <p>Setter for the field <code>destination</code>.</p>
   *
   * @param destination a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.DbfsStorageInfo} object
   */
  public DbfsStorageInfo setDestination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * <p>Getter for the field <code>destination</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDestination() {
    return destination;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbfsStorageInfo that = (DbfsStorageInfo) o;
    return Objects.equals(destination, that.destination);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(destination);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DbfsStorageInfo.class).add("destination", destination).toString();
  }
}
