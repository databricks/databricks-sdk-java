// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Response containing the popped item. */
@Generated
public class PopSessionItemResponse {
  /** Removed item, if any. */
  @JsonProperty("item")
  private SessionItem item;

  public PopSessionItemResponse setItem(SessionItem item) {
    this.item = item;
    return this;
  }

  public SessionItem getItem() {
    return item;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PopSessionItemResponse that = (PopSessionItemResponse) o;
    return Objects.equals(item, that.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item);
  }

  @Override
  public String toString() {
    return new ToStringer(PopSessionItemResponse.class).add("item", item).toString();
  }
}
