// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The order to list events in; either "ASC" or "DESC". Defaults to "DESC". */
@Generated
public enum GetEventsOrder {
  @JsonProperty("ASC")
  ASC,

  @JsonProperty("DESC")
  DESC,
}
