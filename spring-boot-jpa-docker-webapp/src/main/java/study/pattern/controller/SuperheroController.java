package study.pattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import study.pattern.repository.SuperheroRepository;

@Controller
@RequestMapping("/superhero")
public class SuperheroController {
    @Autowired
    private SuperheroRepository repository;

    @RequestMapping
    public ModelAndView getSuperheroes() {
        return new ModelAndView("superheroes", "superheroes", repository.findAll());
    }
}
