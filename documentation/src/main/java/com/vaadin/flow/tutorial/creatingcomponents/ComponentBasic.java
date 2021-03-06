/*
 * Copyright 2000-2017 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.flow.tutorial.creatingcomponents;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasEnabled;
import com.vaadin.flow.component.Synchronize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.tutorial.annotations.CodeFor;

@CodeFor("creating-components/tutorial-component-basic.asciidoc")
public class ComponentBasic extends Component {

    @Tag("input")
    public class TextField extends Component {

        public TextField(String value) {
            getElement().setProperty("value", value);
        }

        @Synchronize("change")
        public String getValue() {
            return getElement().getProperty("value");
        }

        public void setValue(String value) {
            getElement().setProperty("value", value);
        }
    }

    @Override
    public void onEnabledStateChanged(boolean enabled) {
        setDisabled(!enabled);
        refreshButtons();
    }

    private void setDisabled(boolean disabled) {
        // NO-OP
    }
    private void refreshButtons() {
        // NO-OP
    }
}
