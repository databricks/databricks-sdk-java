// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for ListOperations. */
@Generated
public class ListOperationsResponse {
  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The resource operations under the specified version. */
  @JsonProperty("operations")
  private Collection<Operation> operations;

  public ListOperationsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListOperationsResponse setOperations(Collection<Operation> operations) {
    this.operations = operations;
    return this;
  }

  public Collection<Operation> getOperations() {
    return operations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListOperationsResponse that = (ListOperationsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(operations, that.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, operations);
  }

  @Override
  public String toString() {
    return new ToStringer(ListOperationsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("operations", operations)
        .toString();
  }
}
