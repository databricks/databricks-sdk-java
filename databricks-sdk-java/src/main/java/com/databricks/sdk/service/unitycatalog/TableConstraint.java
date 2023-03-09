// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A table constraint, as defined by *one* of the following fields being set:
 * __primary_key_constraint__, __foreign_key_constraint__,
 * __named_table_constraint__.
 */
public class TableConstraint {
    /**
     
     */
    @JsonProperty("foreign_key_constraint")
    private ForeignKeyConstraint foreignKeyConstraint;
    
    /**
     
     */
    @JsonProperty("named_table_constraint")
    private NamedTableConstraint namedTableConstraint;
    
    /**
     
     */
    @JsonProperty("primary_key_constraint")
    private PrimaryKeyConstraint primaryKeyConstraint;
    
    public TableConstraint setForeignKeyConstraint(ForeignKeyConstraint foreignKeyConstraint) {
        this.foreignKeyConstraint = foreignKeyConstraint;
        return this;
    }

    public ForeignKeyConstraint getForeignKeyConstraint() {
        return foreignKeyConstraint;
    }
    
    public TableConstraint setNamedTableConstraint(NamedTableConstraint namedTableConstraint) {
        this.namedTableConstraint = namedTableConstraint;
        return this;
    }

    public NamedTableConstraint getNamedTableConstraint() {
        return namedTableConstraint;
    }
    
    public TableConstraint setPrimaryKeyConstraint(PrimaryKeyConstraint primaryKeyConstraint) {
        this.primaryKeyConstraint = primaryKeyConstraint;
        return this;
    }

    public PrimaryKeyConstraint getPrimaryKeyConstraint() {
        return primaryKeyConstraint;
    }
    
}
