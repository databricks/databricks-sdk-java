// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Generic definition of a securable, which is uniquely defined in a metastore by its type and full
 * name.
 */
@Generated
public class Securable {
  /** Required. The full name of the catalog/schema/table. Optional if resource_name is present. */
  @JsonProperty("full_name")
  private String fullName;

  /**
   * Optional. The name of the Share object that contains the securable when the securable is
   * getting shared in D2D Delta Sharing.
   */
  @JsonProperty("provider_share")
  private String providerShare;

  /**
   * Required. The type of securable (catalog/schema/table). Optional if resource_name is present.
   */
  @JsonProperty("type")
  private SecurableType typeValue;

  public Securable setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public Securable setProviderShare(String providerShare) {
    this.providerShare = providerShare;
    return this;
  }

  public String getProviderShare() {
    return providerShare;
  }

  public Securable setType(SecurableType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public SecurableType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Securable that = (Securable) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(providerShare, that.providerShare)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, providerShare, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(Securable.class)
        .add("fullName", fullName)
        .add("providerShare", providerShare)
        .add("typeValue", typeValue)
        .toString();
  }
}
