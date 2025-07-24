// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetAccessRequestDestinationsRequest {
  /** */
  @JsonIgnore private String fullName;

  /** */
  @JsonIgnore private String securableType;

  public GetAccessRequestDestinationsRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetAccessRequestDestinationsRequest setSecurableType(String securableType) {
    this.securableType = securableType;
    return this;
  }

  public String getSecurableType() {
    return securableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAccessRequestDestinationsRequest that = (GetAccessRequestDestinationsRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAccessRequestDestinationsRequest.class)
        .add("fullName", fullName)
        .add("securableType", securableType)
        .toString();
  }
}
