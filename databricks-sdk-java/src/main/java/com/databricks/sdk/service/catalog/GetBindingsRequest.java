// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get securable workspace bindings */
@Generated
public class GetBindingsRequest {
  /**
   * Maximum number of workspace bindings to return. - When set to 0, the page length is set to a
   * server configured value (recommended); - When set to a value greater than 0, the page length is
   * the minimum of this value and a server configured value; - When set to a value less than 0, an
   * invalid parameter error is returned; - If not set, all the workspace bindings are returned (not
   * recommended).
   */
  @QueryParam("max_results")
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  @QueryParam("page_token")
  private String pageToken;

  /** The name of the securable. */
  private String securableName;

  /** The type of the securable to bind to a workspace. */
  private GetBindingsSecurableType securableType;

  public GetBindingsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public GetBindingsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public GetBindingsRequest setSecurableName(String securableName) {
    this.securableName = securableName;
    return this;
  }

  public String getSecurableName() {
    return securableName;
  }

  public GetBindingsRequest setSecurableType(GetBindingsSecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public GetBindingsSecurableType getSecurableType() {
    return securableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetBindingsRequest that = (GetBindingsRequest) o;
    return Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(securableName, that.securableName)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken, securableName, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetBindingsRequest.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("securableName", securableName)
        .add("securableType", securableType)
        .toString();
  }
}
