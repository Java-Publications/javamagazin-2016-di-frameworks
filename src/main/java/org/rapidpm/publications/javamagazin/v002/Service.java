package org.rapidpm.publications.javamagazin.v002;

import kotlin.reflect.jvm.internal.impl.javax.inject.Inject;

/**
 * Copyright (C) 2010 RapidPM
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Created by RapidPM - Team on 01.10.16.
 */
public class Service {

  private SubService worker;

  public Service() {
  }

  public Service(final SubService worker) {
    this.worker = worker;
  }

  public void setWorker(final SubService worker) {
    this.worker = worker;
  }

  public String workOn(String txt) {
    return worker.work(txt);
  }

}
