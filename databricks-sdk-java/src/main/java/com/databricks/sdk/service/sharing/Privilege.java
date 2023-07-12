// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated
public enum Privilege {
  @JsonProperty("ALL_PRIVILEGES")
  ALL_PRIVILEGES,

  @JsonProperty("CREATE")
  CREATE,

  @JsonProperty("CREATE_CATALOG")
  CREATE_CATALOG,

  @JsonProperty("CREATE_EXTERNAL_LOCATION")
  CREATE_EXTERNAL_LOCATION,

  @JsonProperty("CREATE_EXTERNAL_TABLE")
  CREATE_EXTERNAL_TABLE,

  @JsonProperty("CREATE_FUNCTION")
  CREATE_FUNCTION,

  @JsonProperty("CREATE_MANAGED_STORAGE")
  CREATE_MANAGED_STORAGE,

  @JsonProperty("CREATE_MATERIALIZED_VIEW")
  CREATE_MATERIALIZED_VIEW,

  @JsonProperty("CREATE_PROVIDER")
  CREATE_PROVIDER,

  @JsonProperty("CREATE_RECIPIENT")
  CREATE_RECIPIENT,

  @JsonProperty("CREATE_SCHEMA")
  CREATE_SCHEMA,

  @JsonProperty("CREATE_SHARE")
  CREATE_SHARE,

  @JsonProperty("CREATE_STORAGE_CREDENTIAL")
  CREATE_STORAGE_CREDENTIAL,

  @JsonProperty("CREATE_TABLE")
  CREATE_TABLE,

  @JsonProperty("CREATE_VIEW")
  CREATE_VIEW,

  @JsonProperty("EXECUTE")
  EXECUTE,

  @JsonProperty("MODIFY")
  MODIFY,

  @JsonProperty("READ_FILES")
  READ_FILES,

  @JsonProperty("READ_PRIVATE_FILES")
  READ_PRIVATE_FILES,

  @JsonProperty("REFRESH")
  REFRESH,

  @JsonProperty("SELECT")
  SELECT,

  @JsonProperty("SET_SHARE_PERMISSION")
  SET_SHARE_PERMISSION,

  @JsonProperty("USAGE")
  USAGE,

  @JsonProperty("USE_CATALOG")
  USE_CATALOG,

  @JsonProperty("USE_MARKETPLACE_ASSETS")
  USE_MARKETPLACE_ASSETS,

  @JsonProperty("USE_PROVIDER")
  USE_PROVIDER,

  @JsonProperty("USE_RECIPIENT")
  USE_RECIPIENT,

  @JsonProperty("USE_SCHEMA")
  USE_SCHEMA,

  @JsonProperty("USE_SHARE")
  USE_SHARE,

  @JsonProperty("WRITE_FILES")
  WRITE_FILES,

  @JsonProperty("WRITE_PRIVATE_FILES")
  WRITE_PRIVATE_FILES,
}
