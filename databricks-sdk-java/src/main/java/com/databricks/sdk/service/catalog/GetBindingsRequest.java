// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get securable workspace bindings */
@Generated
public class GetBindingsRequest {
  /** The name of the securable. */
  private String securableName;

  /** The type of the securable. */
  private String securableType;

  public GetBindingsRequest setSecurableName(String securableName) {
    this.securableName = securableName;
    return this;
  }

  public String getSecurableName() {
    return securableName;
  }

  public GetBindingsRequest setSecurableType(String securableType) {
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
    GetBindingsRequest that = (GetBindingsRequest) o;
    return Objects.equals(securableName, that.securableName)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securableName, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetBindingsRequest.class)
        .add("securableName", securableName)
        .add("securableType", securableType)
        .toString();
  }
}
