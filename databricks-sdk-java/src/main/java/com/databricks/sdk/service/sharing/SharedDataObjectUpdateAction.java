// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** One of: **ADD**, **REMOVE**, **UPDATE**. */
@Generated
public enum SharedDataObjectUpdateAction {
  @JsonProperty("ADD")
  ADD,

  @JsonProperty("REMOVE")
  REMOVE,

  @JsonProperty("UPDATE")
  UPDATE,
}
