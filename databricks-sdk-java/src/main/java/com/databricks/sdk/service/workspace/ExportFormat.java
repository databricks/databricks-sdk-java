// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This specifies the format of the file to be imported. By default, this is
 * `SOURCE`. However it may be one of: `SOURCE`, `HTML`, `JUPYTER`, `DBC`. The
 * value is case sensitive.
 */
public enum ExportFormat{
    DBC,
    HTML,
    JUPYTER,
    R_MARKDOWN,
    SOURCE,
    
}