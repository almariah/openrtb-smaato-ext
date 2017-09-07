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

import static com.google.openrtb.json.OpenRtbJsonUtils.getCurrentName;

import com.adalloc.openrtb.SmaatoExt;
import com.adalloc.openrtb.SmaatoExt.BidRequestExt;

import com.google.openrtb.OpenRtb.BidRequest;
import com.google.openrtb.json.OpenRtbJsonExtComplexReader;

import com.fasterxml.jackson.core.JsonParser;

import java.io.IOException;

/**
 * Reader for {@link BidRequestExt}.
 */
class BidRequestExtReader
extends OpenRtbJsonExtComplexReader<BidRequest.Builder, BidRequestExt.Builder> {

  public BidRequestExtReader() {
    super(SmaatoExt.bidRequest, false, "udi", "operaminibrowser", "carriername", "x_uidh", "coppa");
  }

  @Override protected void read(BidRequestExt.Builder ext, JsonParser par) throws IOException {
    switch (getCurrentName(par)) {
      case "udi":
        ext.setUdi(SmaatoJsonUtils.readUniqueDeviceIdContainer(par));
      case "operaminibrowser":
        par.nextToken();
        ext.setOperaminibrowser(par.getValueAsBoolean());
        break;
      case "carriername":
        ext.setCarriername(par.nextTextValue());
        break;
      case "x_uidh":
        ext.setXUidh(par.nextTextValue());
        break;
      case "coppa":
        par.nextToken();
        ext.setCoppa(par.getValueAsBoolean());
        break;
    }
  }
}
