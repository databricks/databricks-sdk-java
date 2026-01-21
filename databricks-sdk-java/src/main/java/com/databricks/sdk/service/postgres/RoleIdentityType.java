// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;

/**
 * The type of the Databricks managed identity that this Role represents. Leave empty if you wish to
 * create a regular Postgres role not associated with a Databricks identity.
 */
@Generated
public enum RoleIdentityType {
  GROUP,
  SERVICE_PRINCIPAL,
  USER,
}
