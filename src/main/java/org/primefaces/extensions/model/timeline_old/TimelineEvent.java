/*
 * Copyright 2012 PrimeFaces Extensions.
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
 *
 * $Id$
 */

package org.primefaces.extensions.model.timeline_old;

import java.util.Date;

/**
 * DOCUMENT_ME
 *
 *
 * @author  Nilesh Namdeo Mali / last modified by $Author$
 * @version $Revision$
 * @since   0.3
 */
public interface TimelineEvent {

	String getId();

	void setId(String id);

	String getTitle();

	Date getStartDate();

	Date getEndDate();

	void setEndDate(Date endDate);

	String getStyleClass();

	void setStyleClass(String styleClass);
}
