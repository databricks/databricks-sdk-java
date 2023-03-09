// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.repos;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class UpdateRepo {
    /**
     * Branch that the local version of the repo is checked out to.
     */
    @JsonProperty("branch")
    private String branch;
    
    /**
     * The ID for the corresponding repo to access.
     */
    
    private Long repoId;
    
    /**
     * If specified, update the sparse checkout settings. The update will fail
     * if sparse checkout is not enabled for the repo.
     */
    @JsonProperty("sparse_checkout")
    private SparseCheckoutUpdate sparseCheckout;
    
    /**
     * Tag that the local version of the repo is checked out to. Updating the
     * repo to a tag puts the repo in a detached HEAD state. Before committing
     * new changes, you must update the repo to a branch instead of the detached
     * HEAD.
     */
    @JsonProperty("tag")
    private String tag;
    
    public UpdateRepo setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    public String getBranch() {
        return branch;
    }
    
    public UpdateRepo setRepoId(Long repoId) {
        this.repoId = repoId;
        return this;
    }

    public Long getRepoId() {
        return repoId;
    }
    
    public UpdateRepo setSparseCheckout(SparseCheckoutUpdate sparseCheckout) {
        this.sparseCheckout = sparseCheckout;
        return this;
    }

    public SparseCheckoutUpdate getSparseCheckout() {
        return sparseCheckout;
    }
    
    public UpdateRepo setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public String getTag() {
        return tag;
    }
    
}
