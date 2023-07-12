// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class DbfsStorageInfo {
  /**
   * dbfs destination, e.g. `dbfs:/my/path`
   */
  @JsonProperty("destination")
  private String destination;
  
  public DbfsStorageInfo setDestination(String destination) {
    this.destination = destination;
    return this;
  }

  public String getDestination() {
    return destination;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbfsStorageInfo that = (DbfsStorageInfo) o;
    return Objects.equals(destination, that.destination)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination);
  }

  @Override
  public String toString() {
    return new ToStringer(DbfsStorageInfo.class)
      .add("destination", destination).toString();
  }
}
