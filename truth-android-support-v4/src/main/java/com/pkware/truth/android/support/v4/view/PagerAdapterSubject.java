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
package com.pkware.truth.android.support.v4.view;

import android.support.v4.view.PagerAdapter;

import com.google.common.truth.FailureMetadata;
import com.google.common.truth.Subject;

import static com.google.common.truth.Truth.assertThat;

/**
 * Propositions for {@link PagerAdapter} subjects.
 */
public class PagerAdapterSubject extends Subject<PagerAdapterSubject, PagerAdapter> {
  protected PagerAdapterSubject(FailureMetadata failureMetadata, PagerAdapter subject) {
    super(failureMetadata, subject);
  }

  public static Subject.Factory<PagerAdapterSubject, PagerAdapter> type() {
    return new Subject.Factory<PagerAdapterSubject, PagerAdapter>() {
      @Override
      public PagerAdapterSubject createSubject(FailureMetadata fm, PagerAdapter that) {
        return new PagerAdapterSubject(fm, that);
      }
    };
  }

  public PagerAdapterSubject hasCount(int count) {
    assertThat(actual().getCount())
        .named("count")
        .isEqualTo(count);
    return this;
  }
}
