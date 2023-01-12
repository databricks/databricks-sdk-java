// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Channel information for the SQL warehouse at the time of query execution
 */
@Generated("databricks-sdk-generator")
public class ChannelInfo {
    /**
     * DBSQL Version the channel is mapped to
     */
    @JsonProperty("dbsql_version")
    private String dbsqlVersion;
    
    /**
     * Name of the channel
     */
    @JsonProperty("name")
    private ChannelName name;
    
    public ChannelInfo setDbsqlVersion(String dbsqlVersion) {
        this.dbsqlVersion = dbsqlVersion;
        return this;
    }

    public String getDbsqlVersion() {
        return dbsqlVersion;
    }
    
    public ChannelInfo setName(ChannelName name) {
        this.name = name;
        return this;
    }

    public ChannelName getName() {
        return name;
    }
    
}
