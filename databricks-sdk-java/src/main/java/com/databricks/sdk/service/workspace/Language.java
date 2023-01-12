// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The language of the object. This value is set only if the object type is
 * `NOTEBOOK`.
 */
public enum Language{
    PYTHON,
    R,
    SCALA,
    SQL,
    
}