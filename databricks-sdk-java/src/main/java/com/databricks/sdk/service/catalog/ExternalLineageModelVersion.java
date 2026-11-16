// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A version of a Unity Catalog registered model at one end of an external lineage relationship. */
@Generated
public class ExternalLineageModelVersion {
  /** Full name of the registered model, in the form `catalog.schema.model`. */
  @JsonProperty("name")
  @QueryParam("name")
  private String name;

  /** Version number of the model, as a string. */
  @JsonProperty("version")
  @QueryParam("version")
  private String version;

  public ExternalLineageModelVersion setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ExternalLineageModelVersion setVersion(String version) {
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
    ExternalLineageModelVersion that = (ExternalLineageModelVersion) o;
    return Objects.equals(name, that.name) && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalLineageModelVersion.class)
        .add("name", name)
        .add("version", version)
        .toString();
  }
}
