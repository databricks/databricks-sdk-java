// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;

/**
 * The type of a Genie conversation. Distinguishes an agent-mode conversation from a classic chat
 * conversation so callers can route message retrieval accordingly without a per-conversation
 * lookup.
 */
@Generated
public enum GenieConversationType {
  GENIE_CONVERSATION_TYPE_AGENT,
  GENIE_CONVERSATION_TYPE_CHAT,
}
