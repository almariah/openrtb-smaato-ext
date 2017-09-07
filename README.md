Smaato Extensions for OpenRTB
=============================

Overview
--------

This library supports Smaato OpenRTB (JSON) extensions for [Google OpenRTB](https://github.com/google/openrtb) (protobuf). It has implementation for serialization and deserialization of Smaato latest bid request
extensions (JSON). [You can find the extensions on Smaato's DSP Integration site Resources](https://wiki.smaato.com/pages/viewpage.action?pageId=852061).


Usage
-----

First, the JSON factory should be created using OpenRtbJsonFactory class of [Google OpenRTB](https://github.com/google/openrtb):

```java
OpenRtbJsonFactory jsonFactory = OpenRtbJsonFactory.create();
```

Then register all Smaato extensions (ImpExt and BidRequestExt):

```java
SmaatoExtUtils.registerSmaatoExt(jsonFactory);
```
To deserialize a bid request from input stream for example:

```java
BidRequest bidRequest = jsonFactory.newReader()
      .readBidRequest(inputStream)

Boolean strictbannersize = bidRequest.getImp(0)
      .getExtension(SmaatoExt.imp)
      .getStrictbannersize();

String androidid = bidRequest.getExtension(SmaatoExt.bidRequest)
      .getUdi()
      .getAndroidid();
````

To serialize a bid response to JSON string for example:

```java
String jsonResponse = jsonFactory.newWriter().writeBidResponse(bidResponse);
```

Future work
-----------

The library has not yet been hosted on any Maven public repository. It should be build and
provided by Maven local repository. Also, the tests has not yet been implemented.
