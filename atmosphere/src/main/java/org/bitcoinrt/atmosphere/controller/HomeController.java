/*
 * Copyright 2002-2013 the original author or authors
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */
package org.bitcoinrt.atmosphere.controller;

import javax.servlet.http.HttpServletResponse;

import org.atmosphere.cpr.AtmosphereResource;
import org.bitcoinrt.atmosphere.AtmosphereUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 *
 * @author Gunnar Hillert
 */
@Controller
@RequestMapping
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/")
	public String home() {
		return "home";
	}

	/**
	 * Responsible for suspending the {@link HttpServletResponse}.
	 */
	@RequestMapping(value = "/websockets", method = RequestMethod.GET)
	@ResponseBody
	public void websockets(AtmosphereResource resource) throws Exception {
		AtmosphereUtils.suspend(resource);
	}

	/**
	 * Responsible for suspending the {@link HttpServletResponse}.
	 */
	@RequestMapping(value = "/websockets", method = RequestMethod.POST)
	@ResponseBody
	public void websocketsPost(AtmosphereResource resource) throws Exception {
		//
	}

}

