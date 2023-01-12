// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The AWS resource associated with this error: credentials, VPC, subnet,
 * security group, or network ACL.
 */
public enum ErrorType{
    credentials,
    networkAcl,
    securityGroup,
    subnet,
    vpc,
    
}