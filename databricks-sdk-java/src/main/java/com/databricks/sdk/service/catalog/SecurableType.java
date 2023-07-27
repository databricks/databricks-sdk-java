// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The type of Unity Catalog securable */
@Generated
public enum SecurableType {
  @JsonProperty("catalog")
  CATALOG,

  @JsonProperty("connection")
  CONNECTION,

  @JsonProperty("external_location")
  EXTERNAL_LOCATION,

  @JsonProperty("function")
  FUNCTION,

  @JsonProperty("metastore")
  METASTORE,

  @JsonProperty("pipeline")
  PIPELINE,

  @JsonProperty("provider")
  PROVIDER,

  @JsonProperty("recipient")
  RECIPIENT,

  @JsonProperty("schema")
  SCHEMA,

  @JsonProperty("share")
  SHARE,

  @JsonProperty("storage_credential")
  STORAGE_CREDENTIAL,

  @JsonProperty("table")
  TABLE,
}
