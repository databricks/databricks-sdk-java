// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListMetastoresResponse {
  /** An array of metastore information objects. */
  @JsonProperty("metastores")
  private Collection<MetastoreInfo> metastores;

  public ListMetastoresResponse setMetastores(Collection<MetastoreInfo> metastores) {
    this.metastores = metastores;
    return this;
  }

  public Collection<MetastoreInfo> getMetastores() {
    return metastores;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListMetastoresResponse that = (ListMetastoresResponse) o;
    return Objects.equals(metastores, that.metastores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastores);
  }

  @Override
  public String toString() {
    return new ToStringer(ListMetastoresResponse.class).add("metastores", metastores).toString();
  }
}
