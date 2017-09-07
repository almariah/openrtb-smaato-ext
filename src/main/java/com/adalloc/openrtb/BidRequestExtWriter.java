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

import com.adalloc.openrtb.SmaatoExt.BidRequestExt;
import com.google.openrtb.json.OpenRtbJsonExtWriter;
import com.google.openrtb.json.OpenRtbJsonUtils;
import com.fasterxml.jackson.core.JsonGenerator;

import java.io.IOException;

/**
 * Writer for {@link BidRequestExt}.
 */
class BidRequestExtWriter extends OpenRtbJsonExtWriter<BidRequestExt> {

  @Override protected void write(BidRequestExt ext, JsonGenerator gen) throws IOException {
    if (ext.hasUdi()) {
      gen.writeFieldName("udi");
      SmaatoJsonUtils.writeUniqueDeviceIdContainer(ext.getUdi(), gen);
    }

    if (ext.hasOperaminibrowser()) {
      OpenRtbJsonUtils.writeIntBoolField("operaminibrowser", ext.getOperaminibrowser(), gen);
    }

    if (ext.hasCarriername()) {
      gen.writeStringField("carriername", ext.getCarriername());
    }

    if (ext.hasXUidh()) {
      gen.writeStringField("x_uidh", ext.getXUidh());
    }

    if (ext.hasCoppa()) {
      OpenRtbJsonUtils.writeIntBoolField("coppa", ext.getCoppa(), gen);
    }
  }
}
