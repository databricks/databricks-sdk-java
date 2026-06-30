// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;

/** How the role is authenticated when connecting to Postgres. */
@Generated
public enum RoleAuthMethod {
  LAKEBASE_OAUTH_V1,
  NO_LOGIN,
  PG_PASSWORD_SCRAM_SHA_256,
}
