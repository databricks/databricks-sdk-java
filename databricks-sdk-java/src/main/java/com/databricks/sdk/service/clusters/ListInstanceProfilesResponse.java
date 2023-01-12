// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListInstanceProfilesResponse {
    /**
     * A list of instance profiles that the user can access.
     */
    @JsonProperty("instance_profiles")
    private java.util.List<InstanceProfile> instanceProfiles;
    
    public ListInstanceProfilesResponse setInstanceProfiles(java.util.List<InstanceProfile> instanceProfiles) {
        this.instanceProfiles = instanceProfiles;
        return this;
    }

    public java.util.List<InstanceProfile> getInstanceProfiles() {
        return instanceProfiles;
    }
    
}
