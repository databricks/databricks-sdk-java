// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ipaccesslists;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This describes an enum
 */
public enum ListType{
    ALLOW,// An allow list. Include this IP or range.
    BLOCK,// A block list. Exclude this IP or range. IP addresses in the block list are
// excluded even if they are included in an allow list.",
    
}