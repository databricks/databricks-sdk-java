// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Attributes specific to AWS for a Spark node. */
@Generated
class SparkNodeAwsAttributesPb {
  @JsonProperty("is_spot")
  private Boolean isSpot;

  public SparkNodeAwsAttributesPb setIsSpot(Boolean isSpot) {
    this.isSpot = isSpot;
    return this;
  }

  public Boolean getIsSpot() {
    return isSpot;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparkNodeAwsAttributesPb that = (SparkNodeAwsAttributesPb) o;
    return Objects.equals(isSpot, that.isSpot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSpot);
  }

  @Override
  public String toString() {
    return new ToStringer(SparkNodeAwsAttributesPb.class).add("isSpot", isSpot).toString();
  }
}
