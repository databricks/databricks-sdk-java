// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = ListClustersSortBy.ListClustersSortBySerializer.class)
@JsonDeserialize(using = ListClustersSortBy.ListClustersSortByDeserializer.class)
public class ListClustersSortBy {
  /** The direction to sort by. */
  private ListClustersSortByDirection direction;

  /**
   * The sorting criteria. By default, clusters are sorted by 3 columns from highest to lowest
   * precedence: cluster state, pinned or unpinned, then cluster name.
   */
  private ListClustersSortByField field;

  public ListClustersSortBy setDirection(ListClustersSortByDirection direction) {
    this.direction = direction;
    return this;
  }

  public ListClustersSortByDirection getDirection() {
    return direction;
  }

  public ListClustersSortBy setField(ListClustersSortByField field) {
    this.field = field;
    return this;
  }

  public ListClustersSortByField getField() {
    return field;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClustersSortBy that = (ListClustersSortBy) o;
    return Objects.equals(direction, that.direction) && Objects.equals(field, that.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, field);
  }

  @Override
  public String toString() {
    return new ToStringer(ListClustersSortBy.class)
        .add("direction", direction)
        .add("field", field)
        .toString();
  }

  ListClustersSortByPb toPb() {
    ListClustersSortByPb pb = new ListClustersSortByPb();
    pb.setDirection(direction);
    pb.setField(field);

    return pb;
  }

  static ListClustersSortBy fromPb(ListClustersSortByPb pb) {
    ListClustersSortBy model = new ListClustersSortBy();
    model.setDirection(pb.getDirection());
    model.setField(pb.getField());

    return model;
  }

  public static class ListClustersSortBySerializer extends JsonSerializer<ListClustersSortBy> {
    @Override
    public void serialize(ListClustersSortBy value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListClustersSortByPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListClustersSortByDeserializer extends JsonDeserializer<ListClustersSortBy> {
    @Override
    public ListClustersSortBy deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListClustersSortByPb pb = mapper.readValue(p, ListClustersSortByPb.class);
      return ListClustersSortBy.fromPb(pb);
    }
  }
}
