/*
 * Copyright 2000-2008 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.tfsIntegration.ui;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MergeNameDialog extends DialogWrapper {
  private MergeNameForm myMergeNameForm;
  private String myLocalName;
  private String myServerName;
  private String mySelectedName;

  public MergeNameDialog(String localName, String serverName) {
    super(false);
    myLocalName = localName;
    myServerName = serverName;
    setTitle("Merge Changes");
    setResizable(true);
    init();
  }

  @Nullable
  protected JComponent createCenterPanel() {
    myMergeNameForm = new MergeNameForm(myLocalName, myServerName);
    return myMergeNameForm.getPanel();
  }


  public String getSelectedName() {
    return myMergeNameForm.getSelectedName();
  }

  // TODO: validate selected name!!!
}
