// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Type of the alert destination.
 */
public enum DestinationType{
    email,
    hangouts_chat,
    mattermost,
    microsoft_teams,
    pagerduty,
    slack,
    webhook,
    
}