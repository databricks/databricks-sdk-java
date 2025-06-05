// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using = BudgetConfigurationFilterClause.BudgetConfigurationFilterClauseSerializer.class)
@JsonDeserialize(
    using = BudgetConfigurationFilterClause.BudgetConfigurationFilterClauseDeserializer.class)
public class BudgetConfigurationFilterClause {
  /** */
  private BudgetConfigurationFilterOperator operator;

  /** */
  private Collection<String> values;

  public BudgetConfigurationFilterClause setOperator(BudgetConfigurationFilterOperator operator) {
    this.operator = operator;
    return this;
  }

  public BudgetConfigurationFilterOperator getOperator() {
    return operator;
  }

  public BudgetConfigurationFilterClause setValues(Collection<String> values) {
    this.values = values;
    return this;
  }

  public Collection<String> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetConfigurationFilterClause that = (BudgetConfigurationFilterClause) o;
    return Objects.equals(operator, that.operator) && Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, values);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetConfigurationFilterClause.class)
        .add("operator", operator)
        .add("values", values)
        .toString();
  }

  BudgetConfigurationFilterClausePb toPb() {
    BudgetConfigurationFilterClausePb pb = new BudgetConfigurationFilterClausePb();
    pb.setOperator(operator);
    pb.setValues(values);

    return pb;
  }

  static BudgetConfigurationFilterClause fromPb(BudgetConfigurationFilterClausePb pb) {
    BudgetConfigurationFilterClause model = new BudgetConfigurationFilterClause();
    model.setOperator(pb.getOperator());
    model.setValues(pb.getValues());

    return model;
  }

  public static class BudgetConfigurationFilterClauseSerializer
      extends JsonSerializer<BudgetConfigurationFilterClause> {
    @Override
    public void serialize(
        BudgetConfigurationFilterClause value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      BudgetConfigurationFilterClausePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class BudgetConfigurationFilterClauseDeserializer
      extends JsonDeserializer<BudgetConfigurationFilterClause> {
    @Override
    public BudgetConfigurationFilterClause deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      BudgetConfigurationFilterClausePb pb =
          mapper.readValue(p, BudgetConfigurationFilterClausePb.class);
      return BudgetConfigurationFilterClause.fromPb(pb);
    }
  }
}
