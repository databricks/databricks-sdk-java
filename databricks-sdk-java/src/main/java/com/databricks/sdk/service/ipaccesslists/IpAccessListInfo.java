// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ipaccesslists;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class IpAccessListInfo {
    /**
     * Total number of IP or CIDR values.
     */
    @JsonProperty("address_count")
    private Long addressCount;
    
    /**
     * Creation timestamp in milliseconds.
     */
    @JsonProperty("created_at")
    private Long createdAt;
    
    /**
     * User ID of the user who created this list.
     */
    @JsonProperty("created_by")
    private Long createdBy;
    
    /**
     * Specifies whether this IP access list is enabled.
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    
    /**
     * Array of IP addresses or CIDR values to be added to the IP access list.
     */
    @JsonProperty("ip_addresses")
    private java.util.List<String> ipAddresses;
    
    /**
     * Label for the IP access list. This **cannot** be empty.
     */
    @JsonProperty("label")
    private String label;
    
    /**
     * Universally unique identifier(UUID) of the IP access list.
     */
    @JsonProperty("list_id")
    private String listId;
    
    /**
     * This describes an enum
     */
    @JsonProperty("list_type")
    private ListType listType;
    
    /**
     * Update timestamp in milliseconds.
     */
    @JsonProperty("updated_at")
    private Long updatedAt;
    
    /**
     * User ID of the user who updated this list.
     */
    @JsonProperty("updated_by")
    private Long updatedBy;
    
    public IpAccessListInfo setAddressCount(Long addressCount) {
        this.addressCount = addressCount;
        return this;
    }

    public Long getAddressCount() {
        return addressCount;
    }
    
    public IpAccessListInfo setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
    
    public IpAccessListInfo setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Long getCreatedBy() {
        return createdBy;
    }
    
    public IpAccessListInfo setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    
    public IpAccessListInfo setIpAddresses(java.util.List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

    public java.util.List<String> getIpAddresses() {
        return ipAddresses;
    }
    
    public IpAccessListInfo setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getLabel() {
        return label;
    }
    
    public IpAccessListInfo setListId(String listId) {
        this.listId = listId;
        return this;
    }

    public String getListId() {
        return listId;
    }
    
    public IpAccessListInfo setListType(ListType listType) {
        this.listType = listType;
        return this;
    }

    public ListType getListType() {
        return listType;
    }
    
    public IpAccessListInfo setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }
    
    public IpAccessListInfo setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }
    
}
