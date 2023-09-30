/**
 * @author xuant
 * @author xuant
 * @author xuant
 * @author xuant
 * @author xuant
 * @author xuant
 * @author xuant
 * @author xuant
 * @author xuant
 * @author xuant
 * @author xuant
 * @author xuant
 * @author xuant
 * @author xuant
 */

/**
 * @author xuant
 *
 */
package com.xuanthongn.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sinhvien")
public class SinhVienController {

//    @Autowired
//    private SinhVienService sinhVienService;
//    @Autowired
//    private KhoaHocService khoaHocService;
//
//    @GetMapping("/add")
//    public String showAddSinhVienForm(Model model) {
//        List<Department> departments = khoaHocService.getKhoaHocs();
//        model.addAttribute("khoahocList", departments);
//        model.addAttribute("sinhvien", new User());
//        return "add-sinhvien";
//    }
//
//    @PostMapping("/add")
//    public String addSinhVien(@ModelAttribute("sinhvien") User sinhvien) {
//        sinhVienService.saveSinhVien(sinhvien);
//        return "redirect:/";
//    }
//
//    @GetMapping("/edit/{id}")
//    public ModelAndView showEditSinhVienForm(@PathVariable("id") Long id) {
//        ModelAndView modelAndView = new ModelAndView("update-sinhvien");
//        User sinhvien = sinhVienService.getSinhVien(id).orElseThrow(() -> new IllegalArgumentException("Invalid SinhVien ID"));
//        List<Department> departments = khoaHocService.getKhoaHocs();
//        modelAndView.addObject("khoahocList", departments);
//        modelAndView.addObject("sinhvien", sinhvien);
//        return modelAndView;
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteSinhVien(@PathVariable("id") Long id) {
//        sinhVienService.deleteSinhVien(id);
//        return "redirect:/";
//    }
}