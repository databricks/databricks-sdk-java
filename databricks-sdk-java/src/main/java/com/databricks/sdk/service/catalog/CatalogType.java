// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The type of the catalog. */
@Generated
public enum CatalogType {
  @JsonProperty("DELTASHARING_CATALOG")
  DELTASHARING_CATALOG,

  @JsonProperty("MANAGED_CATALOG")
  MANAGED_CATALOG,

  @JsonProperty("SYSTEM_CATALOG")
  SYSTEM_CATALOG,
}
