// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Activity recorded for the action.
 */
public class Activity {
    /**
     * This describes an enum
     */
    @JsonProperty("activity_type")
    private ActivityType activityType;
    
    /**
     * User-provided comment associated with the activity.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Creation time of the object, as a Unix timestamp in milliseconds.
     */
    @JsonProperty("creation_timestamp")
    private Long creationTimestamp;
    
    /**
     * Source stage of the transition (if the activity is stage transition
     * related). Valid values are:
     * 
     * * `None`: The initial stage of a model version.
     * 
     * * `Staging`: Staging or pre-production stage.
     * 
     * * `Production`: Production stage.
     * 
     * * `Archived`: Archived stage.
     */
    @JsonProperty("from_stage")
    private Stage fromStage;
    
    /**
     * Unique identifier for the object.
     */
    @JsonProperty("id")
    private String id;
    
    /**
     * Time of the object at last update, as a Unix timestamp in milliseconds.
     */
    @JsonProperty("last_updated_timestamp")
    private Long lastUpdatedTimestamp;
    
    /**
     * Comment made by system, for example explaining an activity of type
     * `SYSTEM_TRANSITION`. It usually describes a side effect, such as a
     * version being archived as part of another version's stage transition, and
     * may not be returned for some activity types.
     */
    @JsonProperty("system_comment")
    private String systemComment;
    
    /**
     * Target stage of the transition (if the activity is stage transition
     * related). Valid values are:
     * 
     * * `None`: The initial stage of a model version.
     * 
     * * `Staging`: Staging or pre-production stage.
     * 
     * * `Production`: Production stage.
     * 
     * * `Archived`: Archived stage.
     */
    @JsonProperty("to_stage")
    private Stage toStage;
    
    /**
     * The username of the user that created the object.
     */
    @JsonProperty("user_id")
    private String userId;
    
    public Activity setActivityType(ActivityType activityType) {
        this.activityType = activityType;
        return this;
    }

    public ActivityType getActivityType() {
        return activityType;
    }
    
    public Activity setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public Activity setCreationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    public Long getCreationTimestamp() {
        return creationTimestamp;
    }
    
    public Activity setFromStage(Stage fromStage) {
        this.fromStage = fromStage;
        return this;
    }

    public Stage getFromStage() {
        return fromStage;
    }
    
    public Activity setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
    public Activity setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }
    
    public Activity setSystemComment(String systemComment) {
        this.systemComment = systemComment;
        return this;
    }

    public String getSystemComment() {
        return systemComment;
    }
    
    public Activity setToStage(Stage toStage) {
        this.toStage = toStage;
        return this;
    }

    public Stage getToStage() {
        return toStage;
    }
    
    public Activity setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return userId;
    }
    
}
