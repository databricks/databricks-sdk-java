// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;

/**
 * Possible values are: * `MANAGED_SERVICES`: Encrypts notebook and secret data in the control plane
 * * `STORAGE`: Encrypts the workspace's root S3 bucket (root DBFS and system data) and, optionally,
 * cluster EBS volumes.
 */
@Generated
public enum KeyUseCase {
  MANAGED_SERVICES, // Encrypts notebook and secret data in the control plane
  STORAGE, // Encrypts the workspace's root S3 bucket (root DBFS and system data) and,
  // optionally, cluster EBS volumes.

}
