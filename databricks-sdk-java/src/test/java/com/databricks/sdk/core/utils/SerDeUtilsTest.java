package com.databricks.sdk.core.utils;

import com.databricks.sdk.service.catalog.OnlineTableSpecContinuousSchedulingPolicy;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class SerDeUtilsTest {
  @Test
  public void testEmptyClassRoundTrip() throws JsonProcessingException {
    OnlineTableSpecContinuousSchedulingPolicy policy = new OnlineTableSpecContinuousSchedulingPolicy();
    ObjectMapper mapper = SerDeUtils.createMapper();
    String json = mapper.writeValueAsString(policy);
    assert json.equals("{}");
    OnlineTableSpecContinuousSchedulingPolicy result = mapper.readValue(json, OnlineTableSpecContinuousSchedulingPolicy.class);
    assert result.equals(policy);
  }
}
