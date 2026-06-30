// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated
public enum ResultType {
  @JsonProperty("error")
  ERROR,

  @JsonProperty("image")
  IMAGE,

  @JsonProperty("images")
  IMAGES,

  @JsonProperty("table")
  TABLE,

  @JsonProperty("text")
  TEXT,
}
