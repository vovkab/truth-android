/*
 * Copyright 2013 Square, Inc.
 * Copyright 2016 PKWARE, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pkware.truth.android.app;

import android.app.Instrumentation;
import android.content.Intent;

import com.google.common.truth.FailureMetadata;
import com.google.common.truth.Subject;

import static com.google.common.truth.Truth.assertThat;

/**
 * Propositions for {@link Instrumentation.ActivityResult} subjects.
 */
public class InstrumentationActivityResultSubject extends Subject<InstrumentationActivityResultSubject, Instrumentation.ActivityResult> {
  protected InstrumentationActivityResultSubject(FailureMetadata failureMetadata, Instrumentation.ActivityResult subject) {
    super(failureMetadata, subject);
  }

  public static Subject.Factory<InstrumentationActivityResultSubject, Instrumentation.ActivityResult> type() {
    return new Subject.Factory<InstrumentationActivityResultSubject, Instrumentation.ActivityResult>() {
      @Override
      public InstrumentationActivityResultSubject createSubject(FailureMetadata fm, Instrumentation.ActivityResult that) {
        return new InstrumentationActivityResultSubject(fm, that);
      }
    };
  }

  public InstrumentationActivityResultSubject hasResultCode(int code) {
    assertThat(actual().getResultCode())
        .named("result code")
        .isEqualTo(code);
    return this;
  }

  public InstrumentationActivityResultSubject hasResultData(Intent intent) {
    assertThat(actual().getResultData())
        .named("result data")
        .isEqualTo(intent);
    return this;
  }
}
