// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;

/**
 * The types of secret scope backends in the Secret Manager. Azure KeyVault backed secret scopes
 * will be supported in a later release.
 */
@Generated
public enum ScopeBackendType {
  AZURE_KEYVAULT,
  DATABRICKS,
}
