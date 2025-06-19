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
import java.util.Objects;

@Generated
@JsonSerialize(
    using = BudgetConfigurationFilterTagClause.BudgetConfigurationFilterTagClauseSerializer.class)
@JsonDeserialize(
    using = BudgetConfigurationFilterTagClause.BudgetConfigurationFilterTagClauseDeserializer.class)
public class BudgetConfigurationFilterTagClause {
  /** */
  private String key;

  /** */
  private BudgetConfigurationFilterClause value;

  public BudgetConfigurationFilterTagClause setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public BudgetConfigurationFilterTagClause setValue(BudgetConfigurationFilterClause value) {
    this.value = value;
    return this;
  }

  public BudgetConfigurationFilterClause getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetConfigurationFilterTagClause that = (BudgetConfigurationFilterTagClause) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetConfigurationFilterTagClause.class)
        .add("key", key)
        .add("value", value)
        .toString();
  }

  BudgetConfigurationFilterTagClausePb toPb() {
    BudgetConfigurationFilterTagClausePb pb = new BudgetConfigurationFilterTagClausePb();
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static BudgetConfigurationFilterTagClause fromPb(BudgetConfigurationFilterTagClausePb pb) {
    BudgetConfigurationFilterTagClause model = new BudgetConfigurationFilterTagClause();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class BudgetConfigurationFilterTagClauseSerializer
      extends JsonSerializer<BudgetConfigurationFilterTagClause> {
    @Override
    public void serialize(
        BudgetConfigurationFilterTagClause value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      BudgetConfigurationFilterTagClausePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class BudgetConfigurationFilterTagClauseDeserializer
      extends JsonDeserializer<BudgetConfigurationFilterTagClause> {
    @Override
    public BudgetConfigurationFilterTagClause deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      BudgetConfigurationFilterTagClausePb pb =
          mapper.readValue(p, BudgetConfigurationFilterTagClausePb.class);
      return BudgetConfigurationFilterTagClause.fromPb(pb);
    }
  }
}
