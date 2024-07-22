// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated
public enum UpdateBindingsSecurableType {
  @JsonProperty("catalog")
  CATALOG,

  @JsonProperty("external_location")
  EXTERNAL_LOCATION,

  @JsonProperty("storage_credential")
  STORAGE_CREDENTIAL,
}
