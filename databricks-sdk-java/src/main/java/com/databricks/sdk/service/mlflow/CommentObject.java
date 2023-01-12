// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Comment details.
 */
@Generated("databricks-sdk-generator")
public class CommentObject {
    /**
     * Array of actions on the activity allowed for the current viewer.
     */
    @JsonProperty("available_actions")
    private java.util.List<CommentActivityAction> availableActions;
    
    /**
     * User-provided comment on the action.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Creation time of the object, as a Unix timestamp in milliseconds.
     */
    @JsonProperty("creation_timestamp")
    private Long creationTimestamp;
    
    /**
     * Time of the object at last update, as a Unix timestamp in milliseconds.
     */
    @JsonProperty("last_updated_timestamp")
    private Long lastUpdatedTimestamp;
    
    /**
     * The username of the user that created the object.
     */
    @JsonProperty("user_id")
    private String userId;
    
    public CommentObject setAvailableActions(java.util.List<CommentActivityAction> availableActions) {
        this.availableActions = availableActions;
        return this;
    }

    public java.util.List<CommentActivityAction> getAvailableActions() {
        return availableActions;
    }
    
    public CommentObject setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public CommentObject setCreationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    public Long getCreationTimestamp() {
        return creationTimestamp;
    }
    
    public CommentObject setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }
    
    public CommentObject setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return userId;
    }
    
}
