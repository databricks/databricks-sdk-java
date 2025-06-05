// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateQueryRequestPb {
  @JsonProperty("auto_resolve_display_name")
  private Boolean autoResolveDisplayName;

  @JsonProperty("query")
  private CreateQueryRequestQuery query;

  public CreateQueryRequestPb setAutoResolveDisplayName(Boolean autoResolveDisplayName) {
    this.autoResolveDisplayName = autoResolveDisplayName;
    return this;
  }

  public Boolean getAutoResolveDisplayName() {
    return autoResolveDisplayName;
  }

  public CreateQueryRequestPb setQuery(CreateQueryRequestQuery query) {
    this.query = query;
    return this;
  }

  public CreateQueryRequestQuery getQuery() {
    return query;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateQueryRequestPb that = (CreateQueryRequestPb) o;
    return Objects.equals(autoResolveDisplayName, that.autoResolveDisplayName)
        && Objects.equals(query, that.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoResolveDisplayName, query);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateQueryRequestPb.class)
        .add("autoResolveDisplayName", autoResolveDisplayName)
        .add("query", query)
        .toString();
  }
}
