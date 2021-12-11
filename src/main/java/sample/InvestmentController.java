package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.sql.SQLException;
@SessionAttributes({"id","name","dep","nyears","savtype"})
@RequestMapping
@Controller
public class InvestmentController {

    @Autowired
    SavingsService service;

    @RequestMapping(value="/investment",method = RequestMethod.GET)
    public String showInvestmentpage(ModelMap model) throws ClassNotFoundException, SQLException{
        model.addAttribute("todos",service.retrieveTodos());
        return "investment";
    }
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String showInvestmentPage2(ModelMap model) throws ClassNotFoundException,SQLException{
        model.addAttribute("todos",service.retrieveTodos());
        return "investment";
    }

    @RequestMapping(value="/add-todo",method = RequestMethod.GET)
    public String showtodopage(){
        return "investser";
    }

    @RequestMapping(value="/add-todo",method = RequestMethod.POST)
    public String addTodo(ModelMap model, @RequestParam String custcode,@RequestParam String custname,@RequestParam Double custdep,@RequestParam int nyears,@RequestParam String savingstype) {
        service.addTodo(custcode, custname, custdep, nyears, savingstype);

        model.clear();
        return "redirect:/investment";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.GET)
    public String showUpdateTodoPage(ModelMap model,  @RequestParam(defaultValue = "") String id) throws SQLException, ClassNotFoundException{

        model.put("id", id);

        Savings cc = service.retrieve(id);

        model.put("id",cc.getSavingscode());
        model.put("name", cc.getCustname());
        model.put("dep", cc.getCdep());
        model.put("nyears", cc.getNyears());
        model.put("savtype", cc.getSavingstype());
        return "investser";
    }



    @RequestMapping(value = "/update-todo", method = RequestMethod.POST)
    public String showUpdate(ModelMap model,  @RequestParam String custcode,@RequestParam String custname,@RequestParam Double custdep,@RequestParam int nyears,@RequestParam String savingstype) throws SQLException, ClassNotFoundException {

//        get the old catcode

        String iid = (String) model.get("id");

        //Savings cc = new Savings(custcode, custname,custdep,nyears,savingstype);

        service.deleteTodo(iid);

        service.addTodo(custcode,custname,custdep,nyears,savingstype);
        return "redirect:/";
    }

    @RequestMapping(value ="/delete-todo", method = RequestMethod.GET)
    public String deleteTodo(ModelMap model, @RequestParam String custcode) throws SQLException, ClassNotFoundException {

        service.deleteTodo(custcode);

        model.clear();
        return "redirect:/";
    }



}
