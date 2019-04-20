package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/money")
public class CurrencyConversion {
    @GetMapping
    public String moneyForm(){
        return "moneyForm";
    }

    @PostMapping
    public ModelAndView resultConvert(HttpServletRequest request){
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));

        float vnd = rate*usd;

        ModelAndView modelAndView = new ModelAndView("resultConvert");
        modelAndView.addObject("vnd",vnd);
        modelAndView.addObject("usd",usd);

        return modelAndView;
    }
}
