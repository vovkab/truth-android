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
package com.pkware.truth.android.view.animation;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LayoutAnimationController;

import com.google.common.truth.FailureMetadata;
import com.google.common.truth.Subject;

import static com.google.common.truth.Truth.assertThat;

public abstract class AbstractLayoutAnimationControllerSubject<S extends AbstractLayoutAnimationControllerSubject<S, T>, T extends LayoutAnimationController>
    extends Subject<S, T> {
  protected AbstractLayoutAnimationControllerSubject(FailureMetadata failureMetadata, T subject) {
    super(failureMetadata, subject);
  }

  public S hasAnimation(Animation animation) {
    assertThat(actual().getAnimation())
        .named("animation")
        .isSameAs(animation);
    //noinspection unchecked
    return (S) this;
  }

  public S hasDelay(float delay, float tolerance) {
    float actualDelay = actual().getDelay();
    assertThat(actual().getDelay())
        .named("delay")
        .isWithin(tolerance)
        .of(delay);
    //noinspection unchecked
    return (S) this;
  }

  public S hasInterpolator(Interpolator interpolator) {
    assertThat(actual().getInterpolator())
        .named("interpolator")
        .isSameAs(interpolator);
    //noinspection unchecked
    return (S) this;
  }

  public S hasOrder(int order) {
    assertThat(actual().getOrder())
        .named("order")
        .isEqualTo(order);
    //noinspection unchecked
    return (S) this;
  }

  public S isDone() {
    assertThat(actual().isDone())
        .named("is done")
        .isTrue();
    //noinspection unchecked
    return (S) this;
  }

  public S isNotDone() {
    assertThat(actual().isDone())
        .named("is done")
        .isFalse();
    //noinspection unchecked
    return (S) this;
  }

  public S isOverlapping() {
    assertThat(actual().willOverlap())
        .named("is overlapping")
        .isTrue();
    //noinspection unchecked
    return (S) this;
  }

  public S isNotOverlapping() {
    assertThat(actual().willOverlap())
        .named("is overlapping")
        .isFalse();
    //noinspection unchecked
    return (S) this;
  }
}
