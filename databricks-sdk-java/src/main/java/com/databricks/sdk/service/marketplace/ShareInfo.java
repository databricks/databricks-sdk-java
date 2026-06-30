// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ShareInfo {
  /** */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("type")
  private ListingShareType typeValue;

  public ShareInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ShareInfo setType(ListingShareType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public ListingShareType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShareInfo that = (ShareInfo) o;
    return Objects.equals(name, that.name) && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(ShareInfo.class).add("name", name).add("typeValue", typeValue).toString();
  }
}
