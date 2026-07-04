// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListSecretsRequest {
  /**
   * The name of the catalog under which to list secrets. Both **catalog_name** and **schema_name**
   * must be specified together.
   */
  @JsonIgnore
  @QueryParam("catalog_name")
  private String catalogName;

  /**
   * Maximum number of secrets to return.
   *
   * <p>- If not specified, at most 1000 secrets are returned. - If set to a value greater than 0,
   * the page length is the minimum of this value and 1000. - If set to 0, the page length is set to
   * 1000. - If set to a value less than 0, an invalid parameter error is returned.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * Opaque pagination token to go to the next page based on previous query. The maximum page length
   * is determined by a server configured value.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * The name of the schema under which to list secrets. Both **catalog_name** and **schema_name**
   * must be specified together.
   */
  @JsonIgnore
  @QueryParam("schema_name")
  private String schemaName;

  public ListSecretsRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListSecretsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListSecretsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListSecretsRequest setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSecretsRequest that = (ListSecretsRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, pageSize, pageToken, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSecretsRequest.class)
        .add("catalogName", catalogName)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("schemaName", schemaName)
        .toString();
  }
}
