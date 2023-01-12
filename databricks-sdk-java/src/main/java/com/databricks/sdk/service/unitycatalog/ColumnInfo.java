// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ColumnInfo {
    /**
     * [Create,Update:OPT] User-provided free-form text description.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * [Create:REQ Update:OPT] Name of Column.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * [Create,Update:OPT] Whether field may be Null (default: True).
     */
    @JsonProperty("nullable")
    private Boolean nullable;
    
    /**
     * [Create,Update:OPT] Partition index for column.
     */
    @JsonProperty("partition_index")
    private Long partitionIndex;
    
    /**
     * [Create:REQ Update:OPT] Ordinal position of column (starting at position
     * 0).
     */
    @JsonProperty("position")
    private Long position;
    
    /**
     * [Create: OPT, Update: OPT] Format of IntervalType.
     */
    @JsonProperty("type_interval_type")
    private String typeIntervalType;
    
    /**
     * [Create:OPT Update:OPT] Full data type spec, JSON-serialized.
     */
    @JsonProperty("type_json")
    private String typeJson;
    
    /**
     * [Create: REQ Update: OPT] Name of type (INT, STRUCT, MAP, etc.)
     */
    @JsonProperty("type_name")
    private ColumnInfoTypeName typeName;
    
    /**
     * [Create: OPT, Update: OPT] Digits of precision; required on Create for
     * DecimalTypes.
     */
    @JsonProperty("type_precision")
    private Long typePrecision;
    
    /**
     * [Create: OPT, Update: OPT] Digits to right of decimal; Required on Create
     * for DecimalTypes.
     */
    @JsonProperty("type_scale")
    private Long typeScale;
    
    /**
     * [Create:REQ Update:OPT] Full data type spec, SQL/catalogString text.
     */
    @JsonProperty("type_text")
    private String typeText;
    
    public ColumnInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public ColumnInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public ColumnInfo setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }

    public Boolean getNullable() {
        return nullable;
    }
    
    public ColumnInfo setPartitionIndex(Long partitionIndex) {
        this.partitionIndex = partitionIndex;
        return this;
    }

    public Long getPartitionIndex() {
        return partitionIndex;
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
    
    public ColumnInfo setTypeJson(String typeJson) {
        this.typeJson = typeJson;
        return this;
    }

    public String getTypeJson() {
        return typeJson;
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
