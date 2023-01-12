// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.repos;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a repo
 */
@Generated("databricks-sdk-generator")
public class Delete {
    /**
     * The ID for the corresponding repo to access.
     */
    
    private Long repoId;
    
    public Delete setRepoId(Long repoId) {
        this.repoId = repoId;
        return this;
    }

    public Long getRepoId() {
        return repoId;
    }
    
}
