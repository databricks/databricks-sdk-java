// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The status of the workspace. For workspace creation, usually it is set to
 * `PROVISIONING` initially. Continue to check the status until the status is
 * `RUNNING`.
 */
public enum WorkspaceStatus{
    BANNED,
    CANCELLING,
    FAILED,
    NOT_PROVISIONED,
    PROVISIONING,
    RUNNING,
    
}