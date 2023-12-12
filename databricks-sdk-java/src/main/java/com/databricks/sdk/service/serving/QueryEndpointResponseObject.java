// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type of object returned by the __external/foundation model__ serving endpoint, one of
 * [text_completion, chat.completion, list (of embeddings)].
 */
@Generated
public enum QueryEndpointResponseObject {
  @JsonProperty("chat.completion")
  CHAT_COMPLETION,

  @JsonProperty("list")
  LIST,

  @JsonProperty("text_completion")
  TEXT_COMPLETION,
}
