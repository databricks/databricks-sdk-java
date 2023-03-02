// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class SharedDataObject {
    /**
     * The time when this data object is added to the share, in epoch
     * milliseconds.
     */
    @JsonProperty("added_at")
    private Long addedAt;
    
    /**
     * Username of the sharer.
     */
    @JsonProperty("added_by")
    private String addedBy;
    
    /**
     * Whether to enable cdf or indicate if cdf is enabled on the shared object.
     */
    @JsonProperty("cdf_enabled")
    private Boolean cdfEnabled;
    
    /**
     * A user-provided comment when adding the data object to the share.
     * [Update:OPT]
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * The type of the data object.
     */
    @JsonProperty("data_object_type")
    private String dataObjectType;
    
    /**
     * A fully qualified name that uniquely identifies a data object.
     * 
     * For example, a table's fully qualified name is in the format of
     * `<catalog>.<schema>.<table>`.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Array of partitions for the shared data.
     */
    @JsonProperty("partitions")
    private java.util.List<Partition> partitions;
    
    /**
     * A user-provided new name for the data object within the share. If this
     * new name is not provided, the object's original name will be used as the
     * `shared_as` name. The `shared_as` name must be unique within a share. For
     * tables, the new name must follow the format of `<schema>.<table>`.
     */
    @JsonProperty("shared_as")
    private String sharedAs;
    
    /**
     * The start version associated with the object. This allows data providers
     * to control the lowest object version that is accessible by clients. If
     * specified, clients can query snapshots or changes for versions >=
     * start_version. If not specified, clients can only query starting from the
     * version of the object at the time it was added to the share.
     * 
     * NOTE: The start_version should be <= the `current` version of the object.
     */
    @JsonProperty("start_version")
    private Long startVersion;
    
    /**
     * One of: **ACTIVE**, **PERMISSION_DENIED**.
     */
    @JsonProperty("status")
    private SharedDataObjectStatus status;
    
    public SharedDataObject setAddedAt(Long addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    public Long getAddedAt() {
        return addedAt;
    }
    
    public SharedDataObject setAddedBy(String addedBy) {
        this.addedBy = addedBy;
        return this;
    }

    public String getAddedBy() {
        return addedBy;
    }
    
    public SharedDataObject setCdfEnabled(Boolean cdfEnabled) {
        this.cdfEnabled = cdfEnabled;
        return this;
    }

    public Boolean getCdfEnabled() {
        return cdfEnabled;
    }
    
    public SharedDataObject setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public SharedDataObject setDataObjectType(String dataObjectType) {
        this.dataObjectType = dataObjectType;
        return this;
    }

    public String getDataObjectType() {
        return dataObjectType;
    }
    
    public SharedDataObject setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public SharedDataObject setPartitions(java.util.List<Partition> partitions) {
        this.partitions = partitions;
        return this;
    }

    public java.util.List<Partition> getPartitions() {
        return partitions;
    }
    
    public SharedDataObject setSharedAs(String sharedAs) {
        this.sharedAs = sharedAs;
        return this;
    }

    public String getSharedAs() {
        return sharedAs;
    }
    
    public SharedDataObject setStartVersion(Long startVersion) {
        this.startVersion = startVersion;
        return this;
    }

    public Long getStartVersion() {
        return startVersion;
    }
    
    public SharedDataObject setStatus(SharedDataObjectStatus status) {
        this.status = status;
        return this;
    }

    public SharedDataObjectStatus getStatus() {
        return status;
    }
    
}
