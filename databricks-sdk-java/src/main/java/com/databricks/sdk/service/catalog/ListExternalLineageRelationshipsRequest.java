// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListExternalLineageRelationshipsRequest {
  /** The lineage direction to filter on. */
  @JsonIgnore
  @QueryParam("lineage_direction")
  private LineageDirection lineageDirection;

  /**
   * The object to query external lineage relationships for. Since this field is a query parameter,
   * please flatten the nested fields. For example, if the object is a table, the query parameter
   * should look like: `object_info.table.name=main.sales.customers`
   */
  @JsonIgnore
  @QueryParam("object_info")
  private ExternalLineageObject objectInfo;

  /**
   * Specifies the maximum number of external lineage relationships to return in a single response.
   * The value must be less than or equal to 1000.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Opaque pagination token to go to next page based on previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListExternalLineageRelationshipsRequest setLineageDirection(
      LineageDirection lineageDirection) {
    this.lineageDirection = lineageDirection;
    return this;
  }

  public LineageDirection getLineageDirection() {
    return lineageDirection;
  }

  public ListExternalLineageRelationshipsRequest setObjectInfo(ExternalLineageObject objectInfo) {
    this.objectInfo = objectInfo;
    return this;
  }

  public ExternalLineageObject getObjectInfo() {
    return objectInfo;
  }

  public ListExternalLineageRelationshipsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListExternalLineageRelationshipsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListExternalLineageRelationshipsRequest that = (ListExternalLineageRelationshipsRequest) o;
    return Objects.equals(lineageDirection, that.lineageDirection)
        && Objects.equals(objectInfo, that.objectInfo)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineageDirection, objectInfo, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExternalLineageRelationshipsRequest.class)
        .add("lineageDirection", lineageDirection)
        .add("objectInfo", objectInfo)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
