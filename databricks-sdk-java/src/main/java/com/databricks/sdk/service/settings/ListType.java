// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum ListType {
  @JsonProperty("ALLOW")
  ALLOW, // An allow list. Include this IP or range.

  @JsonProperty("BLOCK")
  BLOCK, // A block list. Exclude this IP or range. IP addresses in the block list are
  // excluded even if they are included in an allow list.

}
