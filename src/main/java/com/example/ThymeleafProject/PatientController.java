package com.example.ThymeleafProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/patients")
class PatientController {

    private List<ItemObj> patients = new ArrayList<>();

    @GetMapping
    public String getAllPatients(Model model) {
        model.addAttribute("patients", patients);
        return "patients";
    }

    @PostMapping
    public String addPatient(@ModelAttribute ItemObj patient) {
        patients.add(patient);
        return "redirect:/patients";
    }

    @GetMapping("/{id}")
    public String getPatient(@PathVariable int id, Model model) {
        model.addAttribute("patient", patients.get(id));
        return "patient";
    }

    @PostMapping("/{id}")
    public String deletePatient(@PathVariable int id) {
        patients.remove(id);
        return "redirect:/patients";
    }
}

