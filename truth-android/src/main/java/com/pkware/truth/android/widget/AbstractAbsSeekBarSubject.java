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
package com.pkware.truth.android.widget;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.widget.AbsSeekBar;

import com.google.common.truth.FailureMetadata;

import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static com.google.common.truth.Truth.assertThat;

public abstract class AbstractAbsSeekBarSubject<S extends AbstractAbsSeekBarSubject<S, T>, T extends AbsSeekBar>
    extends AbstractProgressBarSubject<S, T> {
  protected AbstractAbsSeekBarSubject(FailureMetadata failureMetadata, T subject) {
    super(failureMetadata, subject);
  }

  public S hasKeyProgressIncrement(int increment) {
    assertThat(actual().getKeyProgressIncrement())
        .named("key progress increment")
        .isEqualTo(increment);
    //noinspection unchecked
    return (S) this;
  }

  @TargetApi(JELLY_BEAN)
  public S hasThumb(Drawable drawable) {
    assertThat(actual().getThumb())
        .named("thumb")
        .isSameAs(drawable);
    //noinspection unchecked
    return (S) this;
  }

  public S hasThumbOffset(int offset) {
    assertThat(actual().getThumbOffset())
        .named("thumb offset")
        .isEqualTo(offset);
    //noinspection unchecked
    return (S) this;
  }
}
