// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;

/** The general workspace configurations that are specific to cloud providers. */
public class CloudResourceBucket {
  /** The general workspace configurations that are specific to Google Cloud. */
  @JsonProperty("gcp")
  private GcpProjectContainer gcp;

  public CloudResourceBucket setGcp(GcpProjectContainer gcp) {
    this.gcp = gcp;
    return this;
  }

  public GcpProjectContainer getGcp() {
    return gcp;
  }
}
