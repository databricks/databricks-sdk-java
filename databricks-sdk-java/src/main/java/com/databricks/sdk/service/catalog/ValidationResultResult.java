// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The results of the tested operation. */
@Generated
public enum ValidationResultResult {
  @JsonProperty("FAIL")
  FAIL,

  @JsonProperty("PASS")
  PASS,

  @JsonProperty("SKIP")
  SKIP,
}
