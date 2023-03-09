// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a table constraint
 */
public class DeleteTableConstraintRequest {
    /**
     * If true, try deleting all child constraints of the current constraint.
     * 
     * If false, reject this operation if the current constraint has any child
     * constraints.
     */
    @QueryParam("cascade")
    private Boolean cascade;
    
    /**
     * The name of the constraint to delete.
     */
    @QueryParam("constraint_name")
    private String constraintName;
    
    /**
     * Full name of the table referenced by the constraint.
     */
    
    private String fullName;
    
    public DeleteTableConstraintRequest setCascade(Boolean cascade) {
        this.cascade = cascade;
        return this;
    }

    public Boolean getCascade() {
        return cascade;
    }
    
    public DeleteTableConstraintRequest setConstraintName(String constraintName) {
        this.constraintName = constraintName;
        return this;
    }

    public String getConstraintName() {
        return constraintName;
    }
    
    public DeleteTableConstraintRequest setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }
    
}
