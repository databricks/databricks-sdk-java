// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This describes an enum
 */
public enum NotebookTaskSource{
    GIT,// Notebook is located in cloud Git provider.
    WORKSPACE,// Notebook is located in Databricks workspace.
    
}