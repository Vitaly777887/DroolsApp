package org.chuzhinov;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/*
Разработка ЭС с помощью Drools для конфигурации ИТ-инфраструктуры Компании
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("company", new ItemCompany());
        return "index";
    }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    String result(@Valid ItemCompany itemCompany, Model model, BindingResult bindingResult) {
        //   if (bindingResult.hasErrors()){
        //      return "index";
        // }
        DroolsService.fireRules(itemCompany);
        model.addAttribute("company", itemCompany);
        return "result";
    }
}