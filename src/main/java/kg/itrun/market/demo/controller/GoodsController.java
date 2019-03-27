package kg.itrun.market.demo.controller;

import kg.itrun.market.demo.entity.Goods;
import kg.itrun.market.demo.repository.GoodsRepository;
import kg.itrun.market.demo.repository.Goods_typesRepository;
import kg.itrun.market.demo.repository.PricesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class GoodsController {
    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private PricesRepository pricesRepository;

    @Autowired
    private Goods_typesRepository goods_typesRepository;

    @PostMapping("/addgoods")
    public String addGoods(@Valid Goods goods, BindingResult result, Model model){
        if (result.hasErrors()){
            return "add-goods";
        }
        goodsRepository.save(goods);
        model.addAttribute("goods", goodsRepository.findAll());
        return "index";
    }

    /*
      @PostMapping("/adduser")
    public String addUser(@Valid User user, BindingResult result, Model model){
        if (result.hasErrors()){
            return "add-user";
        }

        userRepository.save(user);
        model.addAttribute("users", userRepository.findAll());
        return "index";
    }
     */
}
