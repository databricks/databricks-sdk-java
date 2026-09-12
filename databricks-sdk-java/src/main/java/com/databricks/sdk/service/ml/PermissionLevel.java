// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * Permission level of the requesting user on the object. For what is allowed at each level, see
 * [MLflow Model permissions].
 *
 * <p>[MLflow Model permissions]:
 * https://docs.databricks.com/aws/en/machine-learning/manage-model-lifecycle/workspace-model-registry#permissions
 */
@Generated
public enum PermissionLevel {
  CAN_CREATE_REGISTERED_MODEL,
  CAN_EDIT,
  CAN_MANAGE,
  CAN_MANAGE_PRODUCTION_VERSIONS,
  CAN_MANAGE_STAGING_VERSIONS,
  CAN_READ,
}
