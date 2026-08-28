// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * An expression that is evaluated at query time against per-request context. New variants (e.g.,
 * identity attributes) are added as additional oneof cases.
 */
@Generated
public class FunctionArgExpression {
  /** An expression that introspects tags at query time. */
  @JsonProperty("tag_introspection")
  private TagIntrospectionExpression tagIntrospection;

  public FunctionArgExpression setTagIntrospection(TagIntrospectionExpression tagIntrospection) {
    this.tagIntrospection = tagIntrospection;
    return this;
  }

  public TagIntrospectionExpression getTagIntrospection() {
    return tagIntrospection;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FunctionArgExpression that = (FunctionArgExpression) o;
    return Objects.equals(tagIntrospection, that.tagIntrospection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagIntrospection);
  }

  @Override
  public String toString() {
    return new ToStringer(FunctionArgExpression.class)
        .add("tagIntrospection", tagIntrospection)
        .toString();
  }
}
