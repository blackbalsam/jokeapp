package com.example.joke.jokeapp.controllers.impl;

import com.example.joke.jokeapp.controllers.JokeController;
import com.example.joke.jokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeControllerImpl implements JokeController {

    private final JokeService jokeService;

    public JokeControllerImpl(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @Override
    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
