// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum ViewsToExport {
  @JsonProperty("ALL")
  ALL, // All views of the notebook.

  @JsonProperty("CODE")
  CODE, // Code view of the notebook.

  @JsonProperty("DASHBOARDS")
  DASHBOARDS, // All dashboard views of the notebook.
}
