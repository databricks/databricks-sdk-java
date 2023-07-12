// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Delete a model version.
 */
@Generated
public class DeleteModelVersionRequest {
  /**
   * Name of the registered model
   */
  @QueryParam("name")
  private String name;
  
  /**
   * Model version number
   */
  @QueryParam("version")
  private String version;
  
  public DeleteModelVersionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
  
  public DeleteModelVersionRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteModelVersionRequest that = (DeleteModelVersionRequest) o;
    return Objects.equals(name, that.name)
    && Objects.equals(version, that.version)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteModelVersionRequest.class)
      .add("name", name)
      .add("version", version).toString();
  }
}
