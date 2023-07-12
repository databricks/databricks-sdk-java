// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum KeyUseCase {
  @JsonProperty("MANAGED_SERVICES")
  MANAGED_SERVICES, // Encrypts notebook and secret data in the control plane

  @JsonProperty("STORAGE")
  STORAGE, // Encrypts the workspace's root S3 bucket (root DBFS and system data) and,
  // optionally, cluster EBS volumes.

}
