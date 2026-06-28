// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * During the OAuth flow, specifies which stage the option should be displayed in the UI.
 * OAUTH_STAGE_UNSPECIFIED is the default value for options unrelated to the OAuth flow.
 * BEFORE_AUTHORIZATION_CODE corresponds to options necessary to initiate the OAuth process.
 * BEFORE_ACCESS_TOKEN corresponds to options that are necessary to create a foreign connection, but
 * that should be displayed after the authorization code has already been received.
 */
@Generated
public enum OptionSpecOauthStage {
  BEFORE_ACCESS_TOKEN,
  BEFORE_AUTHORIZATION_CODE,
}
