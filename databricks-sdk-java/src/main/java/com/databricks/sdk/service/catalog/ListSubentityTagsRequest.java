// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get tags for a subentity */
@Generated
public class ListSubentityTagsRequest {
  /** The fully qualified name of the unity catalog securable entity. */
  private String fullName;

  /** The type of the unity catalog securable entity. */
  private ListSecurableType securableType;

  /** The name of subentity associated with the securable entity */
  private String subentityName;

  public ListSubentityTagsRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public ListSubentityTagsRequest setSecurableType(ListSecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public ListSecurableType getSecurableType() {
    return securableType;
  }

  public ListSubentityTagsRequest setSubentityName(String subentityName) {
    this.subentityName = subentityName;
    return this;
  }

  public String getSubentityName() {
    return subentityName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSubentityTagsRequest that = (ListSubentityTagsRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(securableType, that.securableType)
        && Objects.equals(subentityName, that.subentityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, securableType, subentityName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSubentityTagsRequest.class)
        .add("fullName", fullName)
        .add("securableType", securableType)
        .add("subentityName", subentityName)
        .toString();
  }
}
