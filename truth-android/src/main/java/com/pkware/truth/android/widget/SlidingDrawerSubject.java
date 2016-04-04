/*
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

import android.view.View;
import android.widget.SlidingDrawer;

import com.google.common.truth.FailureStrategy;
import com.google.common.truth.SubjectFactory;
import com.pkware.truth.android.view.AbstractViewGroupSubject;

import static com.google.common.truth.Truth.assertThat;

/**
 * Propositions for {@link SlidingDrawer} subjects.
 */
public class SlidingDrawerSubject
    extends AbstractViewGroupSubject<SlidingDrawerSubject, SlidingDrawer> {
  protected SlidingDrawerSubject(FailureStrategy failureStrategy, SlidingDrawer subject) {
    super(failureStrategy, subject);
  }

  public static SubjectFactory<SlidingDrawerSubject, SlidingDrawer> type() {
    return new SubjectFactory<SlidingDrawerSubject, SlidingDrawer>() {
      @Override
      public SlidingDrawerSubject getSubject(FailureStrategy fs, SlidingDrawer that) {
        return new SlidingDrawerSubject(fs, that);
      }
    };
  }

  public SlidingDrawerSubject hasContent(View view) {
    assertThat(getSubject().getContent())
        .named("content")
        .isSameAs(view);
    return this;
  }

  public SlidingDrawerSubject hasHandle(View view) {
    assertThat(getSubject().getHandle())
        .named("handle")
        .isSameAs(view);
    return this;
  }

  public SlidingDrawerSubject isMoving() {
    assertThat(getSubject().isMoving())
        .named("is moving")
        .isTrue();
    return this;
  }

  public SlidingDrawerSubject isNotMoving() {
    assertThat(getSubject().isMoving())
        .named("is moving")
        .isFalse();
    return this;
  }

  public SlidingDrawerSubject isOpened() {
    assertThat(getSubject().isMoving())
        .named("is opened")
        .isTrue();
    return this;
  }

  public SlidingDrawerSubject isClosed() {
    assertThat(getSubject().isMoving())
        .named("is opened")
        .isFalse();
    return this;
  }
}
