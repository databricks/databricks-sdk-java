// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Read-only state of the remote repository at the time the job was run. This
 * field is only included on job runs.
 */
@Generated("databricks-sdk-generator")
public class GitSnapshot {
    /**
     * Commit that was used to execute the run. If git_branch was specified,
     * this points to the HEAD of the branch at the time of the run; if git_tag
     * was specified, this points to the commit the tag points to.
     */
    @JsonProperty("used_commit")
    private String usedCommit;
    
    public GitSnapshot setUsedCommit(String usedCommit) {
        this.usedCommit = usedCommit;
        return this;
    }

    public String getUsedCommit() {
        return usedCommit;
    }
    
}
