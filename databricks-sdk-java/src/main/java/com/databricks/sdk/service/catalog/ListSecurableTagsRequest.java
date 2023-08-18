// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get tags for a securable */
@Generated
public class ListSecurableTagsRequest {
  /** The fully qualified name of the unity catalog securable entity. */
  private String fullName;

  /** The type of the unity catalog securable entity. */
  private ListSecurableType securableType;

  public ListSecurableTagsRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public ListSecurableTagsRequest setSecurableType(ListSecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public ListSecurableType getSecurableType() {
    return securableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSecurableTagsRequest that = (ListSecurableTagsRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSecurableTagsRequest.class)
        .add("fullName", fullName)
        .add("securableType", securableType)
        .toString();
  }
}
