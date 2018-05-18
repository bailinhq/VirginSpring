package application.controllers.admin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MakeReservationController {



    @RequestMapping(value = "/admin/nuevareservacion", method = RequestMethod.GET)
    public ModelAndView getMakeReservation(ModelAndView mv){
        mv.setViewName("/admin/nuevareservacion");
        return mv;
    }

}
