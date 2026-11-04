// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDatasourceRequest {
  /** */
  @JsonProperty("datasource")
  private Datasource datasource;

  public CreateDatasourceRequest setDatasource(Datasource datasource) {
    this.datasource = datasource;
    return this;
  }

  public Datasource getDatasource() {
    return datasource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDatasourceRequest that = (CreateDatasourceRequest) o;
    return Objects.equals(datasource, that.datasource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasource);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDatasourceRequest.class).add("datasource", datasource).toString();
  }
}
