// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;

/**
 * MessageStatus. The possible values are:
 *
 * <ul>
 *   <li>{@code FETCHING_METADATA}: Fetching metadata from the data sources.
 *   <li>{@code FILTERING_CONTEXT}: Running smart context step to determine relevant context.
 *   <li>{@code ASKING_AI}: Waiting for the LLM to respond to the user's question.
 *   <li>{@code PENDING_WAREHOUSE}: Waiting for warehouse before the SQL query can start executing.
 *   <li>{@code EXECUTING_QUERY}: Executing a generated SQL query. Get the SQL query result by
 *       calling <a
 *       href=":method:genie/getMessageAttachmentQueryResult">getMessageAttachmentQueryResult</a>
 *       API.
 *   <li>{@code FAILED}: The response generation or query execution failed. See {@code error} field.
 *   <li>{@code COMPLETED}: Message processing is completed. Results are in the {@code attachments}
 *       field. Get the SQL query result by calling <a
 *       href=":method:genie/getMessageAttachmentQueryResult">getMessageAttachmentQueryResult</a>
 *       API.
 *   <li>{@code SUBMITTED}: Message has been submitted.
 *   <li>{@code QUERY_RESULT_EXPIRED}: SQL result is not available anymore. The user needs to rerun
 *       the query. Rerun the SQL query result by calling <a
 *       href=":method:genie/executeMessageAttachmentQuery">executeMessageAttachmentQuery</a> API.
 *   <li>{@code CANCELLED}: Message has been cancelled.
 * </ul>
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
