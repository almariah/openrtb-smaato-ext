/*
 * Copyright 2017 Adalloc Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.adalloc.openrtb;

import static com.google.openrtb.json.OpenRtbJsonUtils.endArray;
import static com.google.openrtb.json.OpenRtbJsonUtils.getCurrentName;
import static com.google.openrtb.json.OpenRtbJsonUtils.startArray;

import com.fasterxml.jackson.core.JsonParser;

import com.google.openrtb.OpenRtb.BidRequest.Imp;
import com.google.openrtb.json.OpenRtbJsonExtComplexReader;
import java.io.IOException;

import com.adalloc.openrtb.SmaatoExt;
import com.adalloc.openrtb.SmaatoExt.ImpExt;

/**
 * Reader for {@link ImpExt}.
 */
class ImpExtReader extends OpenRtbJsonExtComplexReader<Imp.Builder, ImpExt.Builder> {

  public ImpExtReader() {
    super(SmaatoExt.imp, false, "strictbannersize");
  }

  @Override protected void read(ImpExt.Builder ext, JsonParser par) throws IOException {
    switch (getCurrentName(par)) {
      case "strictbannersize":
        par.nextToken();
        ext.setStrictbannersize(par.getValueAsBoolean());
        break;
    }
  }
}
