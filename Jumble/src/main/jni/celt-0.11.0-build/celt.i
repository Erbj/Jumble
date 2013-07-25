/* File : celt.i */

%module CELT11

/* JNI load library, inserted in module java class */
%pragma(java) jniclasscode=%{
  static {
      System.loadLibrary("celt11");
  }
%}

%import ../audio_types.i

/* Support celt_encoder_ctl use of variable length arguments */
%varargs(int* value) celt_encoder_ctl;

%{
#include <celt_types.h>
#include <celt.h>
%}

/* Rename some CELT types to differentiate them by version */
%rename(CELT11Decoder) CELTDecoder;
struct CELTDecoder {};
%rename(CELT11Encoder) CELTEncoder;
struct CELTEncoder {};
%rename(CELT11Mode) CELTMode;
struct CELTMode {};

%include "../celt-0.11.0-src/libcelt/celt_types.h"
%include "../celt-0.11.0-src/libcelt/celt.h"