// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.gentesting.unittests;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.utils.SerDeUtils;
import com.databricks.sdk.service.jsonmarshallv2.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MarshallTest {
  @Mock private ApiClient mockApiClient;
  private ObjectMapper objectMapper;

  static class MarshallTestCase {
    String name;
    Object input;
    String output;

    MarshallTestCase(String name, Object input, String output) {
      this.name = name;
      this.input = input;
      this.output = output;
    }
  }

  @BeforeEach
  void setUp() {
    objectMapper = SerDeUtils.createMapper();
  }

  static List<MarshallTestCase> marshallTestCases()
      throws JsonProcessingException, JsonMappingException {
    List<MarshallTestCase> cases = new ArrayList<>();
    cases.add(
        new MarshallTestCase(
            "OptionalString",
            new OptionalFields().setOptionalString("test"),
            "{" + "  \"optional_string\": \"test\"" + "}"));
    cases.add(
        new MarshallTestCase(
            "OptionalInt32",
            new OptionalFields().setOptionalInt32(42L),
            "{" + "  \"optional_int32\": 42" + "}"));
    cases.add(
        new MarshallTestCase(
            "OptionalInt64",
            new OptionalFields().setOptionalInt64(9223372036854775807L),
            "{" + "  \"optional_int64\": 9223372036854775807" + "}"));
    cases.add(
        new MarshallTestCase(
            "OptionalBool",
            new OptionalFields().setOptionalBool(true),
            "{" + "  \"optional_bool\": true" + "}"));
    cases.add(
        new MarshallTestCase(
            "OptionalEnum",
            new OptionalFields().setTestEnum(TestEnum.TEST_ENUM_ONE),
            "{" + "  \"test_enum\": \"TEST_ENUM_ONE\"" + "}"));
    cases.add(
        new MarshallTestCase(
            "OptionalNestedMessage",
            new OptionalFields()
                .setOptionalMessage(new NestedMessage().setOptionalString("nested_value")),
            "{"
                + "  \"optional_message\": {"
                + "    \"optional_string\": \"nested_value\""
                + "  }"
                + "}"));
    cases.add(
        new MarshallTestCase(
            "OptionalMap",
            new OptionalFields()
                .setMap(
                    new HashMap() {
                      {
                        put("key", "test_key");
                        put("value", "test_value");
                      }
                    }),
            "{"
                + "  \"map\": {"
                + "    \"key\": \"test_key\","
                + "    \"value\": \"test_value\""
                + "  }"
                + "}"));
    cases.add(
        new MarshallTestCase(
            "OptionalDuration",
            new OptionalFields().setDuration("3600s"),
            "{" + "  \"duration\": \"3600s\"" + "}"));
    cases.add(
        new MarshallTestCase(
            "OptionalFieldMask",
            new OptionalFields().setFieldMask("optional_string,optional_int32"),
            "{" + "  \"field_mask\": \"optional_string,optional_int32\"" + "}"));
    cases.add(
        new MarshallTestCase(
            "OptionalTimestamp",
            new OptionalFields().setTimestamp("2023-01-01T00:00:00Z"),
            "{" + "  \"timestamp\": \"2023-01-01T00:00:00Z\"" + "}"));
    cases.add(
        new MarshallTestCase(
            "MultipleOptionalFields",
            new OptionalFields()
                .setOptionalBool(true)
                .setOptionalInt32(42L)
                .setOptionalString("test"),
            "{"
                + "  \"optional_string\":\"test\","
                + "  \"optional_int32\":42,"
                + "  \"optional_bool\":true"
                + "}"));
    cases.add(new MarshallTestCase("RequiredFieldsNoInput", new RequiredFields(), "{}"));
    cases.add(
        new MarshallTestCase(
            "RequiredFieldsExplicitDefaults",
            new RequiredFields()
                .setRequiredBool(false)
                .setRequiredDuration("0s")
                .setRequiredFieldMask("")
                .setRequiredInt32(0L)
                .setRequiredInt64(0L)
                .setRequiredListValue(new ArrayList<>())
                .setRequiredMessage(new NestedMessage())
                .setRequiredString("")
                .setRequiredStruct(new HashMap<>())
                .setRequiredTimestamp("1970-01-01T00:00:00Z")
                .setRequiredValue("{}")
                .setTestRequiredEnum(TestEnum.TEST_ENUM_ONE),
            "{"
                + "    \"required_string\": \"\","
                + "    \"required_int32\": 0,"
                + "    \"required_int64\": 0,"
                + "    \"required_bool\": false,"
                + "    \"required_value\": \"{}\","
                + "    \"required_list_value\": [],"
                + "    \"required_struct\": {},"
                + "    \"required_message\": {},"
                + "    \"test_required_enum\": \"TEST_ENUM_ONE\","
                + "    \"required_duration\": \"0s\","
                + "    \"required_field_mask\": \"\","
                + "    \"required_timestamp\": \"1970-01-01T00:00:00Z\""
                + "  }"));
    cases.add(
        new MarshallTestCase(
            "RequiredFieldsNonDefaults",
            new RequiredFields()
                .setRequiredBool(true)
                .setRequiredDuration("7200s")
                .setRequiredFieldMask("required_string,required_int32")
                .setRequiredInt32(42L)
                .setRequiredInt64(1234567890123456789L)
                .setRequiredListValue(new ArrayList<>())
                .setRequiredMessage(new NestedMessage())
                .setRequiredString("non_default_string")
                .setRequiredStruct(new HashMap<>())
                .setRequiredTimestamp("2023-12-31T23:59:59Z")
                .setRequiredValue("{}")
                .setTestRequiredEnum(TestEnum.TEST_ENUM_TWO),
            "{"
                + "  \"required_string\": \"non_default_string\","
                + "  \"required_int32\": 42,"
                + "  \"required_int64\": 1234567890123456789,"
                + "  \"required_bool\": true,"
                + "  \"required_message\": {},"
                + "  \"required_value\": \"{}\","
                + "  \"required_list_value\": [],"
                + "  \"required_struct\": {},"
                + "  \"test_required_enum\": \"TEST_ENUM_TWO\","
                + "  \"required_duration\": \"7200s\","
                + "  \"required_field_mask\": \"required_string,required_int32\","
                + "  \"required_timestamp\": \"2023-12-31T23:59:59Z\""
                + "}"));
    cases.add(
        new MarshallTestCase(
            "RequiredFieldsWithNestedMessage",
            new RequiredFields()
                .setRequiredMessage(new NestedMessage().setOptionalString("nested_value")),
            "{"
                + "    \"required_message\": {"
                + "      \"optional_string\": \"nested_value\""
                + "    }"
                + "  }"));
    cases.add(
        new MarshallTestCase(
            "RepeatedString",
            new RepeatedFields().setRepeatedString(Arrays.asList("item1", "item2", "item3")),
            "{" + "  \"repeated_string\": [\"item1\", \"item2\", \"item3\"]" + "}"));
    cases.add(
        new MarshallTestCase(
            "RepeatedInt32",
            new RepeatedFields().setRepeatedInt32(Arrays.asList(1L, 2L, 3L, 4L, 5L)),
            "{" + "  \"repeated_int32\": [1, 2, 3, 4, 5]" + "}"));
    cases.add(
        new MarshallTestCase(
            "RepeatedInt64",
            new RepeatedFields()
                .setRepeatedInt64(Arrays.asList(1000000000000000000L, 2000000000000000000L)),
            "{" + "  \"repeated_int64\": [1000000000000000000, 2000000000000000000]" + "}"));
    cases.add(
        new MarshallTestCase(
            "RepeatedBool",
            new RepeatedFields().setRepeatedBool(Arrays.asList(true, false, true)),
            "{" + "  \"repeated_bool\": [true, false, true]" + "}"));
    cases.add(
        new MarshallTestCase(
            "RepeatedEnum",
            new RepeatedFields()
                .setTestRepeatedEnum(Arrays.asList(TestEnum.TEST_ENUM_ONE, TestEnum.TEST_ENUM_TWO)),
            "{" + "  \"test_repeated_enum\": [\"TEST_ENUM_ONE\", \"TEST_ENUM_TWO\"]" + "}"));
    cases.add(
        new MarshallTestCase(
            "RepeatedNestedMessage",
            new RepeatedFields()
                .setRepeatedMessage(
                    Arrays.asList(
                        new NestedMessage().setOptionalString("nested1"),
                        new NestedMessage().setOptionalString("nested2"))),
            "{"
                + "  \"repeated_message\": ["
                + "    {"
                + "      \"optional_string\": \"nested1\""
                + "    },"
                + "    {"
                + "      \"optional_string\": \"nested2\""
                + "    }"
                + "  ]"
                + "}"));
    cases.add(
        new MarshallTestCase(
            "RepeatedDuration",
            new RepeatedFields().setRepeatedDuration(Arrays.asList("60s", "120s", "180s")),
            "{" + "  \"repeated_duration\": [\"60s\", \"120s\", \"180s\"]" + "}"));
    cases.add(
        new MarshallTestCase(
            "RepeatedFieldMask",
            new RepeatedFields().setRepeatedFieldMask(Arrays.asList("field1", "field2,field3")),
            "{" + "  \"repeated_field_mask\": [\"field1\", \"field2,field3\"]" + "}"));
    cases.add(
        new MarshallTestCase(
            "RepeatedTimestamp",
            new RepeatedFields()
                .setRepeatedTimestamp(
                    Arrays.asList("2023-01-01T00:00:00Z", "2023-01-02T00:00:00Z")),
            "{"
                + "  \"repeated_timestamp\": [\"2023-01-01T00:00:00Z\", \"2023-01-02T00:00:00Z\"]"
                + "}"));
    cases.add(
        new MarshallTestCase(
            "MultipleRepeatedFields",
            new RepeatedFields()
                .setRepeatedBool(Arrays.asList(true, false))
                .setRepeatedInt32(Arrays.asList(10L, 20L, 30L))
                .setRepeatedString(Arrays.asList("a", "b", "c")),
            "{"
                + "  \"repeated_string\": [\"a\", \"b\", \"c\"],"
                + "  \"repeated_int32\": [10, 20, 30],"
                + "  \"repeated_bool\": [true, false]"
                + "}"));
    cases.add(
        new MarshallTestCase(
            "EmptyRepeatedFields",
            new RepeatedFields().setRepeatedString(new ArrayList<>()),
            "{" + "    \"repeated_string\": []" + "  }"));
    cases.add(new MarshallTestCase("OptionalFieldsNoInput", new OptionalFields(), "{}"));
    cases.add(
        new MarshallTestCase(
            "OptionalFieldsZeroValues",
            new OptionalFields()
                .setOptionalBool(false)
                .setOptionalInt32(0L)
                .setOptionalInt64(0L)
                .setOptionalString(""),
            "{"
                + "    \"optional_int32\": 0,"
                + "    \"optional_int64\": 0,"
                + "    \"optional_bool\": false,"
                + "    \"optional_string\": \"\""
                + "  }"));
    cases.add(
        new MarshallTestCase(
            "LegacyWellKnownTypes",
            new OptionalFields()
                .setLegacyDuration("1s")
                .setLegacyFieldMask("legacy_duration,legacy_timestamp")
                .setLegacyTimestamp("2023-01-01T00:00:00Z"),
            "{"
                + "  \"legacy_duration\": \"1s\","
                + "  \"legacy_timestamp\": \"2023-01-01T00:00:00Z\","
                + "  \"legacy_field_mask\": \"legacy_duration,legacy_timestamp\""
                + "}"));
    return cases;
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("marshallTestCases")
  void testMarshall(MarshallTestCase testCase) throws Exception {
    String result = objectMapper.writeValueAsString(testCase.input);

    // Parse both JSONs and compare as JsonNodes - more forgiving of formatting differences
    JsonNode expectedJson = objectMapper.readTree(testCase.output);
    JsonNode actualJson = objectMapper.readTree(result);
    assertEquals(expectedJson, actualJson);
  }
}
