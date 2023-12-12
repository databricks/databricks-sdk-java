// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The role of the message. One of [system, user, assistant]. */
@Generated
public enum ChatMessageRole {
  @JsonProperty("assistant")
  ASSISTANT,

  @JsonProperty("system")
  SYSTEM,

  @JsonProperty("user")
  USER,
}
