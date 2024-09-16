// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get all budgets */
@Generated
public class ListBudgetConfigurationsRequest {
  /**
   * A page token received from a previous get all budget configurations call. This token can be
   * used to retrieve the subsequent page. Requests first page if absent.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListBudgetConfigurationsRequest setPageToken(String pageToken) {
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
    ListBudgetConfigurationsRequest that = (ListBudgetConfigurationsRequest) o;
    return Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListBudgetConfigurationsRequest.class)
        .add("pageToken", pageToken)
        .toString();
  }
}
