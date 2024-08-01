// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GetRecipientSharePermissionsResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** An array of data share permissions for a recipient. */
  @JsonProperty("permissions_out")
  private Collection<ShareToPrivilegeAssignment> permissionsOut;

  public GetRecipientSharePermissionsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public GetRecipientSharePermissionsResponse setPermissionsOut(
      Collection<ShareToPrivilegeAssignment> permissionsOut) {
    this.permissionsOut = permissionsOut;
    return this;
  }

  public Collection<ShareToPrivilegeAssignment> getPermissionsOut() {
    return permissionsOut;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRecipientSharePermissionsResponse that = (GetRecipientSharePermissionsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(permissionsOut, that.permissionsOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, permissionsOut);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRecipientSharePermissionsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("permissionsOut", permissionsOut)
        .toString();
  }
}
