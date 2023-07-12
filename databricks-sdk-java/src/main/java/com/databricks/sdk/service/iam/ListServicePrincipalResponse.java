// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class ListServicePrincipalResponse {
  /**
   * Total results returned in the response.
   */
  @JsonProperty("itemsPerPage")
  private Long itemsPerPage;
  
  /**
   * User objects returned in the response.
   */
  @JsonProperty("Resources")
  private Collection<ServicePrincipal> resources;
  
  /**
   * Starting index of all the results that matched the request filters. First
   * item is number 1.
   */
  @JsonProperty("startIndex")
  private Long startIndex;
  
  /**
   * Total results that match the request filters.
   */
  @JsonProperty("totalResults")
  private Long totalResults;
  
  public ListServicePrincipalResponse setItemsPerPage(Long itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  public Long getItemsPerPage() {
    return itemsPerPage;
  }
  
  public ListServicePrincipalResponse setResources(Collection<ServicePrincipal> resources) {
    this.resources = resources;
    return this;
  }

  public Collection<ServicePrincipal> getResources() {
    return resources;
  }
  
  public ListServicePrincipalResponse setStartIndex(Long startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  public Long getStartIndex() {
    return startIndex;
  }
  
  public ListServicePrincipalResponse setTotalResults(Long totalResults) {
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
    ListServicePrincipalResponse that = (ListServicePrincipalResponse) o;
    return Objects.equals(itemsPerPage, that.itemsPerPage)
    && Objects.equals(resources, that.resources)
    && Objects.equals(startIndex, that.startIndex)
    && Objects.equals(totalResults, that.totalResults)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemsPerPage, resources, startIndex, totalResults);
  }

  @Override
  public String toString() {
    return new ToStringer(ListServicePrincipalResponse.class)
      .add("itemsPerPage", itemsPerPage)
      .add("resources", resources)
      .add("startIndex", startIndex)
      .add("totalResults", totalResults).toString();
  }
}
