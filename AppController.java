package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class AppController {

	 @Autowired
	    private PersonService service;
	     
	    // handler methods...
	 @RequestMapping("/")
	 public String viewHomePage(Model model) {
	     List<Person> listPerson = service.listAll();
	     model.addAttribute("listPerson", listPerson);
	      
	     return "index";
	 }
	 
	 @RequestMapping("/new")
	 public String showNewProductPage(Model model) {
	     Person person = new Person();
	     model.addAttribute("person", person);
	      
	     return "new_person";
	 }
	 
	 
	 
	 @RequestMapping(value = "/save", method = RequestMethod.POST)
	 public String saveProduct(@ModelAttribute("person") Person person) {
	     service.save(person);
	      
	     return "redirect:/";
	 }
	 
	 @RequestMapping("/edit/{id}")
	 public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
	     ModelAndView mav = new ModelAndView("edit_person");
	     Object person = service.get(id);
	     mav.addObject("person", person);
	      
	     return mav;
	 }
	 
	 @RequestMapping("/delete/{id}")
	 public String deletePerson(@PathVariable(name = "id") int id) {
	     service.delete(id);
	     return "redirect:/";       
	 }
	 
	 @RequestMapping("/CheckAddress")
	 public String showAddressPage(Model model) {
	     Address address = new Address();
	     model.addAttribute("address", address);
	      
	     return "addressList";
	 }
	 
	 @RequestMapping("/new_CheckAddress")
	 public String showNewAddressPage(Model model) {
	     Address address = new Address();
	     model.addAttribute("address", address);
	      
	     return "addaddress";
	 }
	 
	 @RequestMapping("/new_editaddress")
	 public String showeditaddress(Model model) {
	     Address address = new Address();
	     model.addAttribute("address", address);
	      
	     return "edit_address";
	 }
}