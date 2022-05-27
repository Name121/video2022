//package com.ZhangYM.springcloud.controller;
//
//import java.util.Arrays;
//import java.util.Map;
//
//import com.ZhangYM.entities.ResponseBean;
//import com.ZhangYM.entities.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//
//
///**
// *
// *
// * @author zhangYM
// * @date 2022-05-19 15:54:14
// */
//@RestController
//@RequestMapping("ware/user")
//public class UserController {
//    @Autowired
//    private UserService userService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    public ResponseBean list(User user){
//        PageUtils page = userService.queryPage(user);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    public ResponseBean info(@PathVariable("id") Integer id){
//		User user = userService.getById(id);
//
//        return R.ok().put("user", user);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    public ResponseBean save(@RequestBody User user){
//		userService.save(user);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    public ResponseBean update(@RequestBody User user){
//		userService.updateById(user);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    public ResponseBean delete(@RequestBody Integer[] ids){
//		userService.removeByIds(Arrays.asList(ids));
//
//        return ResponseBean.success();
//    }
//
//}
