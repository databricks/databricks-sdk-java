// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The pricing tier of the workspace. For pricing tier information, see [AWS
 * Pricing].
 * 
 * [AWS Pricing]: https://databricks.com/product/aws-pricing
 */
public enum PricingTier{
    COMMUNITY_EDITION,
    DEDICATED,
    ENTERPRISE,
    PREMIUM,
    STANDARD,
    UNKNOWN,
    
}