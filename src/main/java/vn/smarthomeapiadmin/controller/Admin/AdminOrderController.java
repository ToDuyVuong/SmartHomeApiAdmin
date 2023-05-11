package vn.smarthomeapiadmin.controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vn.smarthomeapiadmin.entity.Order;
import vn.smarthomeapiadmin.service.*;

@RestController
@RequestMapping("/order")
public class AdminOrderController {
    @Autowired
    IProductService productService;
    @Autowired
    ICategoryService categoryService;
    @Autowired
    IProductImageService productImageService;
    @Autowired
    IOrderService orderService;
    @Autowired
    IOrderItemService orderItemService;

    @GetMapping("/list")
    public ModelAndView showOrder(ModelMap modelMap) {
        modelMap.addAttribute("orders", orderService.findAll());
        return new ModelAndView("list-order");
    }


    @RequestMapping("/status/{orderId}")
    public ModelAndView changeStatus(@PathVariable("orderId") Integer orderId) {
        Order order = orderService.findById(orderId).get();
        System.out.println(order.getStatus().getValue());
        switch (order.getStatus().getValue()) {
            case 0:
                order.setStatus(Order.Status.PROCESSING);
                break;
            case 1:
                order.setStatus(Order.Status.DELIVERING);
                break;
            case 2:
                order.setStatus(Order.Status.DELIVERED);
                break;
            case 3:
                order.setStatus(Order.Status.CANCELED);
                break;
            case 4:
                order.setStatus(Order.Status.PENDING);
                break;
        }

        orderService.save(order);
        return new ModelAndView ("redirect:/order/list");
    }

}
