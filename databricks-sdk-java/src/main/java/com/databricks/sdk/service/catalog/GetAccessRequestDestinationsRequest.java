// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetAccessRequestDestinationsRequest {
  /**
   * The full name of the securable: the names of its parents followed by its own name, separated by
   * dots, for example `main.sales.orders` for a table.
   */
  @JsonIgnore private String fullName;

  /**
   * The type of the securable. Matching is case-insensitive, and hyphens may replace underscores in
   * multi-word types.
   */
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
