// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class GetRecipientSharePermissionsResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("permissions_out")
  private Collection<ShareToPrivilegeAssignment> permissionsOut;

  public GetRecipientSharePermissionsResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public GetRecipientSharePermissionsResponsePb setPermissionsOut(
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
    GetRecipientSharePermissionsResponsePb that = (GetRecipientSharePermissionsResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(permissionsOut, that.permissionsOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, permissionsOut);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRecipientSharePermissionsResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("permissionsOut", permissionsOut)
        .toString();
  }
}
