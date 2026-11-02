// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A predefined join between two tables or metric views. */
@Generated
public class GenieAgentJoinSpec {
  /** Description of the join's purpose. */
  @JsonProperty("comment")
  private String comment;

  /** Identifier of the join: 32 lowercase hexadecimal characters, unique within the Genie Agent. */
  @JsonProperty("id")
  private String id;

  /** Guidance on when to use the join. */
  @JsonProperty("instruction")
  private String instruction;

  /** The left side of the join. */
  @JsonProperty("left")
  private GenieAgentJoinSource left;

  /** How the rows of the two sides relate. */
  @JsonProperty("relationship_type")
  private GenieAgentJoinRelationshipType relationshipType;

  /** The right side of the join. */
  @JsonProperty("right")
  private GenieAgentJoinSource right;

  /** The join condition, for example `orders.customer_id = customers.id`. */
  @JsonProperty("sql")
  private String sql;

  public GenieAgentJoinSpec setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public GenieAgentJoinSpec setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GenieAgentJoinSpec setInstruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

  public String getInstruction() {
    return instruction;
  }

  public GenieAgentJoinSpec setLeft(GenieAgentJoinSource left) {
    this.left = left;
    return this;
  }

  public GenieAgentJoinSource getLeft() {
    return left;
  }

  public GenieAgentJoinSpec setRelationshipType(GenieAgentJoinRelationshipType relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  public GenieAgentJoinRelationshipType getRelationshipType() {
    return relationshipType;
  }

  public GenieAgentJoinSpec setRight(GenieAgentJoinSource right) {
    this.right = right;
    return this;
  }

  public GenieAgentJoinSource getRight() {
    return right;
  }

  public GenieAgentJoinSpec setSql(String sql) {
    this.sql = sql;
    return this;
  }

  public String getSql() {
    return sql;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentJoinSpec that = (GenieAgentJoinSpec) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(id, that.id)
        && Objects.equals(instruction, that.instruction)
        && Objects.equals(left, that.left)
        && Objects.equals(relationshipType, that.relationshipType)
        && Objects.equals(right, that.right)
        && Objects.equals(sql, that.sql);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, id, instruction, left, relationshipType, right, sql);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentJoinSpec.class)
        .add("comment", comment)
        .add("id", id)
        .add("instruction", instruction)
        .add("left", left)
        .add("relationshipType", relationshipType)
        .add("right", right)
        .add("sql", sql)
        .toString();
  }
}
