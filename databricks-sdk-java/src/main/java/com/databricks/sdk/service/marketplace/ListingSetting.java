// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ListingSetting {
  /** */
  @JsonProperty("visibility")
  private Visibility visibility;

  public ListingSetting setVisibility(Visibility visibility) {
    this.visibility = visibility;
    return this;
  }

  public Visibility getVisibility() {
    return visibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListingSetting that = (ListingSetting) o;
    return Objects.equals(visibility, that.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visibility);
  }

  @Override
  public String toString() {
    return new ToStringer(ListingSetting.class).add("visibility", visibility).toString();
  }
}
