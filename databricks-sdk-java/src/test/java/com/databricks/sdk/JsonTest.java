package com.databricks.sdk;

import com.databricks.sdk.core.utils.SerDeUtils;
import com.databricks.sdk.service.catalog.UpdateVolumeRequestContent;
import com.databricks.sdk.service.compute.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class JsonTest {
  @Test
  public void serializePathParams() throws JsonProcessingException {
    String value = "Should not appear";
    UpdateVolumeRequestContent content = new UpdateVolumeRequestContent().setName(value);
    ObjectMapper mapper = SerDeUtils.createMapper();
    String result = mapper.writeValueAsString(content);
    assert (!result.contains(value));
  }
}
