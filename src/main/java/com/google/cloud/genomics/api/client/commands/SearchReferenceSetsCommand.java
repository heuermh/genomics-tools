/*
Copyright 2014 Google Inc. All rights reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.cloud.genomics.api.client.commands;

import com.beust.jcommander.Parameters;
import com.google.api.services.genomics.Genomics;
import com.google.api.services.genomics.model.SearchReferenceSetsRequest;
import com.google.cloud.genomics.utils.Paginator;

import java.io.IOException;

@Parameters(commandDescription = "Get all available reference sets")
public class SearchReferenceSetsCommand extends SearchCommand {

  @Override
  public void handleRequest(Genomics genomics) throws IOException {
    SearchReferenceSetsRequest request = new SearchReferenceSetsRequest()
        .setPageSize(getMaxResults());

    printResults(Paginator.ReferenceSets.create(genomics), request);
  }
}
