// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusterpolicies;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get a cluster policy
 */
public class List {
    /**
     * The cluster policy attribute to sort by. * `POLICY_CREATION_TIME` - Sort
     * result list by policy creation time. * `POLICY_NAME` - Sort result list
     * by policy name.
     */
    @QueryParam("sort_column")
    private ListSortColumn sortColumn;
    
    /**
     * The order in which the policies get listed. * `DESC` - Sort result list
     * in descending order. * `ASC` - Sort result list in ascending order.
     */
    @QueryParam("sort_order")
    private ListSortOrder sortOrder;
    
    public List setSortColumn(ListSortColumn sortColumn) {
        this.sortColumn = sortColumn;
        return this;
    }

    public ListSortColumn getSortColumn() {
        return sortColumn;
    }
    
    public List setSortOrder(ListSortOrder sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public ListSortOrder getSortOrder() {
        return sortOrder;
    }
    
}
