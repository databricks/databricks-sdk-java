// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListServicePrincipalResponsePb {
  @JsonProperty("itemsPerPage")
  private Long itemsPerPage;

  @JsonProperty("Resources")
  private Collection<ServicePrincipal> resources;

  @JsonProperty("schemas")
  private Collection<ListResponseSchema> schemas;

  @JsonProperty("startIndex")
  private Long startIndex;

  @JsonProperty("totalResults")
  private Long totalResults;

  public ListServicePrincipalResponsePb setItemsPerPage(Long itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  public Long getItemsPerPage() {
    return itemsPerPage;
  }

  public ListServicePrincipalResponsePb setResources(Collection<ServicePrincipal> resources) {
    this.resources = resources;
    return this;
  }

  public Collection<ServicePrincipal> getResources() {
    return resources;
  }

  public ListServicePrincipalResponsePb setSchemas(Collection<ListResponseSchema> schemas) {
    this.schemas = schemas;
    return this;
  }

  public Collection<ListResponseSchema> getSchemas() {
    return schemas;
  }

  public ListServicePrincipalResponsePb setStartIndex(Long startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  public Long getStartIndex() {
    return startIndex;
  }

  public ListServicePrincipalResponsePb setTotalResults(Long totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  public Long getTotalResults() {
    return totalResults;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListServicePrincipalResponsePb that = (ListServicePrincipalResponsePb) o;
    return Objects.equals(itemsPerPage, that.itemsPerPage)
        && Objects.equals(resources, that.resources)
        && Objects.equals(schemas, that.schemas)
        && Objects.equals(startIndex, that.startIndex)
        && Objects.equals(totalResults, that.totalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemsPerPage, resources, schemas, startIndex, totalResults);
  }

  @Override
  public String toString() {
    return new ToStringer(ListServicePrincipalResponsePb.class)
        .add("itemsPerPage", itemsPerPage)
        .add("resources", resources)
        .add("schemas", schemas)
        .add("startIndex", startIndex)
        .add("totalResults", totalResults)
        .toString();
  }
}
