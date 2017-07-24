package bobo.erp.controllerNoAuth;

import bobo.erp.domain.User;
import bobo.erp.service.LoginCheckService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by 59814 on 2017/7/18.
 */
@Controller
public class MainController {
    private Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private LoginCheckService loginCheckService;

    @GetMapping(value = "/")
    public String fromIndex(){
        return "login";
    }

    @PostMapping(value = "/usercheck")
    public String userCheck(@Valid User user, BindingResult bindingResult, Model model, HttpSession session){
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            logger.info("表单格式错误");
            return null;
        }else{
//            String result = loginCheckService.loginCheck(user, model, session);
//            return result;
            return loginCheckService.loginCheck(user, model, session);
        }
    }


}
