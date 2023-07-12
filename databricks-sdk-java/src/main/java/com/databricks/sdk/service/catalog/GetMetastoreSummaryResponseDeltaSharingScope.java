// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The scope of Delta Sharing enabled for the metastore. */
@Generated
public enum GetMetastoreSummaryResponseDeltaSharingScope {
  @JsonProperty("INTERNAL")
  INTERNAL,

  @JsonProperty("INTERNAL_AND_EXTERNAL")
  INTERNAL_AND_EXTERNAL,
}
