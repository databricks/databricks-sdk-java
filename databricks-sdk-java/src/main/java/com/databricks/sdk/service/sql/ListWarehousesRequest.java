// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List warehouses
 */
public class ListWarehousesRequest {
    /**
     * Service Principal which will be used to fetch the list of warehouses. If
     * not specified, the user from the session header is used.
     */
    @QueryParam("run_as_user_id")
    private Long runAsUserId;
    
    public ListWarehousesRequest setRunAsUserId(Long runAsUserId) {
        this.runAsUserId = runAsUserId;
        return this;
    }

    public Long getRunAsUserId() {
        return runAsUserId;
    }
    
}
