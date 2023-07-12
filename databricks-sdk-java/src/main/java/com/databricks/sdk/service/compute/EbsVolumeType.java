// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The type of EBS volumes that will be launched with this cluster. */
@Generated
public enum EbsVolumeType {
  @JsonProperty("GENERAL_PURPOSE_SSD")
  GENERAL_PURPOSE_SSD,

  @JsonProperty("THROUGHPUT_OPTIMIZED_HDD")
  THROUGHPUT_OPTIMIZED_HDD,
}
