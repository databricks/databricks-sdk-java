// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Decides which runtime engine to be use, e.g. Standard vs. Photon. If
 * unspecified, the runtime engine is inferred from spark_version.
 */
@Generated
public enum RuntimeEngine{
  NULL,
  PHOTON,
  STANDARD,
  
}