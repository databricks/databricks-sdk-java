// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Whether to enable or disable sharing of data history. If not specified, the default is
 * **DISABLED**.
 */
@Generated
public enum SharedDataObjectHistoryDataSharingStatus {
  @JsonProperty("DISABLED")
  DISABLED,

  @JsonProperty("ENABLED")
  ENABLED,
}
