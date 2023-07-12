// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * State of the alert. Possible values are: `unknown` (yet to be evaluated),
 * `triggered` (evaluated and fulfilled trigger conditions), or `ok` (evaluated
 * and did not fulfill trigger conditions).
 */
@Generated
public enum AlertState{
  ok,
  triggered,
  unknown,
  
}