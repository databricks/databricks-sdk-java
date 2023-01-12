// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokenmanagement;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class TokenInfo {
    /**
     * Comment that describes the purpose of the token, specified by the token
     * creator.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * User ID of the user that created the token.
     */
    @JsonProperty("created_by_id")
    private Long createdById;
    
    /**
     * Username of the user that created the token.
     */
    @JsonProperty("created_by_username")
    private String createdByUsername;
    
    /**
     * Timestamp when the token was created.
     */
    @JsonProperty("creation_time")
    private Long creationTime;
    
    /**
     * Timestamp when the token expires.
     */
    @JsonProperty("expiry_time")
    private Long expiryTime;
    
    /**
     * User ID of the user that owns the token.
     */
    @JsonProperty("owner_id")
    private Long ownerId;
    
    /**
     * ID of the token.
     */
    @JsonProperty("token_id")
    private String tokenId;
    
    public TokenInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public TokenInfo setCreatedById(Long createdById) {
        this.createdById = createdById;
        return this;
    }

    public Long getCreatedById() {
        return createdById;
    }
    
    public TokenInfo setCreatedByUsername(String createdByUsername) {
        this.createdByUsername = createdByUsername;
        return this;
    }

    public String getCreatedByUsername() {
        return createdByUsername;
    }
    
    public TokenInfo setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public Long getCreationTime() {
        return creationTime;
    }
    
    public TokenInfo setExpiryTime(Long expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    public Long getExpiryTime() {
        return expiryTime;
    }
    
    public TokenInfo setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Long getOwnerId() {
        return ownerId;
    }
    
    public TokenInfo setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    public String getTokenId() {
        return tokenId;
    }
    
}
