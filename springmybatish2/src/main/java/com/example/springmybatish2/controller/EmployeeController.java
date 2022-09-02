package com.example.springmybatish2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmybatish2.entity.Employee;
import com.example.springmybatish2.repository.EmployeeMapper;

@Controller
public class EmployeeController {

		@Autowired
		EmployeeMapper empRepo;
		
//		@GetMapping("/getAll")
//		public List<Employee> getAllEmp(){
//			return empRepo.getAllEmployees();
//		}
		
		@GetMapping("/listEmp")
		public ModelAndView listEmp() {
			ModelAndView mav=new ModelAndView("listEmp");
			
			mav.addObject("employeesList",empRepo.getAllEmployees());
			
			return mav;
		}
		
		@GetMapping("/addEmployeeForm")
		public ModelAndView assEmployee() {
			ModelAndView mav=new ModelAndView("addEmployee");
			mav.addObject("employee",new Employee());
			return mav;
		}
		
//		@PostMapping("/saveEmployee")
//		public String saveEmployee(@RequestParam String firstName,
//								@RequestParam("lastName") String lastName,
//								@RequestParam("email") String emailId) {
//			
//			Employee emp= new Employee(10014,firstName,lastName,emailId);
//			empRepo.insert(emp);
//			return "redirect:/listEmp";
//			
//		}
		
		@PostMapping("/saveEmployee")
		public String saveEmployee(@ModelAttribute("employee") Employee emp) {
			
			
			int count=empRepo.count();
			emp.setId(10010+count+1);
			empRepo.insert(emp);
			return "redirect:/listEmp";
			}
		
		@RequestMapping("/deleteEmployeeForm")
		public String deleteEmpform() {
			return "deleteEmployee";
		}
	    
		@PostMapping("/deleteEmployee")
		public String deleteEmp(@RequestParam("id") int id) {
			
			empRepo.delete(id);
			return "redirect:/listEmp";
		}
		
		@RequestMapping("/updateEmailForm")
		public String updateEmpForm() {
			return "updateEmpEmail";
		}
		
		@PostMapping("/updateEmail")
		public String updateEmail(@RequestParam int id,
				@RequestParam String email) {
			
			empRepo.updateEmail(id, email);
			return"redirect:/listEmp";
		}
}
