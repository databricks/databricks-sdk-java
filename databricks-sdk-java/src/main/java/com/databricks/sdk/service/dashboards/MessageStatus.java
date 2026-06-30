// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;

/**
 * MessageStatus. The possible values are: * `FETCHING_METADATA`: Fetching metadata from the data
 * sources. * `FILTERING_CONTEXT`: Running smart context step to determine relevant context. *
 * `ASKING_AI`: Waiting for the LLM to respond to the user's question. * `PENDING_WAREHOUSE`:
 * Waiting for warehouse before the SQL query can start executing. * `EXECUTING_QUERY`: Executing a
 * generated SQL query. Get the SQL query result by calling
 * [getMessageAttachmentQueryResult](:method:genie/getMessageAttachmentQueryResult) API. * `FAILED`:
 * The response generation or query execution failed. See `error` field. * `COMPLETED`: Message
 * processing is completed. Results are in the `attachments` field. Get the SQL query result by
 * calling [getMessageAttachmentQueryResult](:method:genie/getMessageAttachmentQueryResult) API. *
 * `SUBMITTED`: Message has been submitted. * `QUERY_RESULT_EXPIRED`: SQL result is not available
 * anymore. The user needs to rerun the query. Rerun the SQL query result by calling
 * [executeMessageAttachmentQuery](:method:genie/executeMessageAttachmentQuery) API. * `CANCELLED`:
 * Message has been cancelled.
 */
@Generated
public enum MessageStatus {
  ASKING_AI, // Waiting for the LLM to respond to the user's question.
  CANCELLED, // Message has been cancelled.
  COMPLETED, // Message processing is completed. Results are in the `attachments` field. Get
  // the SQL query result by calling
  // [getMessageAttachmentQueryResult](:method:genie/getMessageAttachmentQueryResult)
  // API.
  EXECUTING_QUERY, // Executing a generated SQL query. Get the SQL query result by calling
  // [getMessageAttachmentQueryResult](:method:genie/getMessageAttachmentQueryResult)
  // API.
  FAILED, // The response generation or query execution failed. See `error` field.
  FETCHING_METADATA, // Fetching metadata from the data sources.
  FILTERING_CONTEXT, // Running smart context step to determine relevant context.
  PENDING_WAREHOUSE, // Waiting for warehouse before the SQL query can start executing.
  QUERY_RESULT_EXPIRED, // SQL result is not available anymore. The user needs to rerun the query.
  // Rerun
  // the SQL query result by calling
  // [executeMessageAttachmentQuery](:method:genie/executeMessageAttachmentQuery)
  // API.
  SUBMITTED, // Message has been submitted.
}
