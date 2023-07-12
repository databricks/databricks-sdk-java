// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type of the object from which the flag was inherited. If there was no inheritance, this field
 * is left blank.
 */
@Generated
public enum EffectiveAutoMaintenanceFlagInheritedFromType {
  @JsonProperty("CATALOG")
  CATALOG,

  @JsonProperty("SCHEMA")
  SCHEMA,
}
