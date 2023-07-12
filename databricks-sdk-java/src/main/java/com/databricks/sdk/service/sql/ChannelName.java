// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Name of the channel */
@Generated
public enum ChannelName {
  @JsonProperty("CHANNEL_NAME_CURRENT")
  CHANNEL_NAME_CURRENT,

  @JsonProperty("CHANNEL_NAME_CUSTOM")
  CHANNEL_NAME_CUSTOM,

  @JsonProperty("CHANNEL_NAME_PREVIEW")
  CHANNEL_NAME_PREVIEW,

  @JsonProperty("CHANNEL_NAME_PREVIOUS")
  CHANNEL_NAME_PREVIOUS,

  @JsonProperty("CHANNEL_NAME_UNSPECIFIED")
  CHANNEL_NAME_UNSPECIFIED,
}
