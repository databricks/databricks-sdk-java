// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SparkNodeAwsAttributes {
  /** Whether this node is on an Amazon spot instance. */
  @JsonProperty("is_spot")
  private Boolean isSpot;

  public SparkNodeAwsAttributes setIsSpot(Boolean isSpot) {
    this.isSpot = isSpot;
    return this;
  }

  public Boolean getIsSpot() {
    return isSpot;
  }
}
