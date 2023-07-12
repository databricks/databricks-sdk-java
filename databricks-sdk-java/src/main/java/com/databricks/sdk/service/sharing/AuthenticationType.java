// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The delta sharing authentication type. */
@Generated
public enum AuthenticationType {
  @JsonProperty("DATABRICKS")
  DATABRICKS,

  @JsonProperty("TOKEN")
  TOKEN,
}
