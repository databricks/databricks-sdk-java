// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class Channel {
    /**
     
     */
    @JsonProperty("dbsql_version")
    private String dbsqlVersion;
    
    /**
     
     */
    @JsonProperty("name")
    private ChannelName name;
    
    public Channel setDbsqlVersion(String dbsqlVersion) {
        this.dbsqlVersion = dbsqlVersion;
        return this;
    }

    public String getDbsqlVersion() {
        return dbsqlVersion;
    }
    
    public Channel setName(ChannelName name) {
        this.name = name;
        return this;
    }

    public ChannelName getName() {
        return name;
    }
    
}
