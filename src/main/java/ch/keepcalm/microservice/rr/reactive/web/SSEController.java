/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package ch.keepcalm.microservice.rr.reactive.web;

import ch.keepcalm.microservice.rr.reactive.tweet.Tweet;
import ch.keepcalm.microservice.rr.reactive.tweet.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;
import reactor.core.publisher.Flux;


@Controller
public class SSEController {

    TweetRepository tweetRepository;

    @Autowired
    public SSEController(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }


    @RequestMapping("/events")
    public String events(final Model model) {
        final Flux<Tweet> tweetStream = this.tweetRepository.findAll();

        final IReactiveDataDriverContextVariable dataDriver =
                new ReactiveDataDriverContextVariable(tweetStream, 1, 1);


        model.addAttribute("data", dataDriver);
        return "events";
    }
}
