// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.annotation.QueryParam;

/** Get a share */
public class GetShareRequest {
  /** Query for data to include in the share. */
  @QueryParam("include_shared_data")
  private Boolean includeSharedData;

  /** The name of the share. */
  private String name;

  public GetShareRequest setIncludeSharedData(Boolean includeSharedData) {
    this.includeSharedData = includeSharedData;
    return this;
  }

  public Boolean getIncludeSharedData() {
    return includeSharedData;
  }

  public GetShareRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
}
