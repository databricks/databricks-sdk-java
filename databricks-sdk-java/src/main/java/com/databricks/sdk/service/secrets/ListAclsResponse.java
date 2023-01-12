// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListAclsResponse {
    /**
     * The associated ACLs rule applied to principals in the given scope.
     */
    @JsonProperty("items")
    private java.util.List<AclItem> items;
    
    public ListAclsResponse setItems(java.util.List<AclItem> items) {
        this.items = items;
        return this;
    }

    public java.util.List<AclItem> getItems() {
        return items;
    }
    
}
