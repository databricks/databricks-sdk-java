// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>SparkNodeAwsAttributes class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SparkNodeAwsAttributes {
  /** Whether this node is on an Amazon spot instance. */
  @JsonProperty("is_spot")
  private Boolean isSpot;

  /**
   * <p>Setter for the field <code>isSpot</code>.</p>
   *
   * @param isSpot a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.SparkNodeAwsAttributes} object
   */
  public SparkNodeAwsAttributes setIsSpot(Boolean isSpot) {
    this.isSpot = isSpot;
    return this;
  }

  /**
   * <p>Getter for the field <code>isSpot</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsSpot() {
    return isSpot;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparkNodeAwsAttributes that = (SparkNodeAwsAttributes) o;
    return Objects.equals(isSpot, that.isSpot);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(isSpot);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SparkNodeAwsAttributes.class).add("isSpot", isSpot).toString();
  }
}
