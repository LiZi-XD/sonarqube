/*
 * SonarQube
 * Copyright (C) 2009-2017 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonarqube.ws.client.webservices;

import java.util.List;
import javax.annotation.Generated;

/**
 * List web services
 *
 * This is part of the internal API.
 * This is a POST request.
 * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/webservices/list">Further information about this action online (including a response example)</a>
 * @since 4.2
 */
@Generated("https://github.com/SonarSource/sonar-ws-generator")
public class ListRequest {

  private String includeInternals;

  /**
   * Include web services that are implemented for internal use only. Their forward-compatibility is not assured
   *
   * Possible values:
   * <ul>
   *   <li>"true"</li>
   *   <li>"false"</li>
   *   <li>"yes"</li>
   *   <li>"no"</li>
   * </ul>
   */
  public ListRequest setIncludeInternals(String includeInternals) {
    this.includeInternals = includeInternals;
    return this;
  }

  public String getIncludeInternals() {
    return includeInternals;
  }
}
