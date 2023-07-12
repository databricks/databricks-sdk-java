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
 * Status of installing the library on the cluster.
 */
@Generated
public enum LibraryFullStatusStatus{
  FAILED,
  INSTALLED,
  INSTALLING,
  PENDING,
  RESOLVING,
  SKIPPED,
  UNINSTALL_ON_RESTART,
  
}