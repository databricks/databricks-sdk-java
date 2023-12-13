package com.databricks.sdk.examples;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.service.iam.Group;
import com.databricks.sdk.service.iam.ListAccountGroupsRequest;

public class ListAccountGroupsExample {
  public static void main(String[] args) {
    AccountClient a = new AccountClient();

    for (Group g : a.groups().list((new ListAccountGroupsRequest()))) {
      System.out.println(g.getDisplayName());
    }
  }
}
