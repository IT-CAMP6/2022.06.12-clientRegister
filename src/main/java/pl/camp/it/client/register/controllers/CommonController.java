package pl.camp.it.client.register.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.camp.it.client.register.database.DB;
import pl.camp.it.client.register.model.Client;

@Controller
public class CommonController {

    @Autowired
    DB database;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(Model model) {
        return "main";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("client", new Client());
        return "createForm";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(@ModelAttribute Client client) {
        this.database.addClient(client);
        return "redirect:/";
    }

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public String clients(Model model) {
        model.addAttribute("clients", database.getClients());
        return "clients";
    }
}
