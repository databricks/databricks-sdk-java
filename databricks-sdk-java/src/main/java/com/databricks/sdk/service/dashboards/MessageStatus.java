// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;

/**
 * MesssageStatus. The possible values are: * `FETCHING_METADATA`: Fetching metadata from the data
 * sources. * `FILTERING_CONTEXT`: Running smart context step to determine relevant context. *
 * `ASKING_AI`: Waiting for the LLM to respond to the users question. * `EXECUTING_QUERY`: Executing
 * AI provided SQL query. Get the SQL query result by calling
 * [getMessageQueryResult](:method:genie/getMessageQueryResult) API. **Important: The message status
 * will stay in the `EXECUTING_QUERY` until a client calls
 * [getMessageQueryResult](:method:genie/getMessageQueryResult)**. * `FAILED`: Generating a response
 * or the executing the query failed. Please see `error` field. * `COMPLETED`: Message processing is
 * completed. Results are in the `attachments` field. Get the SQL query result by calling
 * [getMessageQueryResult](:method:genie/getMessageQueryResult) API. * `SUBMITTED`: Message has been
 * submitted. * `QUERY_RESULT_EXPIRED`: SQL result is not available anymore. The user needs to
 * execute the query again. * `CANCELLED`: Message has been cancelled.
 */
@Generated
public enum MessageStatus {
  ASKING_AI, // Waiting for the LLM to respond to the users question.
  CANCELLED, // Message has been cancelled.
  COMPLETED, // Message processing is completed. Results are in the `attachments` field. Get
  // the SQL query result by calling
  // [getMessageQueryResult](:method:genie/getMessageQueryResult) API.
  EXECUTING_QUERY, // Executing AI provided SQL query. Get the SQL query result by calling
  // [getMessageQueryResult](:method:genie/getMessageQueryResult) API.
  // **Important: The message status will stay in the `EXECUTING_QUERY` until a
  // client calls [getMessageQueryResult](:method:genie/getMessageQueryResult)**.
  FAILED, // Generating a response or the executing the query failed. Please see `error`
  // field.
  FETCHING_METADATA, // Fetching metadata from the data sources.
  FILTERING_CONTEXT, // Running smart context step to determine relevant context.
  QUERY_RESULT_EXPIRED, // SQL result is not available anymore. The user needs to execute the query
  // again.
  SUBMITTED, // Message has been submitted.
}
