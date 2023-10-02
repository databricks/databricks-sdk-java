// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;

/**
 * The status of this network configuration object in terms of its use in a workspace: *
 * `UNATTACHED`: Unattached. * `VALID`: Valid. * `BROKEN`: Broken. * `WARNED`: Warned.
 */
@Generated
public enum VpcStatus {
  BROKEN, // Broken.
  UNATTACHED, // Unattached.
  VALID, // Valid.
  WARNED, // Warned.
}
