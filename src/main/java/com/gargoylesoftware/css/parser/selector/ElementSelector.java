/*
 * Copyright (c) 2018 Ronald Brill.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gargoylesoftware.css.parser.selector;

import java.io.Serializable;

import com.gargoylesoftware.css.parser.AbstractLocatable;
import com.gargoylesoftware.css.parser.Locator;

/**
 * @author Ronald Brill
 */
public class ElementSelector extends AbstractLocatable implements SimpleSelector, Serializable {

    private final String localName_;

    public ElementSelector(final String localName, final Locator locator) {
        localName_ = localName;
        setLocator(locator);
    }

    @Override
    public SelectorType getSelectorType() {
        return SelectorType.ELEMENT_NODE_SELECTOR;
    }

    public String getLocalName() {
        return localName_;
    }

    @Override
    public String toString() {
        final String localeName = getLocalName();
        if (localeName == null) {
            return "*";
        }
        return localeName;
    }
}