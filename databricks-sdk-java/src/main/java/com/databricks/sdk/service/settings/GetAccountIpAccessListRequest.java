// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get IP access list */
@Generated
public class GetAccountIpAccessListRequest {
  /** The ID for the corresponding IP access list. */
  private String ipAccessListId;

  public GetAccountIpAccessListRequest setIpAccessListId(String ipAccessListId) {
    this.ipAccessListId = ipAccessListId;
    return this;
  }

  public String getIpAccessListId() {
    return ipAccessListId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAccountIpAccessListRequest that = (GetAccountIpAccessListRequest) o;
    return Objects.equals(ipAccessListId, that.ipAccessListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAccessListId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAccountIpAccessListRequest.class)
        .add("ipAccessListId", ipAccessListId)
        .toString();
  }
}
