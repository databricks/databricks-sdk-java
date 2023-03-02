// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ColumnInfo {
    /**
     * Name of Column.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Ordinal position of column (starting at position 0).
     */
    @JsonProperty("position")
    private Long position;
    
    /**
     * Format of interval type.
     */
    @JsonProperty("type_interval_type")
    private String typeIntervalType;
    
    /**
     * Name of type (INT, STRUCT, MAP, and so on)
     */
    @JsonProperty("type_name")
    private ColumnInfoTypeName typeName;
    
    /**
     * Digits of precision.
     */
    @JsonProperty("type_precision")
    private Long typePrecision;
    
    /**
     * Digits to right of decimal.
     */
    @JsonProperty("type_scale")
    private Long typeScale;
    
    /**
     * Full data type spec, SQL/catalogString text.
     */
    @JsonProperty("type_text")
    private String typeText;
    
    public ColumnInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public ColumnInfo setPosition(Long position) {
        this.position = position;
        return this;
    }

    public Long getPosition() {
        return position;
    }
    
    public ColumnInfo setTypeIntervalType(String typeIntervalType) {
        this.typeIntervalType = typeIntervalType;
        return this;
    }

    public String getTypeIntervalType() {
        return typeIntervalType;
    }
    
    public ColumnInfo setTypeName(ColumnInfoTypeName typeName) {
        this.typeName = typeName;
        return this;
    }

    public ColumnInfoTypeName getTypeName() {
        return typeName;
    }
    
    public ColumnInfo setTypePrecision(Long typePrecision) {
        this.typePrecision = typePrecision;
        return this;
    }

    public Long getTypePrecision() {
        return typePrecision;
    }
    
    public ColumnInfo setTypeScale(Long typeScale) {
        this.typeScale = typeScale;
        return this;
    }

    public Long getTypeScale() {
        return typeScale;
    }
    
    public ColumnInfo setTypeText(String typeText) {
        this.typeText = typeText;
        return this;
    }

    public String getTypeText() {
        return typeText;
    }
    
}
