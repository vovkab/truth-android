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
package com.pkware.truth.android.view;

import android.view.ViewGroup;

import com.google.common.truth.FailureMetadata;
import com.google.common.truth.Subject;

/**
 * Propositions for {@link android.view.ViewGroup.LayoutParams} subjects.
 * <p/>
 * This class is final. To extend use {@link AbstractViewGroupLayoutParamsSubject}.
 */
public final class ViewGroupLayoutParamsSubject
    extends AbstractViewGroupLayoutParamsSubject<ViewGroupLayoutParamsSubject, ViewGroup.LayoutParams> {
  private ViewGroupLayoutParamsSubject(FailureMetadata failureMetadata, ViewGroup.LayoutParams subject) {
    super(failureMetadata, subject);
  }

  public static Subject.Factory<ViewGroupLayoutParamsSubject, ViewGroup.LayoutParams> type() {
    return new Subject.Factory<ViewGroupLayoutParamsSubject, ViewGroup.LayoutParams>() {
      @Override
      public ViewGroupLayoutParamsSubject createSubject(FailureMetadata fm, ViewGroup.LayoutParams that) {
        return new ViewGroupLayoutParamsSubject(fm, that);
      }
    };
  }
}
