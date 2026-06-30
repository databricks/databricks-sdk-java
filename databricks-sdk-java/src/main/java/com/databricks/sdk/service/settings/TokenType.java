// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/** The type of token request. As of now, only `AZURE_ACTIVE_DIRECTORY_TOKEN` is supported. */
@Generated
public enum TokenType {
  ARCLIGHT_AZURE_EXCHANGE_TOKEN,
  ARCLIGHT_AZURE_EXCHANGE_TOKEN_WITH_USER_DELEGATION_KEY,
  ARCLIGHT_MULTI_TENANT_AZURE_EXCHANGE_TOKEN,
  ARCLIGHT_MULTI_TENANT_AZURE_EXCHANGE_TOKEN_WITH_USER_DELEGATION_KEY,
  AZURE_ACTIVE_DIRECTORY_TOKEN,
}
