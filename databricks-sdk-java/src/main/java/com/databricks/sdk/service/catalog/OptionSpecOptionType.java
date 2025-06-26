// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Type of the option, we purposely follow JavaScript types so that the UI can map the options to JS
 * types. https://www.w3schools.com/js/js_datatypes.asp Enum is a special case that it's just string
 * with selections.
 */
@Generated
public enum OptionSpecOptionType {
  OPTION_BIGINT,
  OPTION_BOOLEAN,
  OPTION_ENUM,
  OPTION_MULTILINE_STRING,
  OPTION_NUMBER,
  OPTION_SERVICE_CREDENTIAL,
  OPTION_STRING,
}
