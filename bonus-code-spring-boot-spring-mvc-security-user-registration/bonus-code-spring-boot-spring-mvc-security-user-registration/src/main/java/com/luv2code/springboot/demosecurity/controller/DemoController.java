package com.luv2code.springboot.demosecurity.controller;

import com.luv2code.springboot.demosecurity.entity.Address;
import com.luv2code.springboot.demosecurity.entity.FeedBack;
import com.luv2code.springboot.demosecurity.service.AddressService;
import com.luv2code.springboot.demosecurity.service.FeedBackService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DemoController {
    private FeedBackService feedBackService;

    private AddressService addressService;
    public DemoController(FeedBackService theFeedBackService,AddressService theAddressService){
        feedBackService=theFeedBackService;
        addressService=theAddressService;
    }
    @GetMapping("/")
    public String showHome() {

        return "home";
    }

    // add a request mapping for /leaders

    @GetMapping("/leaders")
    public String showLeaders() {

        return "leaders";
    }

    // add request mapping for /systems

    @GetMapping("/systems")
    public String showSystems() {

        return "systems";
    }

    @GetMapping("/feedBack")
    public String ShowFeedBackForm(Model theModel){
        FeedBack theFeedBack=new FeedBack();
        theModel.addAttribute("feed",theFeedBack);
        return "feedBack";
    }

    @PostMapping("/save")
    public String saveFeed(@ModelAttribute("feed") FeedBack theFeedBack){
        feedBackService.save(theFeedBack);
        return "redirect:/";
    }

    @GetMapping("/review")
    public String review(Model theModel){
        List<FeedBack> theFeedBack = feedBackService.findAll();

        theModel.addAttribute("feed",theFeedBack);

        return "review";
    }

    @GetMapping("/medicine")
    public String medicine(Model theModel){
        return "medicine";
    }

    @GetMapping("/orders")
    public String order(Model theModel){
        Address theAddress=new Address();
        theModel.addAttribute("add" , theAddress);
        return "Order";
    }

    @GetMapping("/payment")
    public String payment(){
        return "Payment";
    }

    @PostMapping("/saveAdd")
    public String address(@ModelAttribute("add") Address theAddress){
        addressService.save(theAddress);
        if("Cash_on_Delivery".equals(theAddress.getMethod())){
            return "Confirmation";
        }
        else{
            return "Payment";
        }
        //return "redirect:/payment";

    }


}









