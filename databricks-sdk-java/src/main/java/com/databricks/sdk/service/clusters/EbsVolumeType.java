// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type of EBS volumes that will be launched with this cluster.
 */
public enum EbsVolumeType{
    GENERAL_PURPOSE_SSD,
    THROUGHPUT_OPTIMIZED_HDD,
    
}