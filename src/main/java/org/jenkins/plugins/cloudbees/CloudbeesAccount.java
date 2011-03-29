/*
 * Copyright 2010-2011, CloudBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jenkins.plugins.cloudbees;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * @author <a href="mailto:Olivier.LAMY@accor.com">Olivier Lamy</a>
 * @version $
 */
public class CloudbeesAccount
{
    public final String name;

    public final String apiKey;

    public final String secretKey;


    @DataBoundConstructor
    public CloudbeesAccount(String name, String apiKey, String secretKey) {
        System.out.println("new CloudbeesAccount");
        this.name = name;
        this.apiKey = apiKey;
        this.secretKey = secretKey;
    }

    @Override
    public String toString()
    {
        // TODO for debug so remove print stuff
        return "CloudbeesAccount{" + "name='" + name + '\'' + ", apiKey='" + apiKey + '\'' + ", secretKey='" + secretKey
            + '\'' + '}';
    }

}