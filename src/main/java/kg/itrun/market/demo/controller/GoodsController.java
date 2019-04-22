package kg.itrun.market.demo.controller;



import kg.itrun.market.demo.entity.Goods;
import kg.itrun.market.demo.repository.GoodsRepository;
import kg.itrun.market.demo.repository.Goods_typesRepository;
import kg.itrun.market.demo.repository.PricesRepository;
import kg.itrun.market.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import javax.validation.Valid;

@Controller
public class GoodsController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private PricesRepository pricesRepository;

    @Autowired
    private Goods_typesRepository goods_typesRepository;

    /*@GetMapping("/")
    public String getMainPageGoods(Model model){
        model.addAttribute("goods", goodsRepository.findAll());
        return "index";
    }*/
    @GetMapping("/newgoods")
    public String showFormGoods(Goods goods, Model model){
        return "add-goods";
    }

    @PostMapping("/addgoods")
    public String addGoods(@Valid Goods goods, BindingResult result, Model model){
        if (result.hasErrors()){
            return "add-goods";
        }
        goodsRepository.save(goods);
        model.addAttribute("goods", goodsRepository.findAll());
        model.addAttribute("users", userRepository.findAll());
        return "index";
    }
    @GetMapping("/editgoods/{id}")
    public String showUpdateFormGoods(@PathVariable Integer id, Model model){
        Goods goods = goodsRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Invalid goods id" + id));
        model.addAttribute("goods", goods);
        return "update-goods";
    }

    @PostMapping("/updategoods/{id}")
    public String updateGoods(@PathVariable Integer id, @Valid Goods goods, BindingResult result, Model model){
        if (result.hasErrors()){
            goods.setId(id);
            return "update-goods";
        }
        goodsRepository.save(goods);
        model.addAttribute("goods", goodsRepository.findAll());
        model.addAttribute("users", userRepository.findAll());
        return "index";
    }
    @GetMapping("/deletegoods/{id}")
    public String deleteGoods(@PathVariable Integer id, Model model){
        Goods goods = goodsRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Ivalid user id" + id));
        goodsRepository.delete(goods);
        model.addAttribute("goods", goodsRepository.findAll());
        model.addAttribute("users", userRepository.findAll());
        return "index";
    }
   /*@GetMapping("/findgoods/{id]")
    public String findGoods()
*/
}
