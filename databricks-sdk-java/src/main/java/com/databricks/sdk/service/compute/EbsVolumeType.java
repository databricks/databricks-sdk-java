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
 * The type of EBS volumes that will be launched with this cluster.
 */
@Generated
public enum EbsVolumeType{
  GENERAL_PURPOSE_SSD,
  THROUGHPUT_OPTIMIZED_HDD,
  
}