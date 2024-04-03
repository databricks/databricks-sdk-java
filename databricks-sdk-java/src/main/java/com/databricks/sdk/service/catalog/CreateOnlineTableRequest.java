// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Online Table information. */
@Generated
public class CreateOnlineTableRequest {
  /** Full three-part (catalog, schema, table) name of the table. */
  @JsonProperty("name")
  private String name;

  /** Specification of the online table. */
  @JsonProperty("spec")
  private OnlineTableSpec spec;

  public CreateOnlineTableRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateOnlineTableRequest setSpec(OnlineTableSpec spec) {
    this.spec = spec;
    return this;
  }

  public OnlineTableSpec getSpec() {
    return spec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateOnlineTableRequest that = (CreateOnlineTableRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(spec, that.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, spec);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateOnlineTableRequest.class)
        .add("name", name)
        .add("spec", spec)
        .toString();
  }
}
