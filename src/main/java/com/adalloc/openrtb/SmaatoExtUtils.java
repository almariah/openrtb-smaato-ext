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

import com.adalloc.openrtb.SmaatoExt;
import com.adalloc.openrtb.SmaatoExt.BidRequestExt;
import com.adalloc.openrtb.SmaatoExt.ImpExt;

import com.google.openrtb.OpenRtb.BidRequest.Imp;
import com.google.openrtb.OpenRtb.BidRequest;

import com.google.openrtb.json.OpenRtbJsonFactory;

/**
 * Utilities to support the Smaato/OpenRTB extensions.
 */
public class SmaatoExtUtils {

  /**
   * Configures a JSON factory with support for the {@link SmaatoExt} extensions.
   */
  public static OpenRtbJsonFactory registerSmaatoExt(OpenRtbJsonFactory factory) {
    return factory
        .register(new ImpExtReader(), Imp.Builder.class)
        .register(new ImpExtWriter(), ImpExt.class, Imp.class)
        .register(new BidRequestExtReader(), BidRequest.Builder.class)
        .register(new BidRequestExtWriter(), BidRequestExt.class, BidRequest.class);
  }
}
