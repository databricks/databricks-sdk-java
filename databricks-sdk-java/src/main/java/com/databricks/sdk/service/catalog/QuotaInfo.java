// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = QuotaInfo.QuotaInfoSerializer.class)
@JsonDeserialize(using = QuotaInfo.QuotaInfoDeserializer.class)
public class QuotaInfo {
  /** The timestamp that indicates when the quota count was last updated. */
  private Long lastRefreshedAt;

  /** Name of the parent resource. Returns metastore ID if the parent is a metastore. */
  private String parentFullName;

  /** The quota parent securable type. */
  private SecurableType parentSecurableType;

  /** The current usage of the resource quota. */
  private Long quotaCount;

  /** The current limit of the resource quota. */
  private Long quotaLimit;

  /** The name of the quota. */
  private String quotaName;

  public QuotaInfo setLastRefreshedAt(Long lastRefreshedAt) {
    this.lastRefreshedAt = lastRefreshedAt;
    return this;
  }

  public Long getLastRefreshedAt() {
    return lastRefreshedAt;
  }

  public QuotaInfo setParentFullName(String parentFullName) {
    this.parentFullName = parentFullName;
    return this;
  }

  public String getParentFullName() {
    return parentFullName;
  }

  public QuotaInfo setParentSecurableType(SecurableType parentSecurableType) {
    this.parentSecurableType = parentSecurableType;
    return this;
  }

  public SecurableType getParentSecurableType() {
    return parentSecurableType;
  }

  public QuotaInfo setQuotaCount(Long quotaCount) {
    this.quotaCount = quotaCount;
    return this;
  }

  public Long getQuotaCount() {
    return quotaCount;
  }

  public QuotaInfo setQuotaLimit(Long quotaLimit) {
    this.quotaLimit = quotaLimit;
    return this;
  }

  public Long getQuotaLimit() {
    return quotaLimit;
  }

  public QuotaInfo setQuotaName(String quotaName) {
    this.quotaName = quotaName;
    return this;
  }

  public String getQuotaName() {
    return quotaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuotaInfo that = (QuotaInfo) o;
    return Objects.equals(lastRefreshedAt, that.lastRefreshedAt)
        && Objects.equals(parentFullName, that.parentFullName)
        && Objects.equals(parentSecurableType, that.parentSecurableType)
        && Objects.equals(quotaCount, that.quotaCount)
        && Objects.equals(quotaLimit, that.quotaLimit)
        && Objects.equals(quotaName, that.quotaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        lastRefreshedAt, parentFullName, parentSecurableType, quotaCount, quotaLimit, quotaName);
  }

  @Override
  public String toString() {
    return new ToStringer(QuotaInfo.class)
        .add("lastRefreshedAt", lastRefreshedAt)
        .add("parentFullName", parentFullName)
        .add("parentSecurableType", parentSecurableType)
        .add("quotaCount", quotaCount)
        .add("quotaLimit", quotaLimit)
        .add("quotaName", quotaName)
        .toString();
  }

  QuotaInfoPb toPb() {
    QuotaInfoPb pb = new QuotaInfoPb();
    pb.setLastRefreshedAt(lastRefreshedAt);
    pb.setParentFullName(parentFullName);
    pb.setParentSecurableType(parentSecurableType);
    pb.setQuotaCount(quotaCount);
    pb.setQuotaLimit(quotaLimit);
    pb.setQuotaName(quotaName);

    return pb;
  }

  static QuotaInfo fromPb(QuotaInfoPb pb) {
    QuotaInfo model = new QuotaInfo();
    model.setLastRefreshedAt(pb.getLastRefreshedAt());
    model.setParentFullName(pb.getParentFullName());
    model.setParentSecurableType(pb.getParentSecurableType());
    model.setQuotaCount(pb.getQuotaCount());
    model.setQuotaLimit(pb.getQuotaLimit());
    model.setQuotaName(pb.getQuotaName());

    return model;
  }

  public static class QuotaInfoSerializer extends JsonSerializer<QuotaInfo> {
    @Override
    public void serialize(QuotaInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QuotaInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QuotaInfoDeserializer extends JsonDeserializer<QuotaInfo> {
    @Override
    public QuotaInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QuotaInfoPb pb = mapper.readValue(p, QuotaInfoPb.class);
      return QuotaInfo.fromPb(pb);
    }
  }
}
