package com.hky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hky.service.QuadraticEquationService;

// QuadraticEquationController.java
@RestController
@RequestMapping("/quadratic")
public class QuadraticEquationController {

	@Autowired
	private QuadraticEquationService quadraticEquationService;

	@GetMapping("/roots")
	public ResponseEntity<double[]> calculateRoots(@RequestParam double a, @RequestParam double b,
			@RequestParam double c) {

		double[] roots = quadraticEquationService.calculateRoots(a, b, c);
		return ResponseEntity.ok(roots);
	}
	public  String getApp(){
		return  null;
	}
}
