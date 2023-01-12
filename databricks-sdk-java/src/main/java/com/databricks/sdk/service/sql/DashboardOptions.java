// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class DashboardOptions {
    /**
     * The timestamp when this dashboard was moved to trash. Only present when
     * the `is_archived` property is `true`. Trashed items are deleted after
     * thirty days.
     */
    @JsonProperty("moved_to_trash_at")
    private String movedToTrashAt;
    
    public DashboardOptions setMovedToTrashAt(String movedToTrashAt) {
        this.movedToTrashAt = movedToTrashAt;
        return this;
    }

    public String getMovedToTrashAt() {
        return movedToTrashAt;
    }
    
}
